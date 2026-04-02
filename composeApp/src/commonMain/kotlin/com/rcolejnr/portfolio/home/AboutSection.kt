package com.rcolejnr.portfolio.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.github

@Composable
fun AboutSection(
    modifier: Modifier
) {
    val uriHandler = LocalUriHandler.current
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            "Hi, I'm Ricardo Junior",
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.ExtraBold,
            lineHeight = 52.sp
        )
        Text(
            "Android & iOS Developer",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(Modifier.height(24.dp))
        Text(
            "I am a performance-driven Native Mobile Developer focused on architecting scalable, modular systems. I bring production-ready rigor to every layer of development, from low-level build logic to UIs. With experience in Agile collaborations and a commitment to evolving with industry standards.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(Modifier.height(32.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            TextButton(
                onClick = {uriHandler.openUri("https://drive.google.com/drive/folders/1LeWZ1PQABKmlkldHP8lgaH1yGW4wGC73?usp=sharing")},
                modifier = Modifier.background(
                    color = MaterialTheme.colorScheme.surfaceContainerLow,
                    RoundedCornerShape(16.dp)
                )
            ) {
                Icon(
                    imageVector = Icons.TwoTone.Person,
                    contentDescription = null,
                    tint = Color.Black
                )
                Spacer(Modifier.width(8.dp))
                Text("Resume", color = Color.Black)
            }
            TextButton(
                onClick = { uriHandler.openUri("https://github.com/rcolejnr") },
                modifier = Modifier.background(
                    color = MaterialTheme.colorScheme.surfaceContainerLow,
                    RoundedCornerShape(16.dp)
                ),
            ) {
                Icon(
                    painter = painterResource(Res.drawable.github),
                    contentDescription = null,
                    tint = Color.Black
                )
                Spacer(Modifier.width(8.dp))
                Text("GitHub", color = Color.Black)
            }
        }
    }
}
