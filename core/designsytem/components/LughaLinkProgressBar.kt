package com.lughalink.core.designsystem.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.lughalink.core.designsystem.theme.LughaLinkTheme

/**
 * Linear progress bar — used for both course-module progress ("Module Progress 60%") and
 * in-lesson progress (the bar at the top of the learning-interface mockup). Track fills with
 * Savannah Gold, matching the amber progress fill shown in both places.
 */
@Composable
fun LughaLinkProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
) {
    LinearProgressIndicator(
        progress = { progress.coerceIn(0f, 1f) },
        modifier = modifier
            .fillMaxWidth()
            .height(6.dp),
        color = LughaLinkTheme.brand.savannahGold,
        trackColor = MaterialTheme.colorScheme.surfaceVariant,
        strokeCap = StrokeCap.Round,
    )
}