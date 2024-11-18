Android project with XML

When creating a new project:

1. replace implementation(libs.androidx.core.ktx) with implementation("androidx.core:core-ktx:1.13.1")
2. change build feature buildFeatures { viewBinding }
3. Delete files in ui/theme package -> route src/main/java
4. Remove everything from MainActivity @Composable, enableEdgeToEdge(), setContent
