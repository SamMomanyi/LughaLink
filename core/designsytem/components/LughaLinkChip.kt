package com.lughalink.core.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/**
 * Generic pill tag — low-opacity accent fill, full-opacity accent text, per the brand doc's
 * "glass-like effect that remains legible" rule. Covers the small captions/badges scattered
 * across the mockups: module labels ("MODULE 3"), word-type tags ("New Word"), and section
 * badges ("Preserving East African Voices"). [OfflineBadge] is a fixed-purpose specialization
 * of this same pattern — kept separate since it always means one specific thing.
 */
@Composable
fun LughaLinkChip(
    text: String,
    modifier: Modifier = Modifier,
    accentColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    leadingIcon: (@Composable () -> Unit)? = null,
) {
    Row(
        modifier = modifier
            .background(
                color = accentColor.copy(alpha = 0.15f),
                shape = LughaLinkTheme.pillShape,
            )
            .padding(horizontal = 10.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        leadingIcon?.invoke()
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall,
            color = accentColor,
            modifier = if (leadingIcon != null) Modifier.padding(start = 4.dp) else Modifier,
        )
    }
}