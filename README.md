# Nearside Android Code Screen - Starter

Welcome to Nearside's Code Screen starter repository! 

## Quickstart

You'll need the following: 

1. Android Studio Arctic Fox (2020.3.1) Patch 3
1. the Android SDK (i.e. `$ANDROID_HOME` points somewhere real)
1. Any JDK version between 11 and 15. 
   - note: as of this writing (11/2021), Kotlin `1.5.31` does _not_ play nicely with Java 16 or 17. If you're using these versions, **you will have problems**.
   - You can try installing Java 15 on MacOS via:
        ```shell
        brew tap AdoptOpenJdk/opendjk # this tap is deprecated and should only be used for JDK15!!
        brew install adoptopenjdk15
        ```

Here are the libraries the starter kit currently has: 
- Kotlin
    - stdlib 1.5.31
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

The Mobile@Nearside promise: we won't ask you to solve any problems that you learned in Data Structures & Algorithms class. 

The task at hand will be a straightforward programming problem for which there is an iterative solution that can be obtained in less than 30 lines of code. 

Other than that, you'll have to wait and see! 😁

(If you actually have additional questions, please reach out to your Nearside recruiter or hiring manager -- we'd love to help!)

## Instructions
Make sure you have this repo downloaded and set up with Android Studio _before you join the call_. 

If you don't, we'll happily wait with you while Gradle syncs, but that will cut into your programming time! 😱 👩🏽‍💻 ⏳
