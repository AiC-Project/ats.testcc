# UiAutomator known issues

## EditText

EditText xml must contains an hint

    <EditText
        android:id="@+id/password_input"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="text"
        android:hint=""
        android:backgroundTint="@color/red"
        android:shadowColor="@color/red"/>

textPassword is not well supported, use ```text``` instead


# Setup 

## Android 

You must install the android SDK into your computer. The latest version is provided by [google](https://developer.android.com/sdk/installing/index.html?pkg=tools).

Now setup your $ANDROID_HOME and export it into the PATH variable

    export ANDROID_HOME=/home/thomas/Documents/android-sdk-linux
    export PATH=$ANDROID_HOME/tools:$ANDROID_HOME/plateform-tools:$PATH

## Google utils

To run this applications, your virtual machine needs 

- google services
- google applications
- google +
- google account

### Download

Download the latest version of google services from [apkmirror](http://www.apkmirror.com/apk/google-inc/google-play-services/).

In the versions list, search the last version which match `Google Play services X.X.X (XXXXXXX-070)`, for example `Google Play services 7.3.29 (1866531-070)`.

**070** means this is an `x86` version.

__________________________________________

Download the latest version of google+ from [apkmirror](http://www.apkmirror.com/apk/google-inc/google/google-5-0-0-85934159-android-4-4-x86-android-apk-download/)

__________________________________________

Download the needed version of Gapps from [cyanogenmod](http://wiki.cyanogenmod.org/w/Google_Apps) or [itvends](https://itvends.com/gapps/).

Extract it. It must contains a `system` folder

__________________________________________

### Install

Reset the adb connection and connect to the vm

    adb kill-server
    adb connect xxx.xxx.xxx.xxx

Install the google play services

    adb install com.google.android.gms-<version>.apk

Install shared library. Move to gapps directory and run

    adb remount
    adb push system/framework/com.google.android.maps.jar /system/framework
    adb push system/etc/permissions/com.google.android.maps.xml /system/etc/permissions
  
**Restart your VM** 

Install google+ 

    adb kill-server
    adb connect xxx.xxx.xxx.xxx
    adb install com.google.android.apps.plus-<version>.apk
    
Install gapps. Move to gapps directory add run
    
    adb remount
    adb push system/ /system

**Restart your VM** 

Now you can login to a google account, so you will have access to :

- google store
- updates
- applications and services
- ...

# Android Sensor Demo

## Battery

- Level
- Health
- Power source
- Status
- Technology
- Temperature
- Voltage

## Sensor

### Accelerometer

- X value
- Y value
- Z value
- Name
- Vendor
- Power
- Range
- Resolution
- History