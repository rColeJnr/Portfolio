package com.rcolejnr.portfolio.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rcolejnr.portfolio.core.theme.LocalWindowSize
import com.rcolejnr.portfolio.core.theme.WindowSize
import com.rcolejnr.portfolio.core.utils.AppConstants.getProgrammingLanguages
import com.rcolejnr.portfolio.core.utils.AppConstants.getTechSkills
import com.rcolejnr.portfolio.data.Project
import kotlinx.coroutines.launch
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.angle_brackets
import portfolio.composeapp.generated.resources.tech_exp

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel { HomeViewModel() }, onProjectClick: (Project) -> Unit
) {

    val scope = rememberCoroutineScope()

    val lazyListState = rememberLazyListState()
    val screenState by viewModel.uiState.collectAsStateWithLifecycle(HomeState())
    val isCompact = LocalWindowSize.current == WindowSize.COMPACT

    HomeSections(
        isCompact = isCompact,
        lazyListState = lazyListState,
        screenState = screenState,
        onSectionClick = { sectionIndex ->
            scope.launch {
                lazyListState.animateScrollToItem(sectionIndex + 1)
            }
        },
        onProjectClick = onProjectClick
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeSections(
    isCompact: Boolean,
    lazyListState: LazyListState,
    screenState: HomeState,
    onSectionClick: (Int) -> Unit,
    onProjectClick: (Project) -> Unit
) {
    Box(
        Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.TopCenter // Center the LazyColumn horizontally
    ) {
        LazyColumn(
            Modifier
                .widthIn(max = 1200.dp)
                .fillMaxSize(),
            state = lazyListState
        ) {
            stickyHeader {
                HomeHeader(
                    selectedHomeSection = screenState.selectedSection,
                    onSectionSelected = { section ->
                        onSectionClick(section.index)
                    })
            }
            when {
                screenState.isLoading -> item {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                }

                else -> {
                    item {
                        FlowRow(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp, vertical = 48.dp),
                            horizontalArrangement = Arrangement.spacedBy(
                                48.dp,
                                Alignment.CenterHorizontally
                            ),
                            verticalArrangement = Arrangement.spacedBy(
                                32.dp,
                                Alignment.CenterVertically
                            )
                        ) {
                            val itemModifier = Modifier
                                .widthIn(max = 500.dp)
                                .fillMaxWidth()
                                .then(if (isCompact) Modifier else Modifier.weight(1f))

                            AboutSection(itemModifier)
                            ImageSection(itemModifier)
                        }
                    }
                    item {
                        ProjectsSection(
                            screenState.projects, onProjectClick
                        )
                    }
                    item {
                        Column(
                            Modifier.padding(horizontal = 24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "Experience & Skills",
                                style = MaterialTheme.typography.displaySmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface,
                                textAlign = TextAlign.Center
                            )
                            Spacer(Modifier.height(32.dp))

                            FlowRow(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(
                                    16.dp,
                                    Alignment.CenterHorizontally
                                ),
                                verticalArrangement = Arrangement.spacedBy(16.dp)
                            ) {
                                val itemWidth = if (isCompact) 1f else 0.48f

                                SkillGridItem(
                                    "Programming Languages",
                                    getProgrammingLanguages(),
                                    itemWidth,
                                    Color.Blue,
                                    icon = Res.drawable.angle_brackets
                                )
                                LanguageCard(itemWidth)
                            }
                        }
                    }
                    item {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(horizontal = 40.dp, vertical = 24.dp)
                        ) {
                            SkillGridItem(
                                "Technologies",
                                getTechSkills(),
                                1f,
                                Color.Magenta,
                                icon = Res.drawable.tech_exp
                            )
                        }
                    }
                    item {
                        Box(
                            Modifier.fillMaxWidth().padding(horizontal = 40.dp, vertical = 24.dp)
                        ) { WorkExperienceCard(1f) }
                    }
                    item {
                        ContactsSection(Modifier.fillMaxWidth().padding(24.dp))
                    }
                }
            }
        }
    }
}