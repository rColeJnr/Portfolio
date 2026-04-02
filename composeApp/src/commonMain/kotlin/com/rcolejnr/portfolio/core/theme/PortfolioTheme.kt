package com.rcolejnr.portfolio.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

var isDarkMode by mutableStateOf<Boolean?>(null)

@Composable
fun PortfolioTheme(
    windowSize: WindowSize,
    content: @Composable () -> Unit
) {
    val darkTheme = isDarkMode ?: isSystemInDarkTheme()
    val colorScheme = if (darkTheme) {
        darkColorScheme()
    } else {
        lightColorScheme()
    }

    CompositionLocalProvider(
        LocalSpacing provides Spacing(),
        LocalDpSize provides DpSize(),
        LocalFontSize provides getWindowBasedFont(windowSize)
    ){
        MaterialTheme(
            colorScheme = colorScheme,
            content = content,
        )
    }
}