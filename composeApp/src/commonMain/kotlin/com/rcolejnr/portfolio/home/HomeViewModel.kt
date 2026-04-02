package com.rcolejnr.portfolio.home

import androidx.lifecycle.ViewModel
import com.rcolejnr.portfolio.core.utils.AppConstants
import com.rcolejnr.portfolio.data.Project
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine

class HomeViewModel: ViewModel() {

    private val projects = MutableStateFlow(emptyList<Project>())
    private val selectedHomeSection = MutableStateFlow<HomeSection>(HomeSection.About)
    private val isLoading = MutableStateFlow(true)

    val uiState =
        combine(
            projects,
            selectedHomeSection,
            isLoading
        ) {projects, selectedHomeSection, loading ->
            HomeState(
                projects,
                emptyList(),
                selectedHomeSection,
                loading
            )
        }

    init {
        projects.value = AppConstants.getProjects()
        isLoading.value = false
    }

    fun updateSelectedSection(section: HomeSection) {
        selectedHomeSection.value = section
    }

}