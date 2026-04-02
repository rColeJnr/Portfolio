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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.lang_english
import portfolio.composeapp.generated.resources.lang_fluent
import portfolio.composeapp.generated.resources.lang_native
import portfolio.composeapp.generated.resources.lang_portuguese
import portfolio.composeapp.generated.resources.lang_russian
import portfolio.composeapp.generated.resources.languages
import portfolio.composeapp.generated.resources.languages_title

@Composable
fun LanguageCard(weight: Float) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(weight).heightIn(min = 180.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = MaterialTheme.colorScheme.surfaceContainerLow),
        shape = RoundedCornerShape(24.dp)
    ) {
        Column(Modifier.padding(24.dp)) {
            Row (horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically){
                Icon(painterResource(Res.drawable.languages), null, tint = Color.Green)
                Spacer(Modifier.width(8.dp))
                Text(
                    stringResource(Res.string.languages_title),
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                LanguageItem(stringResource(Res.string.lang_portuguese), stringResource(Res.string.lang_native))
                LanguageItem(stringResource(Res.string.lang_english), stringResource(Res.string.lang_fluent))
                LanguageItem(stringResource(Res.string.lang_russian), stringResource(Res.string.lang_fluent))
            }
        }
    }
}

@Composable
fun LanguageItem(language: String, level: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(language, style = MaterialTheme.typography.bodyMedium)
        Text(
            level,
            style = MaterialTheme.typography.labelMedium,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )
    }
}
