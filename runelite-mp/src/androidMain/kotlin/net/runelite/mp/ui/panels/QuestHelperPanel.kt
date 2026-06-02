package net.runelite.mp.ui.panels

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import net.runelite.mp.ui.RlPalette
import net.runelite.mp.ui.bridge.RuneLiteAccess

/**
 * Quest Helper — a stripped-down quest browser. The desktop panel is huge (step-by-step
 * directions with inline item icons, filter sidebar, dev-mode state override, etc); the
 * mobile port surfaces the most common loop: list every quest with status + difficulty,
 * filter by name/state, tap to start that quest's helper.
 *
 * Step content + item icons aren't surfaced here — the actual in-game overlay does its
 * own rendering through the OSRS interface. Once a quest is "started" via Quest Helper,
 * the mobile UI shows it as `Active`.
 */
@Composable
internal fun QuestHelperPanel()
{
    var quests by remember { mutableStateOf<List<QuestHelperBridge.Row>>(emptyList()) }
    var query by remember { mutableStateOf("") }
    var stateFilter by remember { mutableStateOf(QuestStateFilter.ALL) }
    var loading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit)
    {
        loading = true
        quests = withContext(Dispatchers.Default) { QuestHelperBridge.list() }
        loading = false
        while (true)
        {
            delay(3000)
            quests = withContext(Dispatchers.Default) { QuestHelperBridge.list() }
        }
    }

    val active = quests.firstOrNull { it.active }

    PanelScaffold(
        title = "Quest Helper",
        subtitle = when
        {
            loading -> "Loading quest list…"
            active != null -> "Active: ${active.name}"
            else -> "${quests.size} quest(s)"
        },
        scrollable = false,
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            if (active != null)
            {
                ActiveBanner(active) { QuestHelperBridge.stop() }
                Spacer(Modifier.size(8.dp))
            }
            PanelTextInput(value = query, placeholder = "Filter by name", onChange = { query = it })
            Spacer(Modifier.size(6.dp))
            Row {
                FilterPillBtn("All", stateFilter == QuestStateFilter.ALL) { stateFilter = QuestStateFilter.ALL }
                Spacer(Modifier.size(4.dp))
                FilterPillBtn("Not started", stateFilter == QuestStateFilter.NOT_STARTED) { stateFilter = QuestStateFilter.NOT_STARTED }
                Spacer(Modifier.size(4.dp))
                FilterPillBtn("In progress", stateFilter == QuestStateFilter.IN_PROGRESS) { stateFilter = QuestStateFilter.IN_PROGRESS }
                Spacer(Modifier.size(4.dp))
                FilterPillBtn("Done", stateFilter == QuestStateFilter.FINISHED) { stateFilter = QuestStateFilter.FINISHED }
            }
            Spacer(Modifier.size(6.dp))
            val q = query.trim().lowercase()
            val filtered = quests.asSequence()
                .filter { row ->
                    val stateOk = when (stateFilter)
                    {
                        QuestStateFilter.ALL -> true
                        QuestStateFilter.NOT_STARTED -> row.state == "NOT_STARTED"
                        QuestStateFilter.IN_PROGRESS -> row.state == "IN_PROGRESS"
                        QuestStateFilter.FINISHED -> row.state == "FINISHED"
                    }
                    val nameOk = q.isEmpty() || row.name.lowercase().contains(q)
                    stateOk && nameOk
                }
                .toList()
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(filtered, key = { it.key }) { row ->
                    QuestRow(row, onStart = { QuestHelperBridge.startQuest(row.key) })
                    PanelDivider()
                }
            }
        }
    }
}

private enum class QuestStateFilter { ALL, NOT_STARTED, IN_PROGRESS, FINISHED }

@Composable
private fun ActiveBanner(row: QuestHelperBridge.Row, onStop: () -> Unit)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(RlPalette.AccentSurface)
            .padding(10.dp),
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text("ACTIVE", color = Color.White, fontSize = 9.sp, fontWeight = FontWeight.Bold)
            Text(row.name, color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
        }
        PanelButton(label = "Stop", onClick = onStop)
    }
}

