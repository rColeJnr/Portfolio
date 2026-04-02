package com.rcolejnr.portfolio

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.rcolejnr.portfolio.core.theme.LocalWindowSize
import com.rcolejnr.portfolio.core.theme.WindowSize

fun main() = application {
    val windowState = rememberWindowState()
    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "My Desktop App"
    ) {
        val windowSize = remember(windowState.size.width) {
            WindowSize.basedOnWidth(windowState.size.width.value.toDouble())
        }

        CompositionLocalProvider(LocalWindowSize provides windowSize) {
            App(windowSize)
        }
    }
}