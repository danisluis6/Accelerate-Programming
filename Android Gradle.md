# Android Gradle
There is a difference between build.gradle(Project) and build.gradle(Module). As per my understanding, there are different kind of dependencies:

## build.gradle(Module:app)

  - There is a Top-level build file where you can add configuration options common to all sub-projects/modules. You you can observe. But, there is a bit confusing. Android Studio is designed with more view options. If you switch to the *Android* view to *Project* view. You can see the actual stucture and where the different build.gradle files are located. 
  - For example: This is demonstration app: **build.gradle(Project:*design_pattern*)**
  
  - As so each project android will only contain a **top level gradle file**. It usually contains common configs for all modules. Whatever is included in this **top-level gradle**, It will affect all modules.
  - For example: 
  
```java
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.1'
        

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
```
## build.gradle(Module:app)
  - Build file of your specific module (where you add your **dependencies, signing configs, build types, flavors, etc**. We should observe here:
  ![alt text](https://github.com/danisluis6/Accelerate-Programming/blob/master/Gradle/1.png)
  ![alt text](https://github.com/danisluis6/Accelerate-Programming/blob/master/Gradle/2.png)
  
  - Create Flavor:
  ![alt text](https://github.com/danisluis6/Accelerate-Programming/blob/master/Gradle/3.png)
  
# Issues:
- Error 1:All flavors must now belong to a named flavor dimension
- Fix 1: https://stackoverflow.com/questions/44105127/android-studio-3-0-flavor-dimension-issue
```java
android {
    compileSdkVersion 26
    flavorDimensions "default"
```

- Error 2: Add Google Maven reponsitory and sync project
![alt text](https://github.com/danisluis6/Accelerate-Programming/blob/master/Gradle/4.png)
- Fix 2: 
```java
allprojects {
    repositories {
        jcenter()
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
```
- Error 3 : Missing **maven** in Android Studio
![alt text](https://github.com/danisluis6/Accelerate-Programming/blob/master/Gradle/5.png)
- Fix 3: Add *jcenter()*

```java
allprojects {
    repositories {
        google()
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
```
- Error 4: Error:android-apt plugin is incompatible with the Android Gradle plugin. Please use 'annotationProcessor' configuration
- Fix 4: We need to notice here
  - **classpath 'com.android.tools.build:gradle:2.2.3'**
  - **classpath 'com.android.tools.build:gradle:3.0.1'**
- So lead Butterknife depends on Android Gradle Version
#### For version 2
```java
buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}
apply plugin: 'com.neenbedankt.android-apt'

// Butterknife Library
apt 'com.jakewharton:butterknife-compiler:8.2.1'
compile 'com.jakewharton:butterknife:8.2.1'
```
#### For version 3
```java
buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}
// Butterknife Library
compile 'com.jakewharton:butterknife:8.2.1'
annotationProcessor 'com.jakewharton:butterknife-compiler:8.2.1'
```
