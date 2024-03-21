// 项目名
rootProject.name = "hi-fight"

// 插件库
pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://maven.aliyun.com/repositories/jcenter")
        maven("https://maven.aliyun.com/repositories/google")
        maven("https://maven.aliyun.com/repositories/central")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// 依赖库
dependencyResolutionManagement {
    // 这段不知道有什么用
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://maven.aliyun.com/repositories/jcenter")
        maven("https://maven.aliyun.com/repositories/google")
        maven("https://maven.aliyun.com/repositories/central")
        google()
        mavenCentral()
    }
}
