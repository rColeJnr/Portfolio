package com.rcolejnr.portfolio.core.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun PortfolioTheme(
    windowSize: WindowSize,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalSpacing provides Spacing(),
        LocalDpSize provides DpSize(),
        LocalFontSize provides getWindowBasedFont(windowSize)
    ){
        MaterialTheme(
            content = content,
        )
    }
}