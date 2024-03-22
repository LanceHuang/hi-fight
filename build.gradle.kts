// 插件
plugins {
    // 多平台插件
    kotlin("multiplatform") version "1.9.22"

    // 通过publishing/publishToMavenLocal发布JAR包到Maven，包名为kmm-template-jvm
    `maven-publish`
}

// 包名
group = "com.example"
// 版本号
version = "1.0-SNAPSHOT"

// 发布
kotlin {
    // jvm发布目标
    jvm {}

    // js发布目标
    js(IR) {
        // 添加以下配置后，执行kotlin browser/jsBrowserDistribution，build/compileSync目录下会生成kmm-template.js
        browser {
            // 以下配置用于生成commonJs2风格的代码，还没试过
//            webpackTask {
//                output.libraryTarget = "commonjs2"
//            }
        }
        binaries.executable()
    }

    // 依赖包
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        jvmMain {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        jvmTest {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
        jsMain {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

