package com.rcolejnr.portfolio.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.work_exp

@Composable
fun WorkExperienceCard(weight: Float) {
    Card(
        modifier = Modifier.fillMaxWidth(weight).heightIn(min = 180.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer.copy(
                alpha = 0.4f
            )
        ),
        shape = RoundedCornerShape(24.dp)
    ) {
        Column(Modifier.padding(24.dp)) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painterResource(Res.drawable.work_exp), null)
                Spacer(Modifier.width(8.dp))
                Text(
                    "Work Experience",
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                "1+ Year",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                "iOS Developer Intern",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Operated as a core member of a 2-person iOS team within a large-scale cross-functional organization of 25+ professionals, including Backend Engineers, DevOps, Project Managers, Product Owners, UI/UX Designers, and QA Testers. Contributed to a high-concurrency platform using a modified version of Clean Swift (VIP), Clean Swift (VIPER) architecture in a 100% remote, enterprise-grade Agile environment.",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                ExperienceBullet("Developed and maintained WebSocket systems for instant messaging and server-driven notifications, coordinating real-time data synchronization with CoreData.")
                ExperienceBullet("Engineered secure JWT-based authentication flows and handled encrypted document uploads for server-side processing of sensitive data.")
                ExperienceBullet("Co-developed a custom image caching and loading library, significantly reducing network overhead and ensuring a smooth, high-performance image loading.")
                ExperienceBullet("Maintained a pre-existing Clean-Swift pattern that maintains an unidirectional data flow, ensuring strict modularity and high testability across complex feature sets.")
            }
            Spacer(Modifier.height(8.dp))
            Text(
                "Agile Lifecycle Management & Professional Technical Communication",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                ExperienceBullet("Mastered the Agile/Scrum lifecycle within a large team, managing complex task dependencies, story points, and sprint milestones in Jira.")
                ExperienceBullet("Optimized delivery timelines by managing a high volume of Jira tickets, participating in daily stand-ups, and providing accurate effort estimations for complex feature implementations.")
                ExperienceBullet("Maintained high productivity in a 100% remote environment, utilizing Telegram and Google Meets to bridge communication gaps and ensure zero-delay in milestone reporting")
                ExperienceBullet("Acted as a technical bridge between iOS development and the broader 25+ person team, negotiating API contracts with Backend and ensuring UI/UX feasibility with Design.")
                ExperienceBullet("Navigated a high-activity GitHub environment, performing rigorous code reviews and managing complex merge cycles to ensure codebase integrity.")
                ExperienceBullet("Evolved from task execution to high-level ownership, identifying technical needs and delegating sub-tasks based on shifting project requirements and manager directives.")
            }
        }
    }
}

@Composable
fun ExperienceBullet(text: String) {
    Row {
        Text(
            "• ",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Text(text, style = MaterialTheme.typography.bodyMedium)
    }
}