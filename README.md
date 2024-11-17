Android project with XML

When creating a new project:

replace implementation(libs.androidx.core.ktx) with implementation("androidx.core:core-ktx:1.13.1")
change build feature buildFeatures { viewBinding }
Delete files in ui/theme package -> route src/main/java
Remove everything from MainActivity @Composable, enableEdgeToEdge(), setContent
