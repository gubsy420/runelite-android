package net.runelite.mp.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Canvas
import androidx.compose.ui.draw.drawBehind
import net.runelite.mp.ui.RlPalette
import kotlin.math.roundToInt

/** Left-fading row aura — same primitive ARMSX2 uses to give the rows shape without
 *  drawing a hard border around each one. */
private fun rowAura(): Brush = Brush.horizontalGradient(
    listOf(Color.White.copy(alpha = 0.05f), Color.Transparent),
)

@Composable
fun SectionHeader(title: String)
{
    Box(
        Modifier
            .fillMaxWidth()
            .padding(top = 14.dp, bottom = 4.dp, start = 6.dp, end = 6.dp),
    ) {
        Text(
            title,
            color = RlPalette.Accent,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(
            Modifier
                .fillMaxWidth()
                .height(1.dp)
                .padding(top = 16.dp)
                .background(
                    Brush.horizontalGradient(
                        listOf(RlPalette.DividerStrong, Color.Transparent),
                    ),
                ),
        )
    }
}

@Composable
fun RowLabel(label: String, description: String? = null, modifier: Modifier = Modifier)
{
    Column(modifier = modifier) {
        Text(label, color = RlPalette.TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
        if (!description.isNullOrEmpty())
        {
            Text(
                description,
                color = RlPalette.TextSecondary,
                fontSize = 11.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
fun ToggleRow(
    label: String,
    description: String?,
    value: Boolean,
    onChange: (Boolean) -> Unit,
)
{
    Box(
        Modifier
            .fillMaxWidth()
            .background(rowAura())
            .clickable { onChange(!value) }
            .padding(horizontal = 8.dp, vertical = 8.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            RowLabel(label, description, Modifier.weight(1f))
            Spacer(Modifier.size(8.dp))
            // Compact iOS-ish toggle. Track + thumb, no shadow — keeps it
            // looking native to the orange-on-dark palette.
            val trackBg = if (value) RlPalette.Accent else Color(0xFF3A3A3A)
            Box(
                Modifier
                    .size(width = 34.dp, height = 18.dp)
                    .clip(RoundedCornerShape(9.dp))
                    .background(trackBg),
                contentAlignment = if (value) Alignment.CenterEnd else Alignment.CenterStart,
            ) {
                Box(
                    Modifier
                        .size(14.dp)
                        .padding(start = if (value) 0.dp else 2.dp, end = if (value) 2.dp else 0.dp)
                        .clip(RoundedCornerShape(7.dp))
                        .background(Color.White),
                )
            }
        }
    }
}

@Composable
fun IntSliderRow(
    label: String,
    description: String?,
    value: Int,
    min: Int,
    max: Int,
    unit: String? = null,
    onChange: (Int) -> Unit,
)
{
    Box(
        Modifier
            .fillMaxWidth()
            .background(rowAura())
            .padding(horizontal = 8.dp, vertical = 8.dp),
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RowLabel(label, description, Modifier.weight(1f))
                Spacer(Modifier.size(8.dp))
                Text(
                    if (unit != null) "$value $unit" else value.toString(),
                    color = RlPalette.Accent,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(Modifier.height(4.dp))
            DiscreteSlider(value, min, max, onChange)
        }
    }
}

@Composable
private fun DiscreteSlider(value: Int, min: Int, max: Int, onChange: (Int) -> Unit)
{
    val steps = (max - min).coerceAtLeast(1)
    val frac = ((value - min).toFloat() / steps).coerceIn(0f, 1f)
    Box(
        Modifier
            .fillMaxWidth()
            .height(18.dp)
            .pointerInput(min, max) {
                val edge = 6.dp.toPx()
                detectTapGestures { p ->
                    val usable = (size.width - edge * 2).coerceAtLeast(1f)
                    val f = ((p.x - edge) / usable).coerceIn(0f, 1f)
                    onChange(min + (f * steps).roundToInt())
                }
            }
            .pointerInput(min, max) {
                val edge = 6.dp.toPx()
                detectHorizontalDragGestures { ch, _ ->
                    val usable = (size.width - edge * 2).coerceAtLeast(1f)
                    val f = ((ch.position.x - edge) / usable).coerceIn(0f, 1f)
                    onChange(min + (f * steps).roundToInt())
                }
            },
    ) {
        Canvas(Modifier.fillMaxSize()) {
            val edge = 6.dp.toPx()
            val usable = (size.width - edge * 2).coerceAtLeast(1f)
            val cy = size.height / 2f
            val track = 3.dp.toPx()
            drawRoundRect(
                color = Color.White.copy(alpha = 0.12f),
                topLeft = Offset(edge, cy - track / 2),
                size = Size(usable, track),
                cornerRadius = CornerRadius(track / 2),
            )
            drawRoundRect(
                color = RlPalette.Accent,
                topLeft = Offset(edge, cy - track / 2),
                size = Size(usable * frac, track),
                cornerRadius = CornerRadius(track / 2),
            )
            val thumbX = edge + usable * frac
            drawCircle(RlPalette.Accent.copy(alpha = 0.25f), 7.dp.toPx(), Offset(thumbX, cy))
            drawCircle(RlPalette.Accent, 5.dp.toPx(), Offset(thumbX, cy))
            drawCircle(Color.White, 1.5.dp.toPx(), Offset(thumbX, cy))
        }
    }
}

@Composable
fun SegmentedRow(
    label: String,
    description: String?,
    options: List<String>,
    selectedIndex: Int,
    onChange: (Int) -> Unit,
)
{
    Box(
        Modifier
            .fillMaxWidth()
            .background(rowAura())
            .padding(horizontal = 8.dp, vertical = 8.dp),
    ) {
        Column {
            RowLabel(label, description)
            Spacer(Modifier.height(4.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                options.forEachIndexed { idx, opt ->
                    val on = idx == selectedIndex
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(if (on) RlPalette.Accent else Color(0xFF272525).copy(alpha = 0.5f))
                            .clickable { onChange(idx) }
                            .padding(horizontal = 8.dp, vertical = 3.dp),
                    ) {
                        Text(
                            opt,
                            color = if (on) Color.White else RlPalette.TextSecondary,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TextRow(
    label: String,
    description: String?,
    value: String,
    onChange: (String) -> Unit,
)
{
    Box(
        Modifier
            .fillMaxWidth()
            .background(rowAura())
            .padding(horizontal = 8.dp, vertical = 8.dp),
    ) {
        Column {
            RowLabel(label, description)
            Spacer(Modifier.height(4.dp))
            var local by remember(value) { mutableStateOf(value) }
            BasicTextField(
                value = local,
                onValueChange = { local = it; onChange(it) },
                singleLine = true,
                textStyle = TextStyle(color = RlPalette.TextPrimary, fontSize = 13.sp),
                cursorBrush = SolidColor(RlPalette.Accent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .background(RlPalette.DarkerGray)
                    .border(1.dp, RlPalette.SurfaceBorder, RoundedCornerShape(4.dp))
                    .padding(horizontal = 8.dp, vertical = 6.dp),
            )
        }
    }
}

@Composable
fun DangerNote(text: String)
{
    Box(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(Color(0xFF3A1A1A))
            .padding(8.dp),
    ) {
        Text(text, color = RlPalette.DangerRed, fontSize = 11.sp)
    }
}
