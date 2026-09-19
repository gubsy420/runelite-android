// Desktop preview of the Compose shell (a placeholder window; the Android app hosts the live
// launcher). This used to be the jvm("desktop") target of the :android Kotlin Multiplatform
// module. AGP 9 no longer allows kotlin.multiplatform alongside com.android.application in one
// subproject, and since the multiplatform half of :android was only this preview, it moved here
// as a plain JVM module instead of splitting the app into a KMP library plus an app shell.
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    jvmToolchain(17)
}

// The root convention compiles Java at release 11; Kotlin's target above is 17, and KGP refuses
// the mismatch. There is no Java source here, but the task still validates.
tasks.withType<JavaCompile>().configureEach {
    options.release.set(17)
}

dependencies {
    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material3)
    implementation(compose.ui)
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "net.runelite.mp.MainKt"
        nativeDistributions {
            targetFormats(
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg,
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi,
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb,
            )
            packageName = "runelite-mp"
            packageVersion = "1.0.0"
        }
    }
}
