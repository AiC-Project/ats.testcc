#!/bin/bash

# Any error must exit the script with a status code
set -e

cat /dev/fd/0 > /home/developer/aicdemos/aicdemosensor/src/androidTest/java/com/zenika/aic/demo/sensor/Testing.java

DIR=/home/developer/aicdemos/aicdemosensor/build/outputs/apk/
APK=$DIR/aicdemosensor-debug-androidTest-unaligned.apk
SIGNED=/home/developer/signed.apk

cd /home/developer/aicdemos
gradle --stacktrace generateDebugSources generateDebugAndroidTestSources assembleDebug assembleDebugAndroidTest
zip "$APK" -d META-INF/*
jarsigner -keystore /home/developer/debug.keystore -storepass android -keypass android "$APK" androiddebugkey
zipalign -f 4 "$APK" "$SIGNED"

