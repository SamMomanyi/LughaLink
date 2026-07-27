package com.banja.core.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * 8dp-rhythm spacing scale. Material 3 has no native spacing subsystem, so this is provided
 * as its own token set alongside color/type/shape — read it as `BanjaTheme.spacing.md` etc.
 */
data class BanjaSpacing(
    val unit: Dp = 8.dp,
    val xs: Dp = 4.dp,
    val sm: Dp = 8.dp,
    val md: Dp = 16.dp,
    val lg: Dp = 24.dp,
    val xl: Dp = 32.dp,
    val xxl: Dp = 48.dp,
    /** Section rhythm — the brand doc calls for generous 80–120dp gaps between page sections. */
    val sectionGap: Dp = 96.dp,
    /** Screen-edge gutter on mobile. Desktop margins (64dp) apply once this ships beyond phone. */
    val screenMargin: Dp = 20.dp,
)

internal val LocalBanjaSpacing = staticCompositionLocalOf { BanjaSpacing() }