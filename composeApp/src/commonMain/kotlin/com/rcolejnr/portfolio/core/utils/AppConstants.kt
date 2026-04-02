package com.rcolejnr.portfolio.core.utils

import com.rcolejnr.portfolio.data.Project
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.blank_space_background
import portfolio.composeapp.generated.resources.blank_space_logo
import portfolio.composeapp.generated.resources.bs_challenge_1
import portfolio.composeapp.generated.resources.bs_challenge_2
import portfolio.composeapp.generated.resources.bs_challenge_3
import portfolio.composeapp.generated.resources.bs_feature_1
import portfolio.composeapp.generated.resources.bs_feature_2
import portfolio.composeapp.generated.resources.bs_feature_3
import portfolio.composeapp.generated.resources.bs_feature_4
import portfolio.composeapp.generated.resources.bs_feature_5
import portfolio.composeapp.generated.resources.bs_feature_6
import portfolio.composeapp.generated.resources.bs_feature_7
import portfolio.composeapp.generated.resources.bs_feature_8
import portfolio.composeapp.generated.resources.e_catalogs_background
import portfolio.composeapp.generated.resources.e_catalogs_logo
import portfolio.composeapp.generated.resources.ec_challenge_1
import portfolio.composeapp.generated.resources.ec_challenge_10
import portfolio.composeapp.generated.resources.ec_challenge_2
import portfolio.composeapp.generated.resources.ec_challenge_3
import portfolio.composeapp.generated.resources.ec_challenge_4
import portfolio.composeapp.generated.resources.ec_challenge_5
import portfolio.composeapp.generated.resources.ec_challenge_6
import portfolio.composeapp.generated.resources.ec_challenge_7
import portfolio.composeapp.generated.resources.ec_challenge_8
import portfolio.composeapp.generated.resources.ec_challenge_9
import portfolio.composeapp.generated.resources.ec_feature_1
import portfolio.composeapp.generated.resources.ec_feature_2
import portfolio.composeapp.generated.resources.ec_feature_3
import portfolio.composeapp.generated.resources.ec_feature_4
import portfolio.composeapp.generated.resources.ec_feature_5
import portfolio.composeapp.generated.resources.ec_feature_6
import portfolio.composeapp.generated.resources.project_bs_desc
import portfolio.composeapp.generated.resources.project_bs_duration
import portfolio.composeapp.generated.resources.project_bs_duration_desc
import portfolio.composeapp.generated.resources.project_bs_growth
import portfolio.composeapp.generated.resources.project_bs_name
import portfolio.composeapp.generated.resources.project_bs_short_desc
import portfolio.composeapp.generated.resources.project_ec_desc
import portfolio.composeapp.generated.resources.project_ec_duration
import portfolio.composeapp.generated.resources.project_ec_duration_desc
import portfolio.composeapp.generated.resources.project_ec_growth
import portfolio.composeapp.generated.resources.project_ec_name
import portfolio.composeapp.generated.resources.project_ec_short_desc
import portfolio.composeapp.generated.resources.project_vt_desc
import portfolio.composeapp.generated.resources.project_vt_duration
import portfolio.composeapp.generated.resources.project_vt_duration_desc
import portfolio.composeapp.generated.resources.project_vt_growth
import portfolio.composeapp.generated.resources.project_vt_name
import portfolio.composeapp.generated.resources.project_vt_short_desc
import portfolio.composeapp.generated.resources.skill_android
import portfolio.composeapp.generated.resources.skill_app_store
import portfolio.composeapp.generated.resources.skill_design_patterns
import portfolio.composeapp.generated.resources.skill_firebase
import portfolio.composeapp.generated.resources.skill_git
import portfolio.composeapp.generated.resources.skill_golang
import portfolio.composeapp.generated.resources.skill_hilt
import portfolio.composeapp.generated.resources.skill_ios
import portfolio.composeapp.generated.resources.skill_java
import portfolio.composeapp.generated.resources.skill_kmp
import portfolio.composeapp.generated.resources.skill_kotlin
import portfolio.composeapp.generated.resources.skill_ktor
import portfolio.composeapp.generated.resources.skill_leetcode
import portfolio.composeapp.generated.resources.skill_play_console
import portfolio.composeapp.generated.resources.skill_python
import portfolio.composeapp.generated.resources.skill_rest_api
import portfolio.composeapp.generated.resources.skill_swift
import portfolio.composeapp.generated.resources.tech_android_views
import portfolio.composeapp.generated.resources.tech_coredata
import portfolio.composeapp.generated.resources.tech_coroutines
import portfolio.composeapp.generated.resources.tech_fb_analytics
import portfolio.composeapp.generated.resources.tech_fb_auth
import portfolio.composeapp.generated.resources.tech_fb_perf
import portfolio.composeapp.generated.resources.tech_glide
import portfolio.composeapp.generated.resources.tech_gradle
import portfolio.composeapp.generated.resources.tech_jacoco
import portfolio.composeapp.generated.resources.tech_jetpack_compose
import portfolio.composeapp.generated.resources.tech_keychain
import portfolio.composeapp.generated.resources.tech_lifecycle
import portfolio.composeapp.generated.resources.tech_material_design
import portfolio.composeapp.generated.resources.tech_nav_component
import portfolio.composeapp.generated.resources.tech_notifications
import portfolio.composeapp.generated.resources.tech_paging3
import portfolio.composeapp.generated.resources.tech_proto_ds
import portfolio.composeapp.generated.resources.tech_protobuf
import portfolio.composeapp.generated.resources.tech_retrofit
import portfolio.composeapp.generated.resources.tech_room
import portfolio.composeapp.generated.resources.tech_uikit
import portfolio.composeapp.generated.resources.tech_urlsession
import portfolio.composeapp.generated.resources.tech_userdefaults
import portfolio.composeapp.generated.resources.tech_viewmodel
import portfolio.composeapp.generated.resources.tech_workmanager
import portfolio.composeapp.generated.resources.viper_todo_list_background
import portfolio.composeapp.generated.resources.viper_todo_list_logo
import portfolio.composeapp.generated.resources.vt_challenge_1
import portfolio.composeapp.generated.resources.vt_challenge_2
import portfolio.composeapp.generated.resources.vt_challenge_3
import portfolio.composeapp.generated.resources.vt_challenge_4
import portfolio.composeapp.generated.resources.vt_challenge_5
import portfolio.composeapp.generated.resources.vt_challenge_6
import portfolio.composeapp.generated.resources.vt_feature_1
import portfolio.composeapp.generated.resources.vt_feature_2
import portfolio.composeapp.generated.resources.vt_feature_3
import portfolio.composeapp.generated.resources.vt_feature_4
import portfolio.composeapp.generated.resources.vt_feature_5

