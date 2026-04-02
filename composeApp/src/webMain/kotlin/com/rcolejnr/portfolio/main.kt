package com.rcolejnr.portfolio

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.window.ComposeViewport
import com.rcolejnr.portfolio.core.theme.LocalWindowSize
import com.rcolejnr.portfolio.core.theme.WindowSize

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        val containerSize = LocalWindowInfo.current.containerSize

        val windowSize = remember(containerSize) {
            WindowSize.basedOnWidth(containerSize.width.toDouble())
        }

        CompositionLocalProvider(LocalWindowSize provides windowSize) {
            App(windowSize)
        }
    }
}