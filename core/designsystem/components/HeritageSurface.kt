package com.lughalink.core.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp

/**
 * Reusable card surface. Set [showPattern] to true for "featured" cards — draws the textile
 * motif at ~5% opacity in the top-right corner, per the brand doc's pattern-usage rule
 * (4–6% opacity, inverted per theme so it stays a texture rather than a focal point).
 */
@Composable
fun HeritageSurface(
    modifier: Modifier = Modifier,
    showPattern: Boolean = false,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.large, // 8dp — "large containers" per the brand doc
        color = MaterialTheme.colorScheme.surfaceContainer,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
    ) {
        Box {
            content()

            if (showPattern) {
                Image(
                    painter = rememberVectorPainter(LughaLinkTextilePattern),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(96.dp),
                    colorFilter = ColorFilter.tint(
                        MaterialTheme.colorScheme.onSurface.copy(alpha = 0.05f),
                    ),
                )
            }
        }
    }
}