object AppConstants {

    fun getProjects() = listOf(
        Project(
            id = "1",
            name = Res.string.project_ec_name,
            description = Res.string.project_ec_desc,
            shortDescription = Res.string.project_ec_short_desc,
            growth = Res.string.project_ec_growth,
            duration = Res.string.project_ec_duration,
            durationDescription = Res.string.project_ec_duration_desc,
            image = Res.drawable.e_catalogs_background,
            logo = Res.drawable.e_catalogs_logo,
            platform = "Android",
            technologies = getEcsTechStack(),
            challenges = getEcsChallenges(),
            keyFeatures = getEcsKeyFeatures(),
            link = "https://github.com/rColeJnr/E-Catalog",
        ), Project(
            id = "2",
            name = Res.string.project_vt_name,
            description = Res.string.project_vt_desc,
            shortDescription = Res.string.project_vt_short_desc,
            growth = Res.string.project_vt_growth,
            image = Res.drawable.viper_todo_list_background,
            logo = Res.drawable.viper_todo_list_logo,
            duration = Res.string.project_vt_duration,
            durationDescription = Res.string.project_vt_duration_desc,
            platform = "iOS",
            technologies = getVTATechStack(),
            challenges = getVTAChallenges(),
            keyFeatures = getVTAKeyFeatures(),
            link = "https://github.com/rColeJnr/Viper-Todo-List",
        ), Project(
            id = "3",
            name = Res.string.project_bs_name,
            description = Res.string.project_bs_desc,
            shortDescription = Res.string.project_bs_short_desc,
            growth = Res.string.project_bs_growth,
            image = Res.drawable.blank_space_background,
            logo = Res.drawable.blank_space_logo,
            duration = Res.string.project_bs_duration,
            durationDescription = Res.string.project_bs_duration_desc,
            platform = "Android",
            technologies = getBlankSpaceTechStack(),
            challenges = getBlankSpaceChallenges(),
            keyFeatures = getBlankSpaceKeyFeatures(),
            link = "https://github.com/spongycode/blank-space",
        )
    )

