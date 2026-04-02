package com.rcolejnr.portfolio.core.utils

import com.rcolejnr.portfolio.data.Project
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.blank_space_background
import portfolio.composeapp.generated.resources.blank_space_logo
import portfolio.composeapp.generated.resources.e_catalogs_background
import portfolio.composeapp.generated.resources.e_catalogs_logo
import portfolio.composeapp.generated.resources.viper_todo_list_background
import portfolio.composeapp.generated.resources.viper_todo_list_logo

object AppConstants {

    fun getProjects() = listOf(
        Project(
            id = "1",
            name = "E-Catalogs",
            description = "E-Catalogs is a sophisticated multimedia discovery platform supporting movies, books, anime, manga, and TV series. Developed since 2022, it evolved from a simple project into a robust, multi-module architecture built on Clean Architecture and MVVM principles. The application features a high-performance offline-first engine using Paging 3 and Room, with dependency injection via Hilt and state management through Proto Datastore. It showcases a modern UI transition from XML to Jetpack Compose, unified by a scalable design system. The build system leverages Gradle Version Catalogs and Convention Plugins, ensuring production-ready scalability and professional-grade maintainability across all features.",
            shortDescription = "A comprehensive movie, books and anime browsing and discovery app",
            growth = """ Over four years of independent development, I evolved from a simple developer into a systems-oriented engineer capable of managing enterprise-scale Android lifecycles.
My growth is defined by architectural resilience, I successfully navigated this project through the industry’s shifts in guidelines of how to build a production ready android app.
This project serves as a laboratory where I transitioned from writing code that simply "works" to architecting scalable, maintainable systems. By treating a personal project with production-grade rigor, I believe I could independently implement the same 
sophisticated workflows and modular standards found in high-concurrency professional environments.
Without external direction, I studied the "invisible" side of professional development of a robust application.""",
            duration = "Since 2022",
            durationDescription = "This project represents an endless development lifecycle of continuous modernization.",
            image = Res.drawable.e_catalogs_background,
            logo = Res.drawable.e_catalogs_logo,
            platform = "Android",
            technologies = getEcsTechStack(),
            challenges = getEcsChallenges(),
            keyFeatures = getEcsKeyFeatures(),
            link = "https://github.com/rColeJnr/E-Catalog",
        ), Project(
            id = "2",
            name = "Viper Todo List",
            description = "A high-performance, offline-first application designed to demonstrate the scalability of the VIPER architecture. Implemented a strict View-Interactor-Presenter-Entity-Router pattern to achieve total separation of concerns and modularity.\nEngineered an Offline-First sync engine using CoreData and URLSession.\nLevaraged a Protocol-Oriented delegate system to facilitate clean communication between architectural layers without the overhead of heavy frameworks.",
            shortDescription = "A beautiful and intuitive TodoList app built using the VIPER architecture",
            growth = "Building this iOS app represented a shift to professional software engineering.\nI moved beyond MVC to master VIPER, learning how to decouple business logic, navigation and UI. This established a foundation for building enterprise-grade testable applications.\nGained expertise in coordinating asynchronous networking with local persistence.\nDeveloped a deep understanding of Swift Protocols and Dependency Injection",
            image = Res.drawable.viper_todo_list_background,
            logo = Res.drawable.viper_todo_list_logo,
            duration = "2 weeks",
            durationDescription = "Completed a focused 14-day development sprint to architect a functional MVP using VIPER and programmatic UIKit.",
            platform = "iOS",
            technologies = getVTATechStack(),
            challenges = getVTAChallenges(),
            keyFeatures = getVTAKeyFeatures(),
            link = "https://github.com/rColeJnr/Viper-Todo-List",
        ), Project(
            id = "3",
            name = "Blank-Space",
            description = "Blank-Space was built with a focus on community and creativity, the app features an infinite-scroll home feed of memes fetched via API, categorized browsing, and a robust suite of creation tools that allow users to edit templates and share their own \"Member Edits\" with the community.\n" + "\n" + "Beyond content consumption, the platform fosters real-time interaction through integrated general group chats and secure private messaging. It serves as a comprehensive ecosystem for meme enthusiasts to discover, create, and discuss trending internet culture.",
            shortDescription = "Blank-Space is a dynamic, meme-centric social networking Android application designed to provide a high-engagement, \"Instagram-like\" experience.",
            growth = "This project was my first experience with team-based development, through this project i learned the critical importance of version control, task delegation and code integration with my partner's code. This project required me to master Firebase Firestore, to learn how to handle real-time listeners, manage data consistency across different users, and secure user information via Firebase Auth.\nImplementing WorkManager for notifications required an understanding of the Android system beyond the foreground.",
            image = Res.drawable.blank_space_background,
            logo = Res.drawable.blank_space_logo,
            duration = "1 month",
            durationDescription = "Successfully took the project from concept to feature-complete in a 1-month rapid sprint",
            platform = "Android",
            technologies = getBlankSpaceTechStack(),
            challenges = getBlankSpaceChallenges(),
            keyFeatures = getBlankSpaceKeyFeatures(),
            link = "https://github.com/spongycode/blank-space",
        )
    )

