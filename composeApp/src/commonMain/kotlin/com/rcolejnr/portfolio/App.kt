package com.rcolejnr.portfolio

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.rcolejnr.portfolio.core.theme.PortfolioTheme
import com.rcolejnr.portfolio.core.theme.WindowSize
import com.rcolejnr.portfolio.core.utils.AppEnvironment
import com.rcolejnr.portfolio.home.HomeScreen
import com.rcolejnr.portfolio.project.ProjectDetailsScreen
import kotlinx.serialization.Serializable

@Composable
fun App(windowSize: WindowSize) {
    val navController = rememberNavController()
    AppEnvironment{
        PortfolioTheme(windowSize) {
            NavHost(
                navController, startDestination = ScreenHome
            ) {
                composable<ScreenHome> {
                    HomeScreen { project ->
                        navController.navigate(ScreenProject(projectId = project.id))
                    }
                }

                composable<ScreenProject> { backStackEntry ->
                    val screenProject: ScreenProject = backStackEntry.toRoute()
                    ProjectDetailsScreen(projectId = screenProject.projectId) {
                        navController.popBackStack()
                    }
                }
            }
        }
    }
}

@Serializable
object ScreenHome

@Serializable
data class ScreenProject(val projectId: String)
