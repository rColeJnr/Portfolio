package com.rcolejnr.portfolio.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rcolejnr.portfolio.core.utils.customAppLocale
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.header_title

@Composable
fun HomeHeader(
    selectedHomeSection: HomeSection,
    onSectionSelected: (HomeSection) -> Unit
) {
    FlowRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.95f))
            .padding(horizontal = 24.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(Res.string.header_title),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(Modifier.weight(1f))
        remember { HomeSection.values }.forEach { section ->
            Text(
                text = stringResource(section.title),
                fontSize = 15.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.clickable(true, onClick = { onSectionSelected(section) }  )
            )
            Spacer(Modifier.width(16.dp))
        }
        Spacer(Modifier.width(8.dp))
        Text(
            "EN",
            fontSize = 13.sp,
            color = if (customAppLocale == "en") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.clickable(customAppLocale != "en", onClick = { customAppLocale = "en"}),
            fontWeight = if (customAppLocale == "en") FontWeight.Bold else FontWeight.Normal
        )
        Spacer(Modifier.width(6.dp))
        Text(
            "|",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(Modifier.width(6.dp))
        Text(
            "PT",
            fontSize = 13.sp,
            color = if (customAppLocale == "pt") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.clickable(customAppLocale != "pt", onClick = { customAppLocale = "pt" }),
            fontWeight = if (customAppLocale == "pt") FontWeight.Bold else FontWeight.Normal
        )
        Spacer(Modifier.width(6.dp))
        Text(
            "|",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(Modifier.width(6.dp))
        Text(
            "RU",
            fontSize = 13.sp,
            color = if (customAppLocale == "ru") MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.clickable(customAppLocale != "ru", onClick = { customAppLocale = "ru" }),
            fontWeight = if (customAppLocale == "ru") FontWeight.Bold else FontWeight.Normal
        )
    }
}