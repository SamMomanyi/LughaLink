package com.lughalink.core.designsystem.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/**
 * A small triangle/chevron motif in the spirit of Khanga/Kitenge border patterns. This is
 * procedurally built, not traced from a real textile — the asset list in your project doc
 * points to SVG Repo / The Noun Project for authentic Khanga-pattern SVGs, which this sandbox
 * has no network access to fetch. Treat this as a working placeholder: same call site
 * (`HeritageSurface(showPattern = true)`), swap the path data below once you have a real one.
 *
 * Tint and opacity are the caller's job (HeritageSurface applies ~5% opacity), so this vector
 * is defined with a neutral single-tone fill.
 */
val LughaLinkTextilePattern: ImageVector
    get() = ImageVector.Builder(
        name = "LughaLinkTextilePattern",
        defaultWidth = 96.dp,
        defaultHeight = 96.dp,
        viewportWidth = 96f,
        viewportHeight = 96f,
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            // Row of alternating up/down triangles, repeated 4x across a 96x96 tile.
            for (col in 0 until 4) {
                val x = col * 24f
                moveTo(x, 24f)
                lineTo(x + 12f, 0f)
                lineTo(x + 24f, 24f)
                close()
                moveTo(x, 24f)
                lineTo(x + 12f, 48f)
                lineTo(x + 24f, 24f)
                close()
            }
            for (col in 0 until 4) {
                val x = col * 24f
                moveTo(x, 72f)
                lineTo(x + 12f, 48f)
                lineTo(x + 24f, 72f)
                close()
                moveTo(x, 72f)
                lineTo(x + 12f, 96f)
                lineTo(x + 24f, 72f)
                close()
            }
        }
    }.build()