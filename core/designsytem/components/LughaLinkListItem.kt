package com.lughalink.core.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.weight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/**
 * A single row in a list — leading content (icon, thumbnail, lock/download/check glyph),
 * title + optional subtitle, trailing content. Rows are divided by subtle `outlineVariant`
 * lines. Set [highPriority] for the 2dp Ocean Blue left accent bar the brand doc calls for on
 * high-priority items (e.g. the "in progress, resume here" row in a module list).
 */
@Composable
fun LughaLinkListItem(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    highPriority: Boolean = false,
    showDivider: Boolean = true,
    leading: (@Composable () -> Unit)? = null,
    trailing: (@Composable RowScope.() -> Unit)? = null,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .width(2.dp)
                    .fillMaxHeight()
                    .then(
                        if (highPriority) {
                            Modifier.background(LughaLinkTheme.brand.oceanBlue)
                        } else {
                            Modifier
                        },
                    ),
            )

            if (leading != null) {
                Box(modifier = Modifier.padding(start = 12.dp)) { leading() }
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
            ) {
                Text(text = title, style = MaterialTheme.typography.bodyLarge)
                if (subtitle != null) {
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }

            trailing?.invoke(this)
        }

        if (showDivider) {
            HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
        }
    }
}