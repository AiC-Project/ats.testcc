#!/bin/bash

set -e

DIR=/home/developer/aicdemos/aicdemosensor/build/outputs/apk/
APK=$DIR/aicdemosensor-debug-androidTest-unaligned.apk
SIGNED=/home/developer/signed.apk

cd /home/developer/aicdemos
gradle --stacktrace generateDebugSources generateDebugAndroidTestSources assembleDebug assembleDebugAndroidTest
zip "$APK" -d META-INF/*
jarsigner -keystore /home/developer/debug.keystore -storepass android -keypass android "$APK" androiddebugkey
zipalign -f 4 "$APK" "$SIGNED"

