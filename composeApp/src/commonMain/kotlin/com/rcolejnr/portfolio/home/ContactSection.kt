package com.rcolejnr.portfolio.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.contact_availability
import portfolio.composeapp.generated.resources.contact_cta
import portfolio.composeapp.generated.resources.email
import portfolio.composeapp.generated.resources.instagram
import portfolio.composeapp.generated.resources.telegram


@Composable
fun ContactsSection(
    modifier: Modifier
) {
    val uriHandler = LocalUriHandler.current
    Surface(
        modifier = modifier,
        color = Color(0xFF001C35), // Dark Blue
        shape = RoundedCornerShape(32.dp),
    ) {
        FlowRow(
            Modifier.padding(horizontal = 40.dp, vertical = 48.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalArrangement = Arrangement.Center
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    stringResource(Res.string.contact_cta),
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    stringResource(Res.string.contact_availability),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White.copy(alpha = 0.7f)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                IconButton(onClick = { uriHandler.openUri("mailto:Ricardo.m.jnr@mail.ru") }) {
                    Icon(
                        painterResource(Res.drawable.email),
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                }
                IconButton(onClick = { uriHandler.openUri("https://t.me/rColeJnr") }) {
                    Icon(
                        painter = painterResource(Res.drawable.telegram),
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                }
                IconButton(onClick = { uriHandler.openUri("https://instagram.com/rColeJnr") }) {
                    Icon(
                        painter = painterResource(Res.drawable.instagram),
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        }
    }
}
