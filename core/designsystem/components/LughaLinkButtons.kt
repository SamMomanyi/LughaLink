package com.lughalink.core.designsystem.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/**
 * Shared press feedback: a subtle 1.02x scale-up rather than a color shift, per the brand doc.
 * Every filled/outlined button below uses this instead of its own copy.
 */
@Composable
private fun rememberPressScale(interactionSource: MutableInteractionSource): Float {
    val pressed by interactionSource.collectIsPressedAsState()
    return animateFloatAsState(if (pressed) 1.02f else 1f, label = "lughalink_button_scale").value
}

/** Filled action button — Maasai Red background, white text. The main call-to-action. */
@Composable
fun LughaLinkPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val scale = rememberPressScale(interactionSource)

    Button(
        onClick = onClick,
        modifier = modifier.graphicsLayer { scaleX = scale; scaleY = scale },
        enabled = enabled,
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.buttonColors(
            containerColor = LughaLinkTheme.brand.maasaiRed,
            contentColor = LughaLinkTheme.brand.onMaasaiRed,
        ),
        interactionSource = interactionSource,
    ) {
        Text(text)
    }
}

/**
 * Outlined action — Savannah Gold border and text, per the brand doc ("Secondary buttons are
 * outlined in Savannah Gold"). Use for the second most important action on a screen.
 */
@Composable
fun LughaLinkSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val scale = rememberPressScale(interactionSource)

    OutlinedButton(
        onClick = onClick,
        modifier = modifier.graphicsLayer { scaleX = scale; scaleY = scale },
        enabled = enabled,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(1.dp, LughaLinkTheme.brand.savannahGold),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = LughaLinkTheme.brand.savannahGold,
        ),
        interactionSource = interactionSource,
    ) {
        Text(text)
    }
}

/**
 * Inverted button — fills with the theme's inverse-surface tone (light-on-dark in light mode,
 * dark-on-light in dark mode). Matches the "Inverted" swatch in your style-guide preview.
 * Use this for a button that needs to sit on top of a saturated/colored panel (e.g. inside a
 * red hero banner) where another red button would disappear.
 */
@Composable
fun LughaLinkInvertedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val scale = rememberPressScale(interactionSource)

    Button(
        onClick = onClick,
        modifier = modifier.graphicsLayer { scaleX = scale; scaleY = scale },
        enabled = enabled,
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.inverseSurface,
            contentColor = MaterialTheme.colorScheme.inverseOnSurface,
        ),
        interactionSource = interactionSource,
    ) {
        Text(text)
    }
}

/**
 * Neutral outlined button — bordered in `outline`, no brand-color tint. Matches "How it works"
 * on the landing-page mockup: a lower-emphasis alternative next to a primary CTA, without
 * competing for attention the way a gold-bordered [LughaLinkSecondaryButton] would.
 */
@Composable
fun LughaLinkOutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val scale = rememberPressScale(interactionSource)

    OutlinedButton(
        onClick = onClick,
        modifier = modifier.graphicsLayer { scaleX = scale; scaleY = scale },
        enabled = enabled,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        interactionSource = interactionSource,
    ) {
        Text(text)
    }
}

/**
 * Muted filled button in the tertiary/gold-container tone — approximates the "Select" buttons
 * on the language-picker mockup (a filled, lower-saturation gold/olive tone, distinct from the
 * bright-gold [LughaLinkSecondaryButton] outline). Flagging: I don't have an exact hex for that
 * button from the mockup, so this reads from `tertiaryContainer`/`onTertiaryContainer` as the
 * closest existing token pair — swap the color source here if you have the precise value.
 */
@Composable
fun LughaLinkTertiaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val scale = rememberPressScale(interactionSource)

    Button(
        onClick = onClick,
        modifier = modifier.graphicsLayer { scaleX = scale; scaleY = scale },
        enabled = enabled,
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
        ),
        interactionSource = interactionSource,
    ) {
        Text(text)
    }
}

/**
 * Plain text button — no fill, no border. Matches "Skip for now" on the lesson-intro mockup,
 * which reads as a low-emphasis link in an Ocean-Blue-adjacent tone.
 */
@Composable
fun LughaLinkTextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.textButtonColors(
            contentColor = LughaLinkTheme.brand.oceanBlue,
        ),
    ) {
        Text(text)
    }
}