plugins {
    java
    id("org.jetbrains.intellij") version /*PUT_IJSDK_PLUGIN_VERSION_HERE*/"0.5.0"
}

// Configure project's dependencies
repositories {
    mavenCentral()
    jcenter()
}

// Configure gradle-intellij-plugin plugin.
// Read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    pluginName = rootProject.name
    version = /*PUT_IJSDK_VERSION_HERE*/"2020.2.3"
    type =    /*PUT_IJSDK_CODE_HERE*/"IU" //IC, IU, CL, PY, PC, RD or JPS
    downloadSources = true
}
