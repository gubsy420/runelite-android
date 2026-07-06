package net.runelite.mp.ui.bridge

import net.runelite.client.config.ConfigDescriptor
import net.runelite.client.config.ConfigItemDescriptor
import net.runelite.client.config.ConfigManager

/**
 * Wraps RuneLite's [ConfigManager] so the Compose UI never deals with the typed reflection
 * API directly. Each instance is bound to a single plugin's [ConfigDescriptor] / group,
 * and exposes read/write helpers in concrete Kotlin types.
 *
 * The descriptor exposes one [ConfigItemDescriptor] per `@ConfigItem`-annotated method on
 * the plugin's config interface; we map those to either a typed primitive or an enum
 * constant. Default values fall through to the interface's default method when the user
 * has never set a value.
 */
internal class ConfigBridge(
    private val configManager: ConfigManager,
    val descriptor: ConfigDescriptor,
    private val configProxy: Any,
)
{
    val groupKey: String get() = descriptor.group.value

    /** Returns the value the user (or default) has set, coerced to [type]. */
    fun getValue(item: ConfigItemDescriptor): Any?
    {
        val raw = configManager.getConfiguration(groupKey, item.key())
        if (raw != null)
        {
            return decode(raw, item.type)
        }
        // No persisted value — call the interface's default method via the proxy so
        // booleans / enums / strings come back already typed and we don't reimplement
        // the default-resolution logic.
        return try
        {
            val ifaces = configProxy.javaClass.interfaces
            val configIface = ifaces.firstOrNull() ?: return null
            val m = configIface.getMethod(findMethodName(item))
            m.invoke(configProxy)
        }
        catch (t: Throwable)
        {
            null
        }
    }

    fun setValue(item: ConfigItemDescriptor, value: Any?)
    {
        val str = encode(value, item.type) ?: return configManager.unsetConfiguration(groupKey, item.key())
        configManager.setConfiguration(groupKey, item.key(), str)
    }

    /** Look up which interface method owns the `@ConfigItem` for this descriptor —
     *  needed so the default-method path can invoke it without a stored value. The
     *  ConfigItem annotation only carries the storage key, not the method name. */
    private fun findMethodName(item: ConfigItemDescriptor): String
    {
        val iface = configProxy.javaClass.interfaces.firstOrNull() ?: return item.key()
        for (m in iface.methods)
        {
            val ann = m.getAnnotation(net.runelite.client.config.ConfigItem::class.java)
            if (ann != null && ann.keyName == item.key()) return m.name
        }
        return item.key()
    }

    private fun decode(raw: String, type: java.lang.reflect.Type): Any?
    {
        if (type is Class<*>)
        {
            return when
            {
                type == Boolean::class.javaPrimitiveType || type == java.lang.Boolean::class.java -> raw == "true"
                type == Int::class.javaPrimitiveType || type == java.lang.Integer::class.java     -> raw.toIntOrNull()
                type == Long::class.javaPrimitiveType || type == java.lang.Long::class.java       -> raw.toLongOrNull()
                type == Double::class.javaPrimitiveType || type == java.lang.Double::class.java   -> raw.toDoubleOrNull()
                type == String::class.java                                                        -> raw
                type.isEnum -> runCatching {
                    @Suppress("UNCHECKED_CAST")
                    java.lang.Enum.valueOf(type as Class<out Enum<*>>, raw)
                }.getOrNull()
                else -> raw  // unknown — surface as String, the form will skip render
            }
        }
        return raw
    }

    private fun encode(value: Any?, type: java.lang.reflect.Type): String?
    {
        if (value == null) return null
        return when (value)
        {
            is Boolean -> value.toString()
            is Number  -> value.toString()
            is String  -> value
            is Enum<*> -> value.name
            else       -> value.toString()
        }
    }
}
