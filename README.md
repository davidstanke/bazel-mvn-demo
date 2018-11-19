# TensorFlow/Java Build demo

## about
This project provides a comparison between build systems/techniques. It's a simple Java application that wraps TensorFlow's Java JNI wrapper, which calls a native library. There are also a number of not-terribly-useful generated Java libraries, designed to increase the complexity of the build. The codebase is a disconnected fork of TensorFlow1 1.9, with the demo app added (in folder `demo-app`), and a few tweaks to TF to facilitate the demo.

This application has been successfully built on Ubuntu 16.04. It _should_ work on other OSes, though native library install may be different.

### Setup
* Required software
  * Combined prereqs: `sudo apt-get install pkg-config zip g++ zlib1g-dev unzip python python-dev python-pip openjdk-8-jdk`
  * PIP bits: `pip install -U --user pip six numpy wheel mock`
  * Maven: `sudo apt-get install maven`
  * Bazel 0.15 [UPDATE 2018-11-19... seems to be working on newer versions of Bazel]
    * `wget https://github.com/bazelbuild/bazel/releases/download/0.15.2/bazel-0.15.2-installer-linux-x86_64.sh`
    * `chmod +x bazel-0.15[...]`
    * `./bazel-0.15[...].sh --user`
* Setup local machine (at root of repo)
  * Run `./configure` to prepare TensorFlow Bazel workspace
    * Note: this might fail b/c the repo is pre-configured with an Ubuntu config. TBH I'm not sure what happens if you try to configure over it.
  * Build the TF native library and Java wrapper: 
    * `bazel build //tensorflow/java:tensorflow`
    * `bazel build //tensorflow/java:libtensorflow_jni`
    * `bazel build //tensorflow/java:pom` [??? needed]
  * Configure the local JDK to load the native library:
   ```
    echo "export LD_LIBRARY_PATH=\$LD_LIBRARY_PATH:${PWD}/bazel-bin/tensorflow/java" >> ~/.bashrc
    source ~/.bashrc
    ``` 
* Setup GCP (at root of repo)
  * Authenticate: `gcloud init` --> choose project "btd-pm" and default zone "us-central1-c"
  * Copy service account credentials: `gsutil cp gs://next2018-demo-bazel/creds/demo-cred.json ./creds/`
* Build with Maven and verify that it runs
  * `cd demo-app && mvn package`
  * `./demo.sh`
* Build with Bazel and verify that it runs
  * `bazel test :all`
  * `bazel run tfjavademo`
  * `bazel test :all --config=rbe && bazel run tfjavademo --config=rbe`

### Demo script part A
1. Show app:
  * `cd demo-app`
  * `java -jar target/tfjavademo-0.1-jar-with-dependencies.jar`
1. Java change:
  * `vim src/main/java/com/davidstanke/tfjavademo/Greeter.java`
1. Test:
  * `mvn test` / `bazel test :all` 
  * [fail]
1. Fix:
  * `vim src/test/java/com/davidstanke/tfjavademo/GreeterTest.java`
  * `mvn test` / `bazel test :all`

### Demo script part B
1. C++ change:
  * `cd ../tensorflow/core/`
  * `vim lib/strings/numbers.h`
1. Test:  
  * `bazel test :all` / `bazel test :all --config=rbe`
  * [fail]
1. Fix:
  * `vim lib/stirngs/numbers_test.cc`
  * `bazel test :all --config=rbe`