# [Accelerate-Programming](#accelerate-programming)
> # [Android Gradle](#android-gradle) 
>> ## [Project](#project)
>> ## [Module](#module)
> # [Project Structure](#project-structure) 
>> ## [Structure Folder](#structure-folder)

>> ## [Project](#project)
>> ## [Module](#module)



> # [References](#references)

# Android Gradle
> [Research about build.gradle(project) and build.gradle(module)](https://github.com/danisluis6/Accelerate-Programming/blob/master/Android%20Gradle.md)
> # Project
```java
    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.1'
    }
```
> # Module
>> # 26
```java
dependencies {
    implementation fileTree(include: ['*.jar'], dir: 'libs')

    compile 'com.android.support:appcompat-v7:26.1.0'

    compile 'com.android.support:design:26.1.0'

    compile 'com.android.support.constraint:constraint-layout:1.1.0'

    compile 'com.android.support:cardview-v7:26.1.0'

    compile 'com.android.support:recyclerview-v7:26.1.0'
    
    // Butterknife Library
    compile 'com.jakewharton:butterknife:8.2.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.2.1'
    
    //  Setup Retrofit and elevant these labraries
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
    compile 'com.squareup.retrofit2:converter-scalars:2.1.0'
    
    // Setup HTTP
    compile 'com.squareup.okhttp3:okhttp:3.4.1'
    compile 'com.squareup.okhttp3:logging-interceptor:3.4.1'
    
    // Setup Gson
    compile 'com.google.code.gson:gson:2.7'
    
    // Setup Rx
    compile 'com.squareup.retrofit2:adapter-rxjava:2.+'
    compile 'io.reactivex:rxjava:1.0.4'
    compile 'io.reactivex:rxandroid:0.24.0'
    provided 'org.glassfish:javax.annotation:10.0-b28'
    
    // Dagger 2
    provided 'com.google.dagger:dagger-compiler:2.1'
    compile 'com.google.dagger:dagger:2.1'
    
    // Test
    testCompile 'junit:junit:4.12'
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
}
```
>> Choose version 3.0:
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

# Project Structure
> # Structure Folder









# Agenda
We know about **Markdown** and we can *apply* it for custom file ~~README.md~~. Even do __morething__
1. Section 1
    - Situation 1
2. Section 2
    - Situation 2
3. Section 3
    - Situation 3
    - Situation 4
4. Section 4
    - Situation 5
    - Situation 6
    - Situation 7
 
[Go to google search](https://www.google.com)
![alt text](https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:orientation="vertical" >
    <TextView android:id="@+id/text"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:text="Hello, I am a TextView" />
    <Button android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello, I am a Button" />
</LinearLayout>
```
```
No language indicated, so no syntax highlighting. 
But let's throw in a <b>tag</b>.
```

| Tables        | Are           | Cool  |
| ------------- |:-------------:| -----:|
| col 3 is      | right-aligned | $1600 |
| col 2 is      | centered      |   $12 |
| zebra stripes | are neat      |    $1 |

<a href="https://www.youtube.com/embed/blWvD93bALE" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen><img src="https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png" 
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>

# References
- Using Robolectric for Android unit testing on the JVM - Tutorial
http://www.vogella.com/tutorials/Robolectric/article.html

# Espresso
http://www.vogella.com/tutorials/AndroidTestingEspresso/article.html#espresso_gradleconfiguration
https://medium.com/mindorks/android-testing-part-1-espresso-basics-7219b86c862b

