package com.lughalink.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

/*
 * On the Styles API (Compose Foundation 1.12 / BOM 2026.04.01+, still behind
 * @OptIn(ExperimentalFoundationStyleApi::class) as of this writing): it's real, but it solves
 * a different problem than this file does. It replaces *behavioral, state-based* styling
 * (how a button's shadow/scale animates between pressed/hovered/focused) — not *token
 * distribution* (getting a color/type/shape scale down to every composable in the tree),
 * which is exactly what MaterialTheme + CompositionLocalProvider already do well and is what
 * this file is responsible for. It's also still experimental with multiplatform support not
 * yet stable, which matters for a KMP module meant to run on more than just Android.
 * Recommendation: leave this file on the stable MaterialTheme API, and reach for Style{} later
 * inside individual interactive components (LughaLinkPrimaryButton's press/hover feel is a good
 * candidate) once it's out of alpha — happy to wire that in as a follow-up.
 */

/**
 * Root theme wrapper for LughaLink. Wrap your app content in this once, at the top.
 *
 * ```
 * LughaLinkTheme {
 *     // your screens
 * }
 * ```
 */
@Composable
fun LughaLinkTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) LughaLinkDarkColorScheme else LughaLinkLightColorScheme
    val brand = if (darkTheme) LughaLinkBrandColorsDark else LughaLinkBrandColorsLight
    val spacing = LughaLinkSpacing()

    CompositionLocalProvider(
        LocalLughaLinkSpacing provides spacing,
        LocalLughaLinkBrandColors provides brand,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = lughaLinkTypography(),
            shapes = LughaLinkShapes,
            content = content,
        )
    }
}

/**
 * Convenience accessor mirroring `MaterialTheme.colorScheme` / `MaterialTheme.typography`, for
 * the token sets Material 3 doesn't natively carry (spacing, pill shape).
 *
 * Usage: `LughaLinkTheme.spacing.md`, `LughaLinkTheme.pillShape`.
 */
object LughaLinkTheme {
    val spacing: LughaLinkSpacing
        @Composable get() = LocalLughaLinkSpacing.current

    val pillShape
        @Composable get() = LughaLinkPillShape

    internal val brand: LughaLinkBrandColors
        @Composable get() = LocalLughaLinkBrandColors.current
}

private val LocalLughaLinkBrandColors = staticCompositionLocalOf { LughaLinkBrandColorsDark }