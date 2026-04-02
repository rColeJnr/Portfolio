package com.rcolejnr.portfolio.core.theme

import androidx.compose.runtime.compositionLocalOf

enum class WindowSize {
    COMPACT,
    MEDIUM,
    EXPANDED;

    companion object {
        fun basedOnWidth(windowWidth: Double): WindowSize {
            return when {
                windowWidth < 1000 -> COMPACT
                windowWidth < 1200 -> MEDIUM
                else -> EXPANDED
            }
        }
    }
}

val LocalWindowSize = compositionLocalOf {
    WindowSize.EXPANDED
}