package net.runelite.mp.account

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Progress for [JagexLoginActivity] while the browser does the work.
 *
 * Plain mutable state rather than hoisted Compose parameters because the Activity drives
 * the flow from coroutines and Intent callbacks, not from composition.
 */
internal class LoginUiState
{
    var status: String? by mutableStateOf<String?>(null)
    var error: String? by mutableStateOf<String?>(null)
}

/**
 * Sign-in happens in the device's browser, so there is nothing to render here but
 * progress, whatever went wrong, and a way back out if the user closed the tab.
 */
@Composable
internal fun JagexLoginScreen(
    state: LoginUiState,
    onOpenBrowser: () -> Unit,
    onCancel: () -> Unit,
)
{
    val error = state.error
    val status = state.status

    Box(
        modifier = Modifier.fillMaxSize().background(BgDarker),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.widthIn(max = 460.dp).padding(32.dp),
        ) {
            Text(
                "Sign in to Jagex",
                color = BrandOrange,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(Modifier.height(20.dp))

            if (error == null)
            {
                CircularProgressIndicator(color = BrandOrange, modifier = Modifier.size(40.dp))
                Spacer(Modifier.height(20.dp))
                Text(
                    status ?: "Opening your browser…",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Finish signing in there and you'll be brought straight back.",
                    color = TextSecondary,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                )
            }
            else
            {
                Text(
                    error,
                    color = Color(0xFFF2A0A0),
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Spacer(Modifier.height(28.dp))
            Row(horizontalArrangement = Arrangement.Center) {
                ScreenButton(
                    label = if (error == null) "Reopen browser" else "Try again",
                    primary = error != null,
                    onClick = onOpenBrowser,
                )
                Spacer(Modifier.size(12.dp))
                ScreenButton(label = "Cancel", primary = false, onClick = onCancel)
            }
        }
    }
}

@Composable
private fun ScreenButton(label: String, primary: Boolean, onClick: () -> Unit)
{
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .then(
                if (primary) Modifier.background(BrandOrange)
                else Modifier.border(1.dp, SurfaceBorder, RoundedCornerShape(6.dp))
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 18.dp, vertical = 10.dp),
    ) {
        Text(
            label,
            color = if (primary) Color.White else TextSecondary,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}
