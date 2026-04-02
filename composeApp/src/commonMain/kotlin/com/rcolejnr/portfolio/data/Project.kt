package com.rcolejnr.portfolio.data

import org.jetbrains.compose.resources.DrawableResource

data class Project(
    val id: String,
    val name: String,
    val description: String,
    val shortDescription: String,
    val duration: String,
    val durationDescription: String,
    val growth: String,
    val image: DrawableResource,
    val logo: DrawableResource,
    val platform: String,
    val technologies: List<String>,
    val challenges: List<String>,
    val keyFeatures: List<String>,
    val link: String,
)