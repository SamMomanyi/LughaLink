package com.banja.core.model

data class Phrase(
    val id: String,
    val languageId: String,
    val nativeText: String,
    val englishTranslation: String,
    val audioUrl: String?,
    val isDownloaded: Boolean = false
)