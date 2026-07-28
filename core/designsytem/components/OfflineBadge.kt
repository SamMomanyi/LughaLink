package com.lughalink.core.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/**
 * Small pill-shaped indicator for a module that's downloaded / available offline.
 * [icon] defaults to a built-in checkmark so this compiles with no icon library dependency —
 * swap in a real download/cloud-done glyph from Lucide or Material Symbols once wired in.
 */
@Composable
fun OfflineBadge(
    modifier: Modifier = Modifier,
    label: String = "Downloaded",
    icon: ImageVector = LughaLinkCheckGlyph,
) {
    Row(
        modifier = modifier
            .background(
                color = LughaLinkTheme.brand.savannahGold.copy(alpha = 0.15f),
                shape = LughaLinkTheme.pillShape,
            )
            .padding(horizontal = 10.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = rememberVectorPainter(icon),
            contentDescription = null,
            tint = LughaLinkTheme.brand.savannahGold,
            modifier = Modifier.size(12.dp),
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall,
            color = LughaLinkTheme.brand.savannahGold,
            modifier = Modifier.padding(start = 4.dp),
        )
    }
}

private val LughaLinkCheckGlyph: ImageVector
    get() = ImageVector.Builder(
        name = "LughaLinkCheckGlyph",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 16.2f)
            lineTo(4.8f, 12f)
            lineTo(3.4f, 13.4f)
            lineTo(9f, 19f)
            lineTo(21f, 7f)
            lineTo(19.6f, 5.6f)
            close()
        }
    }.build()