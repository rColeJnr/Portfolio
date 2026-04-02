package com.rcolejnr.portfolio.home

import com.rcolejnr.portfolio.data.Project

data class HomeState(
    val projects: List<Project> = emptyList(),
    val skills: List<String> = emptyList(),
    val selectedSection: HomeSection = HomeSection.About,
    val isLoading: Boolean = true
)
