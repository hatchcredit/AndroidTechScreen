# Nearside Android Code Screen - Starter

Welcome to Nearside's Code Screen starter repository! 

## Quickstart

You'll need the following: 

1. Android Studio Bumblebee Patch 1
1. the Android SDK (i.e. `$ANDROID_HOME` points somewhere real)
1. Any JDK version >=11
   - We recommend Azul/Zulu JDK 17, which works well with Kotlin 1.6.10
        ```shell
        brew install --cask zulu
        export JAVA_HOME=`/usr/libexec/java_home -v 17`
        java --version # should read `openjdk 17.0.2 2022-01-18 LTS`
        ```
This repo is configured for both Kotlin and Java ☕️ ; we encourage you to use _whichever language you feel most comfortable in_. 

Here are the libraries the starter kit currently has: 
- Kotlin
    - stdlib 1.6.10
    - Coroutines Core + Android
- AndroidX
    - Core-KTX
    - Fragment-KTX
    - ConstraintLayout
    - LiveData-KTX
    - ViewModel-KTX
- Material Design 
- RxJava 3 + Android
- Glide
- Coil
- Junit

You're _absolutely_ allowed to use libraries not listed here -- we just figured we'd save you the time 😊

## What problem will I be solving?
There will be two parts to the problem: 
1. a non-Android-specific coding exercise (~20 min)
2. wrapping that coding exercise in a little Android app (~20 min)

We'll save ~5 min at the beginning + end for hellos, howdy-do's, and questions. 

The Mobile@Nearside promises: 

- we won't ask you to solve any problems that you learned in Data Structures & Algorithms class. The prompt will be a straightforward programming problem for which there is an iterative solution that can be obtained in less than 30 lines of code. 
- we won't evaluate your choice of language or framework (Java vs. Kotlin, Rx vs. Coroutines), we care about solving the problem!
- it's an open-book test; you'd use Google on the job, no reason you can't use it here!

Other than that, you'll have to wait and see! 😁

(If you actually have additional questions, please reach out to your Nearside recruiter or hiring manager -- we'd love to help!)

## Instructions
Make sure you have this repo downloaded and set up with Android Studio _before you join the call_. 

If you don't, we'll happily wait with you while Gradle syncs, but that will cut into your programming time! 😱 👩🏽‍💻 ⏳
