package com.lughalink.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// REQUIRED BEFORE THIS FILE COMPILES: Compose Multiplatform autogenerates `Res` from whatever
// files exist under commonMain/composeResources/font/ — it does not exist until those files
// are present and the project has built once. Download the 6 files below from Google Fonts
// and drop them in with these exact lowercase_underscore names (Compose resource names can't
// contain capitals or hyphens), then this import resolves:
//   syne_extrabold.ttf, syne_bold.ttf
//   hanken_grotesk_regular.ttf, hanken_grotesk_medium.ttf, hanken_grotesk_semibold.ttf
//   jetbrains_mono_medium.ttf
// The generated package is `<your.namespace>.generated.resources`, set by
// `compose.resources.packageOfResClass` (or your module namespace) in build.gradle.kts —
// adjust the import below to match yours.
import com.lughalink.designsystem.generated.resources.Res
import com.lughalink.designsystem.generated.resources.syne_extrabold
import com.lughalink.designsystem.generated.resources.syne_bold
import com.lughalink.designsystem.generated.resources.hanken_grotesk_regular
import com.lughalink.designsystem.generated.resources.hanken_grotesk_medium
import com.lughalink.designsystem.generated.resources.hanken_grotesk_semibold
import com.lughalink.designsystem.generated.resources.jetbrains_mono_medium

/**
 * Font-family assignment below follows what the two style-guide mockups actually show, not
 * the original brief (which named Plus Jakarta Sans + Fraunces) — see chat for why.
 */
@Composable
private fun syneFontFamily(): FontFamily = FontFamily(
    Font(Res.font.syne_bold, FontWeight.Bold),
    Font(Res.font.syne_extrabold, FontWeight.ExtraBold),
)

@Composable
private fun hankenGroteskFontFamily(): FontFamily = FontFamily(
    Font(Res.font.hanken_grotesk_regular, FontWeight.Normal),
    Font(Res.font.hanken_grotesk_medium, FontWeight.Medium),
    Font(Res.font.hanken_grotesk_semibold, FontWeight.SemiBold),
)

@Composable
private fun jetbrainsMonoFontFamily(): FontFamily = FontFamily(
    Font(Res.font.jetbrains_mono_medium, FontWeight.Medium),
)

/**
 * Full Material 3 type scale. Only 6 styles were specified in the token export
 * (displayLarge, headlineLarge, a headlineLarge-mobile variant, titleMedium, bodyLarge,
 * labelSmall) — those are used verbatim below. Every other style is DERIVED by scaling
 * along the same three type families using standard M3 scale proportions, so the whole
 * scale reads as one coherent system rather than mixing a designed slice with Material's
 * generic defaults. Flag if you have exact values for the derived ones.
 */
@Composable
fun lughaLinkTypography(): Typography {
    val display = syneFontFamily()
    val body = hankenGroteskFontFamily()
    val mono = jetbrainsMonoFontFamily()

    return Typography(
        // --- Display (Syne) ---
        displayLarge = TextStyle( // given: display-lg
            fontFamily = display,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 56.sp,
            lineHeight = 61.sp, // 1.1x
            letterSpacing = (-0.02).sp,
        ),
        displayMedium = TextStyle( // derived
            fontFamily = display,
            fontWeight = FontWeight.Bold,
            fontSize = 45.sp,
            lineHeight = 52.sp,
            letterSpacing = (-0.01).sp,
        ),
        displaySmall = TextStyle( // derived
            fontFamily = display,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            lineHeight = 44.sp,
        ),

        // --- Headline (Syne) ---
        headlineLarge = TextStyle( // given: headline-lg
            fontFamily = display,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 38.sp, // 1.2x
        ),
        headlineMedium = TextStyle( // given: headline-lg-mobile (reused, not derived)
            fontFamily = display,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            lineHeight = 34.sp, // 1.2x
        ),
        headlineSmall = TextStyle( // derived
            fontFamily = display,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            lineHeight = 30.sp,
        ),

        // --- Title (Hanken Grotesk) ---
        titleLarge = TextStyle( // derived
            fontFamily = body,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
            lineHeight = 30.sp,
        ),
        titleMedium = TextStyle( // given: title-md
            fontFamily = body,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 28.sp, // 1.4x
        ),
        titleSmall = TextStyle( // derived
            fontFamily = body,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
        ),

        // --- Body (Hanken Grotesk) ---
        bodyLarge = TextStyle( // given: body-md — matches M3's bodyLarge size (16sp) exactly
            fontFamily = body,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 26.sp, // 1.6x
        ),
        bodyMedium = TextStyle( // derived
            fontFamily = body,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 21.sp,
        ),
        bodySmall = TextStyle( // derived
            fontFamily = body,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 17.sp,
        ),

        // --- Label ---
        // labelLarge/Medium use the body face (button/chip text in the mockups reads as a
        // humanist sans, not mono) — only the smallest tier is spec'd as monospace, for
        // timestamps/metadata specifically per the brand doc.
        labelLarge = TextStyle( // derived
            fontFamily = body,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.01.sp,
        ),
        labelMedium = TextStyle( // derived
            fontFamily = body,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.01.sp,
        ),
        labelSmall = TextStyle( // given: label-sm
            fontFamily = mono,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 12.sp, // 1.0x
            letterSpacing = 0.05.sp,
        ),
    )
}