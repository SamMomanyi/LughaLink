package com.lughalink.core.designsystem.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.input.ImeAction
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/**
 * Search input — rounded field, leading search glyph, placeholder "Search" per the mockups.
 * Border transitions to Savannah Gold on focus, per the brand doc's Inputs rule.
 *
 * [searchIcon] has no built-in default (unlike the checkmark in [OfflineBadge]) since a search
 * glyph is common enough that you likely already have one from Lucide/Material Symbols once
 * those are wired in — pass it in rather than this module drawing another placeholder vector.
 */
@Composable
fun LughaLinkSearchField(
    query: String,
    onQueryChange: (String) -> Unit,
    searchIcon: ImageVector,
    modifier: Modifier = Modifier,
    placeholder: String = "Search",
) {
    OutlinedTextField(
        value = query,
        onValueChange = onQueryChange,
        modifier = modifier,
        placeholder = { Text(placeholder) },
        leadingIcon = {
            Icon(painter = rememberVectorPainter(searchIcon), contentDescription = null)
        },
        singleLine = true,
        shape = MaterialTheme.shapes.small,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = LughaLinkTheme.brand.savannahGold,
            unfocusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,
            focusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,
        ),
    )
}