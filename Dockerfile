FROM ubuntu:15.10

ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64
ENV ANDROID_API_LEVELS android-22,android-23
ENV ANDROID_BUILD_TOOLS_VERSION 22.0.1
ENV ANDROID_HOME /opt/android-sdk-linux
ENV PATH ${PATH}:${ANDROID_HOME}/tools:${ANDROID_HOME}/platform-tools

RUN dpkg --add-architecture i386 && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y software-properties-common && \
    apt-add-repository ppa:cwchien/gradle && \
    apt-key update && \
    apt-get update -y && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
        android-tools-adb \
        gradle-2.8 \
        lib32z1 \
        libstdc++6:i386 \
        lib32stdc++6 \
        lib32z1 \
        libc6:i386 \
        libncurses5:i386 \
        software-properties-common \
        openjdk-7-jdk \
        apt-utils \
        curl \
        vim \
        expect && \
    apt-get clean -y && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

COPY install_android_sdk.expect /

RUN curl -sL -o /opt/sdk.tgz http://dl.google.com/android/android-sdk_r24.4.1-linux.tgz && \
    tar xfz /opt/sdk.tgz -C /opt && \
    chown -R root.root /opt/android-sdk-linux && \
    rm /opt/sdk.tgz

RUN expect /install_android_sdk.expect && rm ${ANDROID_HOME}/temp/*

RUN useradd -m developer

COPY ./build /home/developer/aic_tests

#RUN mkdir /home/developer/aic_tests/Test

RUN chown -R developer.developer /home/developer
ENV GRADLE_USER_HOME /home/developer/aic_tests

USER developer
