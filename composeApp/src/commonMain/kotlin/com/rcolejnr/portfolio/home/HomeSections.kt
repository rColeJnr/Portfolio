package com.rcolejnr.portfolio.home

sealed class HomeSection(val index: Int, val title: String) {
    object About : HomeSection(0, "About")
    object Projects : HomeSection(1, "Projects")
    object Experience : HomeSection(2, "Experience");

    companion object {
        val values = listOf(
            About, Projects, Experience
        )
    }
}