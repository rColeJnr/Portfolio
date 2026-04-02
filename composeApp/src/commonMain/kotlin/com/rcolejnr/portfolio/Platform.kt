package com.rcolejnr.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform