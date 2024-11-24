// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
dependencies {
    implementation 'androidx.compose.ui:ui:1.5.1'
    implementation 'androidx.compose.material:material:1.5.1'
    implementation 'androidx.lifecycle:lifecycle-runtime-compose:2.6.2'
    implementation 'androidx.activity:activity-compose:1.7.2'
    implementation 'io.coil-kt:coil-compose:2.3.0' // Coil for image loading
    implementation 'com.squareup.retrofit2:retrofit:2.9.0' // Retrofit
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0' // Gson converter
}

