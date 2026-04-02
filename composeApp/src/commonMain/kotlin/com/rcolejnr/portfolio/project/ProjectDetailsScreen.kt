package com.rcolejnr.portfolio.project

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Code
import androidx.compose.material.icons.outlined.DoneAll
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rcolejnr.portfolio.core.theme.LocalWindowSize
import com.rcolejnr.portfolio.core.theme.WindowSize
import com.rcolejnr.portfolio.core.utils.AppConstants
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.about_github
import portfolio.composeapp.generated.resources.back
import portfolio.composeapp.generated.resources.challenges_solutions
import portfolio.composeapp.generated.resources.development_time
import portfolio.composeapp.generated.resources.github
import portfolio.composeapp.generated.resources.google_play
import portfolio.composeapp.generated.resources.google_play_store
import portfolio.composeapp.generated.resources.growth_learning
import portfolio.composeapp.generated.resources.key_features
import portfolio.composeapp.generated.resources.project_overview
import portfolio.composeapp.generated.resources.technologies_tools

@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalFoundationApi::class,
    ExperimentalLayoutApi::class
)
@Composable
fun ProjectDetailsScreen(projectId: String, onBackClick: () -> Unit) {
    val project = AppConstants.getProjects().find { it.id == projectId } ?: return
    val windowSize = LocalWindowSize.current
    val isCompact = windowSize == WindowSize.COMPACT
    val horizontalPadding = if (isCompact) 16.dp else 48.dp

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        stringResource(project.name),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(Res.string.back)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .widthIn(max = 1200.dp)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = horizontalPadding, vertical = 24.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                // Header Image Card
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(if (isCompact) 250.dp else 400.dp),
                    shape = RoundedCornerShape(32.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(
                            alpha = 0.3f
                        )
                    )
                ) {
                    Box(Modifier.fillMaxSize()) {
                        Image(
                            painter = painterResource(project.image),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.Center),
                            contentScale = ContentScale.Inside
                        )
                    }
                }

                // Project Title and Short Description
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        project.platform,
                        modifier = Modifier
                            .background(
                                MaterialTheme.colorScheme.primaryContainer,
                                RoundedCornerShape(12.dp)
                            )
                            .padding(horizontal = 16.dp, vertical = 6.dp),
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = stringResource(project.name),
                        style = MaterialTheme.typography.displaySmall,
                        fontWeight = FontWeight.ExtraBold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Text(
                        text = stringResource(project.shortDescription),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Medium
                    )
                }

                // Project Links
                val uriHandler = LocalUriHandler.current
                if (projectId == "1") {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        TextButton(
                            onClick = { uriHandler.openUri(project.link) },
                            modifier = Modifier.background(
                                color = MaterialTheme.colorScheme.surfaceContainerLow,
                                RoundedCornerShape(16.dp)
                            ),
                        ) {
                            Icon(
                                painter = painterResource(Res.drawable.github),
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                stringResource(Res.string.about_github),
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        TextButton(
                            onClick = { uriHandler.openUri("https://play.google.com/store/apps/details?id=com.rick.moviecatalog&pcampaignid=web_share") },
                            modifier = Modifier.background(
                                color = MaterialTheme.colorScheme.surfaceContainerLow,
                                RoundedCornerShape(12.dp)
                            ),
                        ) {
                            Icon(
                                painter = painterResource(Res.drawable.google_play),
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                stringResource(Res.string.google_play_store),
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                } else {
                    TextButton(
                        onClick = { uriHandler.openUri(project.link) },
                        modifier = Modifier.background(
                            color = MaterialTheme.colorScheme.surfaceContainerLow,
                            RoundedCornerShape(16.dp)
                        ),
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.github),
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            stringResource(Res.string.about_github),
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // Project Overview - Full Width
                DetailSectionCard(
                    title = stringResource(Res.string.project_overview),
                    icon = Icons.Outlined.Info,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(project.description),
                        style = MaterialTheme.typography.bodyLarge,
                        lineHeight = 28.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                // Development Time - Full Width
                DetailSectionCard(
                    title = stringResource(Res.string.development_time),
                    icon = Icons.Outlined.Schedule,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Surface(
                            color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.4f),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Text(
                                stringResource(project.duration),
                                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
                                style = MaterialTheme.typography.headlineMedium,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }
                        Text(
                            stringResource(project.durationDescription),
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }

                // Key Features - Full Width
                DetailSectionCard(
                    title = stringResource(Res.string.key_features),
                    icon = Icons.Outlined.Star,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(24.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        project.keyFeatures.forEach { feature ->
                            Row(
                                modifier = if (isCompact) Modifier.fillMaxWidth() else Modifier.fillMaxWidth(
                                    0.48f
                                ),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.Outlined.CheckCircle,
                                    contentDescription = null,
                                    modifier = Modifier.size(20.dp),
                                    tint = MaterialTheme.colorScheme.primary
                                )
                                Spacer(Modifier.width(12.dp))
                                Text(
                                    stringResource(feature),
                                    style = MaterialTheme.typography.bodyLarge
                                )
                            }
                        }
                    }
                }

                // Technologies & Tools - Full Width with 1/3 width items
                DetailSectionCard(
                    title = stringResource(Res.string.technologies_tools),
                    icon = Icons.Outlined.Code,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        project.technologies.forEach { tech ->
                            Card(
                                modifier = if (isCompact) Modifier.fillMaxWidth() else Modifier.fillMaxWidth(
                                    0.31f
                                ),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(
                                        alpha = 0.5f
                                    )
                                ),
                                shape = RoundedCornerShape(16.dp),
                                border = BorderStroke(
                                    1.dp,
                                    MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)
                                )
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = stringResource(tech),
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                        }
                    }
                }

                // Growth & Learning
                DetailSectionCard(
                    title = stringResource(Res.string.growth_learning),
                    icon = Icons.Outlined.BarChart,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(project.growth),
                        style = MaterialTheme.typography.bodyLarge,
                        lineHeight = 28.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                // Challenges & Solutions - Standout individual items with Warning icon
                DetailSectionCard(
                    title = stringResource(Res.string.challenges_solutions),
                    icon = Icons.Outlined.DoneAll,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                        project.challenges.forEach { challenge ->
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.errorContainer.copy(
                                        alpha = 0.05f
                                    )
                                ),
                                shape = RoundedCornerShape(20.dp),
                                border = BorderStroke(
                                    1.dp,
                                    MaterialTheme.colorScheme.error.copy(alpha = 0.15f)
                                )
                            ) {
                                Row(
                                    modifier = Modifier.padding(24.dp),
                                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Surface(
                                        color = MaterialTheme.colorScheme.error.copy(alpha = 0.1f),
                                        shape = CircleShape,
                                        modifier = Modifier.size(40.dp)
                                    ) {
                                        Icon(
                                            Icons.Outlined.CheckCircle,
                                            contentDescription = null,
                                            modifier = Modifier.padding(8.dp),
                                        )
                                    }
                                    Text(
                                        stringResource(challenge).trim(),
                                        style = MaterialTheme.typography.bodyLarge,
                                        lineHeight = 26.sp,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(Modifier.height(48.dp))
            }
        }
    }
}

@Composable
fun DetailSectionCard(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    ElevatedCard(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerLow
        )
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(28.dp)
                )
                Spacer(Modifier.width(12.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            content()
        }
    }
}