@Composable
private fun FilterPillBtn(label: String, active: Boolean, onClick: () -> Unit)
{
    Box(
        Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(if (active) RlPalette.AccentSurface else RlPalette.MediumGray)
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 4.dp),
    ) {
        Text(
            label,
            color = if (active) Color.White else RlPalette.TextSecondary,
            fontSize = 10.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
private fun QuestRow(row: QuestHelperBridge.Row, onStart: () -> Unit)
{
    val (label, color) = when (row.state)
    {
        "FINISHED" -> "Done" to Color(0xFF8FE188)
        "IN_PROGRESS" -> "In progress" to Color(0xFFFFC857)
        else -> "Not started" to RlPalette.TextSecondary
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = row.state != "FINISHED", onClick = onStart)
            .padding(vertical = 8.dp),
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                row.name,
                color = if (row.active) Color(0xFFFFC857) else RlPalette.TextPrimary,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Row {
                Text(label, color = color, fontSize = 10.sp)
                if (row.difficulty.isNotEmpty())
                {
                    Text(
                        " · ${row.difficulty.lowercase().replaceFirstChar { it.uppercase() }}",
                        color = RlPalette.TextSecondary, fontSize = 10.sp,
                    )
                }
            }
        }
        if (row.state != "FINISHED")
        {
            Box(
                Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(RlPalette.MediumGray)
                    .clickable(onClick = onStart)
                    .padding(horizontal = 8.dp, vertical = 4.dp),
            ) {
                Text("Start", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

internal object QuestHelperBridge
{
    data class Row(
        val key: String,
        val name: String,
        val state: String,
        val difficulty: String,
        val active: Boolean,
    )

    /**
     * Resolve the REGISTERED QuestHelperPlugin instance, not a fresh-from-root-injector
     * copy. PluginManager creates a child Guice injector for each plugin
     * (PluginManager.loadPlugin → `parent.createChildInjector`); the root injector
     * therefore returns a brand-new QH whose `questManager` is unwired — clicks land on
     * a QuestManager that isn't subscribed to the EventBus, doesn't have a
     * ClientThread queued, and doesn't know about whatever the active quest is. The
     * actual live plugin (with its child injector and tick-mutated state) is the one
     * PluginManager.getPlugins() exposes.
     */
    private fun plugin(): Any? = RuneLiteAccess.registeredPluginByName(
        "net.runelite.client.plugins.questhelper.QuestHelperPlugin"
    )

    private fun questManager(): Any?
    {
        val p = plugin() ?: return null
        return try
        {
            val field = p.javaClass.getDeclaredField("questManager").apply { isAccessible = true }
            field.get(p)
        }
        catch (t: Throwable) { null }
    }

    private fun questEnumClass(): Class<*>? = try
    {
        Class.forName("net.runelite.client.plugins.questhelper.questinfo.QuestHelperQuest")
    }
    catch (t: Throwable) { null }

    fun list(): List<Row>
    {
        val cls = questEnumClass() ?: return emptyList()
        val client = RuneLiteAccess.instance(net.runelite.api.Client::class.java)
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java)
        val activeName = currentActiveName()
        val getState = try
        {
            cls.getDeclaredMethod("getState", net.runelite.api.Client::class.java,
                net.runelite.client.config.ConfigManager::class.java)
        }
        catch (t: Throwable) { null }
        val values = try { cls.getMethod("values").invoke(null) as? Array<*> } catch (t: Throwable) { null }
            ?: return emptyList()
        return values.mapNotNull { entry ->
            if (entry == null) return@mapNotNull null
            try
            {
                val name = cls.getMethod("getName").invoke(entry) as? String ?: return@mapNotNull null
                val difficulty = try
                {
                    cls.getMethod("getDifficulty").invoke(entry)?.toString() ?: ""
                }
                catch (t: Throwable) { "" }
                val state = try
                {
                    if (getState != null && client != null && cm != null)
                        getState.invoke(entry, client, cm)?.toString() ?: "NOT_STARTED"
                    else "NOT_STARTED"
                }
                catch (t: Throwable) { "NOT_STARTED" }
                Row(
                    key = (entry as Enum<*>).name,
                    name = name,
                    state = state,
                    difficulty = difficulty,
                    active = name.equals(activeName, ignoreCase = true),
                )
            }
            catch (t: Throwable) { null }
        }
    }

    fun startQuest(enumKey: String)
    {
        val tag = "QuestHelperBridge"
        val cls = questEnumClass() ?: run {
            android.util.Log.w(tag, "startQuest($enumKey): QuestHelperQuest class not on classpath")
            return
        }
        val target = try
        {
            cls.enumConstants?.firstOrNull { (it as Enum<*>).name == enumKey }
        }
        catch (t: Throwable) { android.util.Log.w(tag, "startQuest enumConstants", t); null } ?: run {
            android.util.Log.w(tag, "startQuest($enumKey): no enum constant matched")
            return
        }
        val helper = try { cls.getMethod("getQuestHelper").invoke(target) }
            catch (t: Throwable) { android.util.Log.w(tag, "getQuestHelper invoke", t); null }
            ?: run {
                android.util.Log.w(tag, "startQuest($enumKey): getQuestHelper returned null")
                return
            }
        val qm = questManager() ?: run {
            android.util.Log.w(tag, "startQuest($enumKey): questManager unavailable")
            return
        }
        try
        {
            // Walk QuestManager's declared methods to find startUpQuest with a 2-arg
            // (QuestHelper, boolean) shape — getMethod() requires an exact parameter
            // class match, and depending on which classloader saw `QuestHelper` first
            // the Class<?> we look up via `Class.forName` and the one QuestManager was
            // compiled against can be the same name from different loaders. Matching
            // by method name + arg count avoids that whole class-identity rabbit hole.
            val startUp = qm.javaClass.methods.firstOrNull { m ->
                m.name == "startUpQuest" && m.parameterCount == 2
                    && (m.parameterTypes[1] == Boolean::class.javaPrimitiveType
                        || m.parameterTypes[1] == java.lang.Boolean.TYPE)
            } ?: run {
                android.util.Log.w(tag, "startQuest($enumKey): no startUpQuest(QuestHelper, boolean) found on ${qm.javaClass.name}")
                return
            }
            startUp.invoke(qm, helper, true)
            android.util.Log.i(tag, "startQuest($enumKey): dispatched")
        }
        catch (t: Throwable)
        {
            android.util.Log.w(tag, "startQuest($enumKey): startUpQuest invoke failed", t)
        }
    }

    fun stop()
    {
        val qm = questManager() ?: return
        try
        {
            // QH's actual API is `shutDownQuest(boolean shouldUpdateList)` (camel-case
            // D — easy to miss). Match by method name + single boolean arg so we don't
            // care if it ever moves between classloaders.
            val m = qm.javaClass.methods.firstOrNull { it ->
                it.name == "shutDownQuest" && it.parameterCount == 1
                    && it.parameterTypes[0] == java.lang.Boolean.TYPE
            } ?: run {
                android.util.Log.w("QuestHelperBridge", "stop: no shutDownQuest(boolean) on ${qm.javaClass.name}")
                return
            }
            m.invoke(qm, true)
        }
        catch (t: Throwable)
        {
            android.util.Log.w("QuestHelperBridge", "stop: shutDownQuest invoke failed", t)
        }
    }

    private fun currentActiveName(): String?
    {
        val qm = questManager() ?: return null
        return try
        {
            val getter = listOf("getSelectedQuest", "getCurrentQuestHelper", "getCurrentQuest")
                .firstNotNullOfOrNull {
                    try { qm.javaClass.getMethod(it) } catch (t: Throwable) { null }
                } ?: return null
            val v = getter.invoke(qm) ?: return null
            // QuestHelper exposes getQuest().getName() — try a couple of shapes
            try
            {
                val quest = v.javaClass.getMethod("getQuest").invoke(v)
                quest?.javaClass?.getMethod("getName")?.invoke(quest) as? String
            }
            catch (t: Throwable)
            {
                v.javaClass.getMethod("getName").invoke(v) as? String
            }
        }
        catch (t: Throwable) { null }
    }
}