    fun getProgrammingLanguages() = listOf(
        "Kotlin", "GoLang", "Python", "Swift", "Java", "Hilt",
    )

    fun getTechSkills() = listOf(
        "Android",
        "iOS",
        "Kotlin MultiPlatform",
        "Ktor",
        "REST APIs",
        "GIT",
        "Firebase",
        "Design Patterns",
        "LeetCode",
        "Google Play Console",
        "Apple Store Connect"
    )

    fun getEcsTechStack() = listOf(
        "Kotlin",
        "Android Views",
        "Jetpack Compose",
        "Kotlin Coroutines",
        "Android WorkManager",
        "Google Protobuf and Datastore",
        "Firebase Performance",
        "Firebase Analytics",
        "Firebase Authentication",
        "Hilt",
        "Retrofit",
        "Room",
        "Proto3 Datastore",
        "Jacoco",
        "Paging3",
        "Gradle & Convention Plugins"
    )

    fun getEcsChallenges() = listOf(
        "Create and implement a scalable and ease to maintain system design based on MVVM",
        "Transitioning a monolithic codebase into a highly decoupled, feature-layered multi-module system.",
        "Migrate the system through three generations of Gradle dependency management systems.",
        "Fix bugs reported by users",
        "Implement features requested by users",
        "Internationalization",
        "Engineered a centralized UI design system module.",
        "Optimizing layouts to improve performance and reduce memory usage.",
        "Pagination with RemoteMediator using Paging3 with REST APIs and Room.",
        "Implement an offline-first architecture",
    )

    fun getEcsKeyFeatures() = listOf(
        "Unified Discovery App: A comprehensive catalog system for Movies, Books, Anime, Manga and Tv Series, integrating multiple industry-standard APIs.",
        "Modular Design: A highly decoupled architecture where each category (e.g. Books) is divided into its own data modules and UI modules, ensuring massive scalability.",
        "Deep-Link Navigation: Implemented a robust Jetpack Navigation Graph system to manage complex transitions and data share between modules.",
        "Offline-First: Engineered a resilient data layer using Paging3 and Room for local cache, providing a seamless infinite-scroll experience that functions well without connectivity.",
        "Clean Architecture & Use cases: Strict enforcement of business logic separation.",
        "Centralized Systems: Developed dedicated modules containing shared system-wide logic",
    )

    fun getVTATechStack() = listOf(
        "Swift",
        "100% Programmatic UI via UIKit",
        "CoreData",
        "UserDefaults",
        "KeyChain",
        "URLSession"
    )

    fun getVTAChallenges() = listOf(
        "Sync server data with local data",
        "Implement a clean VIPER design pattern",
        "Ensuring correct initialization of Classes",
        "Correct usage of weak references to avoid memory leaks",
        "Navigating the Delegation system",
        "Writing unit and UI test was actually ease thanks to the VIPER architecture"
    )

    fun getVTAKeyFeatures() = listOf(
        "Onboarding Flow: A sequence to introduce users to the app's interface and functionality",
        "Intelligent Dashboard: a main screen featuring a card-based UI that separates and displays In-Progress and Completed Tasks",
        "External Data Sync: Integration with an API to download and sync tasks",
        "Offline-First Architecture: The app loads data from CoreData, ensuring the UI is populated instantly even without an internet connectin",
        "Protocol-Oriented Communicating: use of Delegate system to pass data between VIPER layers"
    )

    fun getBlankSpaceTechStack() = listOf(
        "Kotlin",
        "Coroutines",
        "ViewModel",
        "Lifecycle",
        "Navigation Component",
        "Firebase Firestore & Authentication",
        "Retrofi2, GSON",
        "Room",
        "Glide, PhotoEditor & PhotoViewer",
        "Google Material Design",
        "Work Manager",
        "Android Notifications"
    )

    fun getBlankSpaceChallenges() = listOf(
        "Coordinating a shared codebase for the first time in a one-month sprint through active communication to avoid merge conflicts, logic overlaps and code repetition",
        "Achieve real-time latency, ensuring that messages in private and group chats appeared instantly for both users",
        "Image editing and image sharing",
    )

    fun getBlankSpaceKeyFeatures() = listOf(
        "Infinite Meme Discovery: Implemented a paginated home feed using Retrofit2 and GSON to fetch and display an endless stream of memes from external APIs",
        "Categorized Content Browsing: Developed a filtering system that allows users to navigate through five distinct meme categories to personalize their discovery experience",
        "In-App Meme Engine: Integrated a PhotoEditor suite where users can select famous meme templates, apply custom edits and instantly share their work in Blank-Space",
        "Member Edis: Create a dedicated social space for user-generated content",
        "Favorites Library: Built a favorite feature for users to save their favorite memes and templates",
        "Messaging System: Engineered a General Group Chat and a Private Message system for communication",
        "Real-Time Data Sync: Leveraged Firebase Firestore to ensure that messages and \"Member Edits\" updated instantly across all devices",
        "Smart Background Notifications: With Android WorkManager handled background tasks, ensuring users receive alerts for new memes and real-time notifications for incoming messages when the app is in the background."
    )

    fun getLanguages() = mapOf<String, String>(
        "Portuguese" to "Native", "English" to "Fluent", "Russian" to "Fluent"
    )
}