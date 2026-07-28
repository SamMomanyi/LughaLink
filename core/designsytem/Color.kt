package com.lughalink.core.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * ============================================================================================
 *  LUGHALINK COLOR TOKENS
 * ============================================================================================
 *
 *  DARK ("Savannah Twilight") — every value below is taken verbatim from the design-token
 *  export you provided. Nothing here is guessed.
 *
 *  LIGHT ("Manager Lite") — your light mockup only exposed 4 swatches (Primary #D32F2F,
 *  Secondary #0277BD, Tertiary #F9A825, Neutral #FDF8F5), not a full token export like the
 *  dark one. Material 3 needs ~35 roles per scheme (containers, "on" colors, surface tiers,
 *  fixed variants...). The values marked DERIVED below are my best-effort extension of those
 *  4 anchors, built the same way Material Theme Builder would (tone ~40 for the base color,
 *  ~90 for its container, ~10 for on-container text, white "on" text for saturated bases).
 *  Three slots are NOT guesses — `inversePrimary`, `inverseSurface`, and `inverseOnSurface`
 *  are pulled directly from the Dark scheme, since that's what those roles mean by definition
 *  (light-mode's "inverse" is dark-mode's normal surface, and vice versa).
 *
 *  If precision matters for launch (contrast audits, brand sign-off), run the 3 light seed
 *  colors through Material Theme Builder — same tool your export note already points to for
 *  gold contrast tuning — and paste the result back; swapping these constants is a 5-minute
 *  change and doesn't touch anything downstream since everything reads through LughaLinkTheme.
 * ============================================================================================
 */

// ---------------------------------------------------------------------------------------
// Dark — "Savannah Twilight" (exact)
// ---------------------------------------------------------------------------------------
private object SavannahTwilight {
    val primary = Color(0xFFFFB3AE)
    val onPrimary = Color(0xFF68000B)
    val primaryContainer = Color(0xFFFF5352)
    val onPrimaryContainer = Color(0xFF5C0008)
    val inversePrimary = Color(0xFFBA1724)

    val secondary = Color(0xFFFFDF9E)
    val onSecondary = Color(0xFF3F2E00)
    val secondaryContainer = Color(0xFFFABD00)
    val onSecondaryContainer = Color(0xFF6A4E00)

    val tertiary = Color(0xFF9CCAFF)
    val onTertiary = Color(0xFF003256)
    val tertiaryContainer = Color(0xFF2F96E8)
    val onTertiaryContainer = Color(0xFF002B4C)

    val error = Color(0xFFFFB4AB)
    val onError = Color(0xFF690005)
    val errorContainer = Color(0xFF93000A)
    val onErrorContainer = Color(0xFFFFDAD6)

    val background = Color(0xFF131313)
    val onBackground = Color(0xFFE5E2E1)
    val surface = Color(0xFF131313)
    val onSurface = Color(0xFFE5E2E1)
    val surfaceVariant = Color(0xFF353534)
    val onSurfaceVariant = Color(0xFFE4BEBA)

    val surfaceDim = Color(0xFF131313)
    val surfaceBright = Color(0xFF393939)
    val surfaceContainerLowest = Color(0xFF0E0E0E)
    val surfaceContainerLow = Color(0xFF1C1B1B)
    val surfaceContainer = Color(0xFF201F1F)
    val surfaceContainerHigh = Color(0xFF2A2A2A)
    val surfaceContainerHighest = Color(0xFF353534)

    val outline = Color(0xFFAB8986)
    val outlineVariant = Color(0xFF5B403E)
    val surfaceTint = Color(0xFFFFB3AE)
    val inverseSurface = Color(0xFFE5E2E1)
    val inverseOnSurface = Color(0xFF313030)
    val scrim = Color(0xFF000000)

    val primaryFixed = Color(0xFFFFDAD7)
    val primaryFixedDim = Color(0xFFFFB3AE)
    val onPrimaryFixed = Color(0xFF410004)
    val onPrimaryFixedVariant = Color(0xFF930014)

    val secondaryFixed = Color(0xFFFFDF9E)
    val secondaryFixedDim = Color(0xFFFABD00)
    val onSecondaryFixed = Color(0xFF261A00)
    val onSecondaryFixedVariant = Color(0xFF5B4300)

    val tertiaryFixed = Color(0xFFD0E4FF)
    val tertiaryFixedDim = Color(0xFF9CCAFF)
    val onTertiaryFixed = Color(0xFF001D35)
    val onTertiaryFixedVariant = Color(0xFF00497A)
}

// ---------------------------------------------------------------------------------------
// Light — "Manager Lite" (4 anchors given; the rest is DERIVED — see note above)
// ---------------------------------------------------------------------------------------
private object ManagerLite {
    val primary = Color(0xFFD32F2F) // given
    val onPrimary = Color(0xFFFFFFFF) // derived
    val primaryContainer = Color(0xFFFFDAD4) // derived
    val onPrimaryContainer = Color(0xFF410001) // derived
    val inversePrimary = SavannahTwilight.primary // by definition, not derived

    val secondary = Color(0xFF0277BD) // given
    val onSecondary = Color(0xFFFFFFFF) // derived
    val secondaryContainer = Color(0xFFD3E4FF) // derived
    val onSecondaryContainer = Color(0xFF001D36) // derived

    val tertiary = Color(0xFFF9A825) // given
    val onTertiary = Color(0xFF452B00) // derived
    val tertiaryContainer = Color(0xFFFFDEA6) // derived
    val onTertiaryContainer = Color(0xFF2B1700) // derived

    // Standard Material 3 baseline error scheme (the dark tokens you supplied are also the
    // M3 baseline dark error values, so this is the matching baseline light half — not a
    // brand-specific guess).
    val error = Color(0xFFBA1A1A)
    val onError = Color(0xFFFFFFFF)
    val errorContainer = Color(0xFFFFDAD6)
    val onErrorContainer = Color(0xFF410002)

    val background = Color(0xFFFDF8F5) // given
    val onBackground = Color(0xFF1C1B1A) // derived
    val surface = Color(0xFFFDF8F5) // given
    val onSurface = Color(0xFF1C1B1A) // derived
    val surfaceVariant = Color(0xFFF5DDD9) // derived
    val onSurfaceVariant = Color(0xFF534341) // derived

    val surfaceDim = Color(0xFFE7D9D6) // derived
    val surfaceBright = Color(0xFFFDF8F5) // derived (= background)
    val surfaceContainerLowest = Color(0xFFFFFFFF) // derived
    val surfaceContainerLow = Color(0xFFFAF1EE) // derived
    val surfaceContainer = Color(0xFFF4E6E3) // derived
    val surfaceContainerHigh = Color(0xFFEEE0DD) // derived
    val surfaceContainerHighest = Color(0xFFE8DBD8) // derived

    val outline = Color(0xFF867370) // derived
    val outlineVariant = Color(0xFFD8C2BE) // derived
    val surfaceTint = primary
    val inverseSurface = SavannahTwilight.surface // by definition, not derived
    val inverseOnSurface = SavannahTwilight.onSurface // by definition, not derived
    val scrim = Color(0xFF000000)

    val primaryFixed = Color(0xFFFFDAD4) // derived
    val primaryFixedDim = Color(0xFFFFB4A9) // derived
    val onPrimaryFixed = Color(0xFF410001) // derived
    val onPrimaryFixedVariant = Color(0xFF8C0009) // derived

    val secondaryFixed = Color(0xFFD3E4FF) // derived
    val secondaryFixedDim = Color(0xFFA7C8FF) // derived
    val onSecondaryFixed = Color(0xFF001D36) // derived
    val onSecondaryFixedVariant = Color(0xFF004784) // derived

    val tertiaryFixed = Color(0xFFFFDEA6) // derived
    val tertiaryFixedDim = Color(0xFFDBA700) // derived
    val onTertiaryFixed = Color(0xFF2B1700) // derived
    val onTertiaryFixedVariant = Color(0xFF5C3D00) // derived
}

internal val LughaLinkDarkColorScheme: ColorScheme = darkColorScheme(
    primary = SavannahTwilight.primary,
    onPrimary = SavannahTwilight.onPrimary,
    primaryContainer = SavannahTwilight.primaryContainer,
    onPrimaryContainer = SavannahTwilight.onPrimaryContainer,
    inversePrimary = SavannahTwilight.inversePrimary,
    secondary = SavannahTwilight.secondary,
    onSecondary = SavannahTwilight.onSecondary,
    secondaryContainer = SavannahTwilight.secondaryContainer,
    onSecondaryContainer = SavannahTwilight.onSecondaryContainer,
    tertiary = SavannahTwilight.tertiary,
    onTertiary = SavannahTwilight.onTertiary,
    tertiaryContainer = SavannahTwilight.tertiaryContainer,
    onTertiaryContainer = SavannahTwilight.onTertiaryContainer,
    error = SavannahTwilight.error,
    onError = SavannahTwilight.onError,
    errorContainer = SavannahTwilight.errorContainer,
    onErrorContainer = SavannahTwilight.onErrorContainer,
    background = SavannahTwilight.background,
    onBackground = SavannahTwilight.onBackground,
    surface = SavannahTwilight.surface,
    onSurface = SavannahTwilight.onSurface,
    surfaceVariant = SavannahTwilight.surfaceVariant,
    onSurfaceVariant = SavannahTwilight.onSurfaceVariant,
    surfaceTint = SavannahTwilight.surfaceTint,
    surfaceDim = SavannahTwilight.surfaceDim,
    surfaceBright = SavannahTwilight.surfaceBright,
    surfaceContainerLowest = SavannahTwilight.surfaceContainerLowest,
    surfaceContainerLow = SavannahTwilight.surfaceContainerLow,
    surfaceContainer = SavannahTwilight.surfaceContainer,
    surfaceContainerHigh = SavannahTwilight.surfaceContainerHigh,
    surfaceContainerHighest = SavannahTwilight.surfaceContainerHighest,
    outline = SavannahTwilight.outline,
    outlineVariant = SavannahTwilight.outlineVariant,
    scrim = SavannahTwilight.scrim,
    inverseSurface = SavannahTwilight.inverseSurface,
    inverseOnSurface = SavannahTwilight.inverseOnSurface,
    primaryFixed = SavannahTwilight.primaryFixed,
    primaryFixedDim = SavannahTwilight.primaryFixedDim,
    onPrimaryFixed = SavannahTwilight.onPrimaryFixed,
    onPrimaryFixedVariant = SavannahTwilight.onPrimaryFixedVariant,
    secondaryFixed = SavannahTwilight.secondaryFixed,
    secondaryFixedDim = SavannahTwilight.secondaryFixedDim,
    onSecondaryFixed = SavannahTwilight.onSecondaryFixed,
    onSecondaryFixedVariant = SavannahTwilight.onSecondaryFixedVariant,
    tertiaryFixed = SavannahTwilight.tertiaryFixed,
    tertiaryFixedDim = SavannahTwilight.tertiaryFixedDim,
    onTertiaryFixed = SavannahTwilight.onTertiaryFixed,
    onTertiaryFixedVariant = SavannahTwilight.onTertiaryFixedVariant,
)

/**
 * Brand accent colors, independent of which M3 role slot (secondary vs. tertiary) each one
 * landed in per theme. The dark export puts Savannah Gold in `secondary` and Ocean Blue in
 * `tertiary`; the light export puts them the other way round. Since the brand doc is explicit
 * and singular about what each accent means ("Secondary buttons are outlined in Savannah
 * Gold"), components that need a specific brand color (not "whichever accent M3 calls
 * secondary") should read from here instead of `colorScheme.secondary` directly — see
 * LughaLinkButtons.kt for why this matters in practice.
 */
internal data class LughaLinkBrandColors(
    val maasaiRed: Color,
    val onMaasaiRed: Color,
    val savannahGold: Color,
    val onSavannahGold: Color,
    val oceanBlue: Color,
    val onOceanBlue: Color,
)

internal val LughaLinkBrandColorsDark = LughaLinkBrandColors(
    maasaiRed = SavannahTwilight.primary,
    onMaasaiRed = SavannahTwilight.onPrimary,
    savannahGold = SavannahTwilight.secondary,
    onSavannahGold = SavannahTwilight.onSecondary,
    oceanBlue = SavannahTwilight.tertiary,
    onOceanBlue = SavannahTwilight.onTertiary,
)

internal val LughaLinkBrandColorsLight = LughaLinkBrandColors(
    maasaiRed = ManagerLite.primary,
    onMaasaiRed = ManagerLite.onPrimary,
    savannahGold = ManagerLite.tertiary, // corrected: gold sits in "tertiary" in this export
    onSavannahGold = ManagerLite.onTertiary,
    oceanBlue = ManagerLite.secondary, // corrected: blue sits in "secondary" in this export
    onOceanBlue = ManagerLite.onSecondary,
)

internal val LughaLinkLightColorScheme: ColorScheme = lightColorScheme(
    primary = ManagerLite.primary,
    onPrimary = ManagerLite.onPrimary,
    primaryContainer = ManagerLite.primaryContainer,
    onPrimaryContainer = ManagerLite.onPrimaryContainer,
    inversePrimary = ManagerLite.inversePrimary,
    secondary = ManagerLite.secondary,
    onSecondary = ManagerLite.onSecondary,
    secondaryContainer = ManagerLite.secondaryContainer,
    onSecondaryContainer = ManagerLite.onSecondaryContainer,
    tertiary = ManagerLite.tertiary,
    onTertiary = ManagerLite.onTertiary,
    tertiaryContainer = ManagerLite.tertiaryContainer,
    onTertiaryContainer = ManagerLite.onTertiaryContainer,
    error = ManagerLite.error,
    onError = ManagerLite.onError,
    errorContainer = ManagerLite.errorContainer,
    onErrorContainer = ManagerLite.onErrorContainer,
    background = ManagerLite.background,
    onBackground = ManagerLite.onBackground,
    surface = ManagerLite.surface,
    onSurface = ManagerLite.onSurface,
    surfaceVariant = ManagerLite.surfaceVariant,
    onSurfaceVariant = ManagerLite.onSurfaceVariant,
    surfaceTint = ManagerLite.surfaceTint,
    surfaceDim = ManagerLite.surfaceDim,
    surfaceBright = ManagerLite.surfaceBright,
    surfaceContainerLowest = ManagerLite.surfaceContainerLowest,
    surfaceContainerLow = ManagerLite.surfaceContainerLow,
    surfaceContainer = ManagerLite.surfaceContainer,
    surfaceContainerHigh = ManagerLite.surfaceContainerHigh,
    surfaceContainerHighest = ManagerLite.surfaceContainerHighest,
    outline = ManagerLite.outline,
    outlineVariant = ManagerLite.outlineVariant,
    scrim = ManagerLite.scrim,
    inverseSurface = ManagerLite.inverseSurface,
    inverseOnSurface = ManagerLite.inverseOnSurface,
    primaryFixed = ManagerLite.primaryFixed,
    primaryFixedDim = ManagerLite.primaryFixedDim,
    onPrimaryFixed = ManagerLite.onPrimaryFixed,
    onPrimaryFixedVariant = ManagerLite.onPrimaryFixedVariant,
    secondaryFixed = ManagerLite.secondaryFixed,
    secondaryFixedDim = ManagerLite.secondaryFixedDim,
    onSecondaryFixed = ManagerLite.onSecondaryFixed,
    onSecondaryFixedVariant = ManagerLite.onSecondaryFixedVariant,
    tertiaryFixed = ManagerLite.tertiaryFixed,
    tertiaryFixedDim = ManagerLite.tertiaryFixedDim,
    onTertiaryFixed = ManagerLite.onTertiaryFixed,
    onTertiaryFixedVariant = ManagerLite.onTertiaryFixedVariant,
)