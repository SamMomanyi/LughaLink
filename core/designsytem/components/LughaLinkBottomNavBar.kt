package com.lughalink.core.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/** One destination in [LughaLinkBottomNavBar] — e.g. Home / Learn / Revise / Profile. */
data class LughaLinkNavItem(
    val icon: ImageVector,
    val label: String,
)

/**
 * Bottom navigation bar matching the Home/Learn/Revise/Profile tabs in the app mockups.
 * Selected tab highlights in Maasai Red; unselected tabs use `onSurfaceVariant`.
 */
@Composable
fun LughaLinkBottomNavBar(
    items: List<LughaLinkNavItem>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.surfaceContainer,
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = { onItemSelected(index) },
                icon = { Icon(painter = rememberVectorPainter(item.icon), contentDescription = item.label) },
                label = { Text(item.label) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LughaLinkTheme.brand.maasaiRed,
                    selectedTextColor = LughaLinkTheme.brand.maasaiRed,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    indicatorColor = LughaLinkTheme.brand.maasaiRed.copy(alpha = 0.15f),
                ),
            )
        }
    }
}