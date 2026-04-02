package com.rcolejnr.portfolio.home

import org.jetbrains.compose.resources.StringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.nav_about
import portfolio.composeapp.generated.resources.nav_experience
import portfolio.composeapp.generated.resources.nav_projects

sealed class HomeSection(val index: Int, val title: StringResource) {
    data object About : HomeSection(0, Res.string.nav_about)
    data object Projects : HomeSection(1, Res.string.nav_projects)
    data object Experience : HomeSection(2, Res.string.nav_experience);

    companion object {
        val values = listOf(
            About, Projects, Experience
        )
    }
}
