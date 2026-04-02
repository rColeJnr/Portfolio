package com.rcolejnr.portfolio.data

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Project(
    val id: String,
    val name: StringResource,
    val description: StringResource,
    val shortDescription: StringResource,
    val duration: StringResource,
    val durationDescription: StringResource,
    val growth: StringResource,
    val image: DrawableResource,
    val logo: DrawableResource,
    val platform: String,
    val technologies: List<StringResource>,
    val challenges: List<StringResource>,
    val keyFeatures: List<StringResource>,
    val link: String,
)
