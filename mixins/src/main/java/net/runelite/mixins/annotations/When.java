package net.runelite.mixins.annotations;

/**
 * Position at which a {@link MethodHook} or {@link FieldHook} fires relative to the
 * thing it hooks.
 *
 * <ul>
 *   <li>{@link #BEFORE}
 *     <ul>
 *       <li>For {@code @MethodHook}: at the entry of the target method (before the
 *           method body runs).</li>
 *       <li>For {@code @FieldHook}: immediately before the {@code PUTFIELD}/
 *           {@code PUTSTATIC} write site. The hook receives the value that's about
 *           to be stored.</li>
 *     </ul>
 *   </li>
 *   <li>{@link #AFTER}
 *     <ul>
 *       <li>For {@code @MethodHook}: immediately before every {@code RETURN} in the
 *           target method's body. Hook is invoked once per return path. Hooks do NOT
 *           fire on {@code ATHROW}; if you need exception-paths too, install a
 *           try/finally inside the body (TODO).</li>
 *       <li>For {@code @FieldHook}: immediately after the write site, with the
 *           just-stored value (effectively the same value the BEFORE variant would
 *           see, but with the store already committed).</li>
 *     </ul>
 *   </li>
 * </ul>
 */
public enum When
{
	BEFORE,
	AFTER,
}
