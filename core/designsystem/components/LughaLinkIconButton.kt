package com.lughalink.core.designsystem.components

import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter

/**
 * Small solid-fill icon button — matches the row of colored square action icons in the
 * style-guide swatch (edit/shape/tag/delete). Defaults to the primary (Maasai Red) fill;
 * pass a different [containerColor]/[contentColor] pair to reproduce the other swatch colors
 * (e.g. `MaterialTheme.colorScheme.secondaryContainer` for the gold one).
 */
@Composable
fun LughaLinkIconActionButton(
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
) {
    FilledIconButton(
        onClick = onClick,
        modifier = modifier,
        shape = MaterialTheme.shapes.small,
        colors = IconButtonDefaults.filledIconButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
        ),
    ) {
        Icon(painter = rememberVectorPainter(icon), contentDescription = contentDescription)
    }
}