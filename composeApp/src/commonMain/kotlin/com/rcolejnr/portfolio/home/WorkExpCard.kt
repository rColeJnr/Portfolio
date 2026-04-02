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
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.agile_bullet_1
import portfolio.composeapp.generated.resources.agile_bullet_2
import portfolio.composeapp.generated.resources.agile_bullet_3
import portfolio.composeapp.generated.resources.agile_bullet_4
import portfolio.composeapp.generated.resources.agile_bullet_5
import portfolio.composeapp.generated.resources.agile_bullet_6
import portfolio.composeapp.generated.resources.agile_title
import portfolio.composeapp.generated.resources.work_exp
import portfolio.composeapp.generated.resources.work_exp_bullet_1
import portfolio.composeapp.generated.resources.work_exp_bullet_2
import portfolio.composeapp.generated.resources.work_exp_bullet_3
import portfolio.composeapp.generated.resources.work_exp_bullet_4
import portfolio.composeapp.generated.resources.work_exp_company_desc
import portfolio.composeapp.generated.resources.work_exp_duration
import portfolio.composeapp.generated.resources.work_exp_role
import portfolio.composeapp.generated.resources.work_exp_title

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
                Icon(
                    painterResource(Res.drawable.work_exp),
                    null,
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    stringResource(Res.string.work_exp_title),
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                stringResource(Res.string.work_exp_duration),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                stringResource(Res.string.work_exp_role),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(8.dp))
            Text(
                stringResource(Res.string.work_exp_company_desc),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                ExperienceBullet(stringResource(Res.string.work_exp_bullet_1))
                ExperienceBullet(stringResource(Res.string.work_exp_bullet_2))
                ExperienceBullet(stringResource(Res.string.work_exp_bullet_3))
                ExperienceBullet(stringResource(Res.string.work_exp_bullet_4))
            }
            Spacer(Modifier.height(8.dp))
            Text(
                stringResource(Res.string.agile_title),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                ExperienceBullet(stringResource(Res.string.agile_bullet_1))
                ExperienceBullet(stringResource(Res.string.agile_bullet_2))
                ExperienceBullet(stringResource(Res.string.agile_bullet_3))
                ExperienceBullet(stringResource(Res.string.agile_bullet_4))
                ExperienceBullet(stringResource(Res.string.agile_bullet_5))
                ExperienceBullet(stringResource(Res.string.agile_bullet_6))
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
        Text(
            text,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