    fun getProgrammingLanguages() = listOf(
        Res.string.skill_kotlin,
        Res.string.skill_golang,
        Res.string.skill_python,
        Res.string.skill_swift,
        Res.string.skill_java,
        Res.string.skill_hilt,
    )

    fun getTechSkills() = listOf(
        Res.string.skill_android,
        Res.string.skill_ios,
        Res.string.skill_kmp,
        Res.string.skill_ktor,
        Res.string.skill_rest_api,
        Res.string.skill_git,
        Res.string.skill_firebase,
        Res.string.skill_design_patterns,
        Res.string.skill_leetcode,
        Res.string.skill_play_console,
        Res.string.skill_app_store
    )

    fun getEcsTechStack() = listOf(
        Res.string.skill_kotlin,
        Res.string.tech_android_views,
        Res.string.tech_jetpack_compose,
        Res.string.tech_coroutines,
        Res.string.tech_workmanager,
        Res.string.tech_protobuf,
        Res.string.tech_fb_perf,
        Res.string.tech_fb_analytics,
        Res.string.tech_fb_auth,
        Res.string.skill_hilt,
        Res.string.tech_retrofit,
        Res.string.tech_room,
        Res.string.tech_proto_ds,
        Res.string.tech_jacoco,
        Res.string.tech_paging3,
        Res.string.tech_gradle
    )

    fun getEcsChallenges() = listOf(
        Res.string.ec_challenge_1,
        Res.string.ec_challenge_2,
        Res.string.ec_challenge_3,
        Res.string.ec_challenge_4,
        Res.string.ec_challenge_5,
        Res.string.ec_challenge_6,
        Res.string.ec_challenge_7,
        Res.string.ec_challenge_8,
        Res.string.ec_challenge_9,
        Res.string.ec_challenge_10,
    )

    fun getEcsKeyFeatures() = listOf(
        Res.string.ec_feature_1,
        Res.string.ec_feature_2,
        Res.string.ec_feature_3,
        Res.string.ec_feature_4,
        Res.string.ec_feature_5,
        Res.string.ec_feature_6,
    )

    fun getVTATechStack() = listOf(
        Res.string.skill_swift,
        Res.string.tech_uikit,
        Res.string.tech_coredata,
        Res.string.tech_userdefaults,
        Res.string.tech_keychain,
        Res.string.tech_urlsession
    )

    fun getVTAChallenges() = listOf(
        Res.string.vt_challenge_1,
        Res.string.vt_challenge_2,
        Res.string.vt_challenge_3,
        Res.string.vt_challenge_4,
        Res.string.vt_challenge_5,
        Res.string.vt_challenge_6
    )

    fun getVTAKeyFeatures() = listOf(
        Res.string.vt_feature_1,
        Res.string.vt_feature_2,
        Res.string.vt_feature_3,
        Res.string.vt_feature_4,
        Res.string.vt_feature_5
    )

    fun getBlankSpaceTechStack() = listOf(
        Res.string.skill_kotlin,
        Res.string.tech_coroutines,
        Res.string.tech_viewmodel,
        Res.string.tech_lifecycle,
        Res.string.tech_nav_component,
        Res.string.skill_firebase,
        Res.string.tech_retrofit,
        Res.string.tech_room,
        Res.string.tech_glide,
        Res.string.tech_material_design,
        Res.string.tech_workmanager,
        Res.string.tech_notifications
    )

    fun getBlankSpaceChallenges() = listOf(
        Res.string.bs_challenge_1,
        Res.string.bs_challenge_2,
        Res.string.bs_challenge_3,
    )

    fun getBlankSpaceKeyFeatures() = listOf(
        Res.string.bs_feature_1,
        Res.string.bs_feature_2,
        Res.string.bs_feature_3,
        Res.string.bs_feature_4,
        Res.string.bs_feature_5,
        Res.string.bs_feature_6,
        Res.string.bs_feature_7,
        Res.string.bs_feature_8
    )
}
