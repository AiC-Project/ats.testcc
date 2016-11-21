FROM ubuntu:16.04

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV ANDROID_BUILD_TOOLS_VERSION 22.0.1
ENV ANDROID_HOME /opt/android-sdk-linux
ENV PATH ${PATH}:${ANDROID_HOME}/tools:${ANDROID_HOME}/platform-tools

RUN dpkg --add-architecture i386 && \
    apt-get update -y && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y software-properties-common && \
    apt-add-repository ppa:cwchien/gradle && \
    apt-key update && \
    apt-get update -y && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
        busybox \
        strace \
        telnet \
        net-tools \
        iputils-ping \
        mtr \
        android-tools-adb \
        gradle-2.14.1 \
        lib32z1 \
        libstdc++6:i386 \
        lib32stdc++6 \
        lib32z1 \
        libc6:i386 \
        libncurses5:i386 \
        openjdk-8-jdk \
        unzip \
        zip \
        zipalign \
        apt-utils \
        curl \
        vim && \
    apt-get clean -y && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \
    curl -sL -o /opt/sdk.tgz http://dl.google.com/android/android-sdk_r24.4.1-linux.tgz && \
    tar xfz /opt/sdk.tgz -C /opt && \
    chown -R root.root /opt/android-sdk-linux && \
    rm /opt/sdk.tgz && \
    useradd -m developer

RUN echo y | android update sdk --no-ui --all --filter android-23 | grep 'package installed'
RUN echo y | android update sdk --no-ui --all --filter android-22 | grep 'package installed'
RUN echo y | android update sdk --no-ui --all --filter platform-tools | grep 'package installed'
RUN echo y | android update sdk --no-ui --all --filter build-tools-25.0.0 | grep 'package installed'
#RUN echo y | android update sdk --no-ui --all --filter build-tools-23.0.2 | grep 'package installed'
#RUN echo y | android update sdk --no-ui --all --filter build-tools-22.0.1 | grep 'package installed'
#RUN echo y | android update sdk --no-ui --all --filter build-tools-22.0.0 | grep 'package installed'
RUN echo y | android update sdk --no-ui --all --filter extra-android-support | grep 'package installed'
RUN echo y | android update sdk --no-ui --all --filter extra-android-m2repository | grep 'package installed'
RUN echo y | android update sdk --no-ui --all --filter extra-google-m2repository | grep 'package installed'

ADD . /home/developer/
RUN chown -R developer.developer /home/developer

ENV GRADLE_USER_HOME /home/developer/

USER developer
WORKDIR /home/developer/aicdemos

RUN keytool -genkey -v -keystore /home/developer/debug.keystore -storepass android -alias androiddebugkey -keypass android -dname "CN=Android Debug,O=Android,C=US"

RUN gradle --stacktrace generateDebugSources generateDebugAndroidTestSources assembleDebug assembleDebugAndroidTest && \
    rm aicdemos/aicdemosensor/src/androidTest/java/com/zenika/aic/demo/sensor/Testing.java && \
    rm -r /home/developer/aicdemos/aicdemosensor/build && \
    chmod g+rsx ./aicdemosensor/src/androidTest/java/com/zenika/aic/demo/sensor

CMD tail -f /dev/null
