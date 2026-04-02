package com.rcolejnr.portfolio.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rcolejnr.portfolio.core.theme.isDarkMode
import com.rcolejnr.portfolio.core.utils.LocalAppLocale
import com.rcolejnr.portfolio.core.utils.customAppLocale
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.header_title

@Composable
fun HomeHeader(
    selectedHomeSection: HomeSection,
    onSectionSelected: (HomeSection) -> Unit
) {
    val currentLocale = LocalAppLocale.current
    val activeLocale = customAppLocale ?: currentLocale
    val isDark = isDarkMode ?: isSystemInDarkTheme()

    FlowRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.95f))
            .padding(horizontal = 24.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(Res.string.header_title),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        
        Spacer(Modifier.weight(1f))

        HomeSection.values.forEach { section ->
            Text(
                text = stringResource(section.title),
                fontSize = 15.sp,
                color = if (selectedHomeSection == section) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
                fontWeight = if (selectedHomeSection == section) FontWeight.Bold else FontWeight.Normal,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .clickable(true, onClick = { onSectionSelected(section) } )
                    .padding(vertical = 8.dp, horizontal = 8.dp)
            )
        }

        Spacer(Modifier.width(16.dp))

        // Language Selector
        Row(
            modifier = Modifier.align(Alignment.CenterVertically),
            verticalAlignment = Alignment.CenterVertically
        ) {
            LanguageOption("EN", activeLocale.startsWith("en", ignoreCase = true)) { customAppLocale = "en" }
            Text("|", modifier = Modifier.padding(horizontal = 4.dp), fontSize = 13.sp)
            LanguageOption("PT", activeLocale.startsWith("pt", ignoreCase = true)) { customAppLocale = "pt" }
            Text("|", modifier = Modifier.padding(horizontal = 4.dp), fontSize = 13.sp)
            LanguageOption("RU", activeLocale.startsWith("ru", ignoreCase = true)) { customAppLocale = "ru" }
        }

        Spacer(Modifier.width(16.dp))

        IconButton(
            onClick = { isDarkMode = !isDark },
            modifier = Modifier.align(Alignment.CenterVertically)
        ) {
            Icon(
                imageVector = if (isDark) Icons.Default.LightMode else Icons.Default.DarkMode,
                contentDescription = "Toggle Dark Mode",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Composable
private fun LanguageOption(
    label: String,
    isActive: Boolean,
    onClick: () -> Unit
) {
    Text(
        text = label,
        fontSize = 13.sp,
        color = if (isActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
        fontWeight = if (isActive) FontWeight.Bold else FontWeight.Normal,
        modifier = Modifier.clickable(!isActive, onClick = onClick)
    )
}