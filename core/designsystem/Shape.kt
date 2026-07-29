package com.lughalink.core.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * "Soft (0.25rem)" shape language. Standard components (buttons, inputs) round to 4dp,
 * large containers (cards, modals) to 8dp, outer wrappers to 12dp. Pill shapes are reserved
 * for chips/badges only — primary buttons stay rectangular-ish per the brand doc.
 */
val LughaLinkShapes: Shapes = Shapes(
    extraSmall = RoundedCornerShape(2.dp),  // rounded.sm  — 0.125rem
    small = RoundedCornerShape(4.dp),       // rounded.DEFAULT — 0.25rem — buttons, inputs
    medium = RoundedCornerShape(6.dp),      // rounded.md — 0.375rem
    large = RoundedCornerShape(8.dp),       // rounded.lg — 0.5rem — cards, modals
    extraLarge = RoundedCornerShape(12.dp), // rounded.xl — 0.75rem — outer wrappers
)

/** rounded.full — chips, badges, avatars. Not part of M3 Shapes; use directly. */
val LughaLinkPillShape: RoundedCornerShape = RoundedCornerShape(percent = 50)