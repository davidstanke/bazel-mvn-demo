# TensorFlow/Java Build demo

## about
This project provides a comparison between build systems/techniques. It's a simple Java application that wraps TensorFlow's Java JNI wrapper, which calls a native library. There are also a number of not-terribly-useful generated Java libraries, designed to increase the complexity of the build. The codebase is a disconnected fork of TensorFlow1 1.9, with the demo app added (in folder `demo-app`), and a few tweaks to TF to facilitate the demo.

This application has been successfully built on Ubuntu 16.04. It _should_ work on other OSes, though native library install may be different.

### Setup
* Required software
  * Bazel 0.18 [doesn't work with 19]
    * Maven 3+
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
  * `java -jar target/tfjavademo-0.1-jar-with-dependencies.jar` [TODO: change to `mvn exec` or other]
* Build with Bazel and verify that it runs
  * `bazel test :all`
  * `bazel run tfjavademo`
  * `bazel test :all --config=rbe && bazel run tfjavademo --config=rbe`

### Demo script part A
1. Show app:
  * `cd demo-app`
  * `java -jar target/tfjavademo-0.1-jar-with-dependencies.jar`
1. Java change:
  * `vim demo-app/src/main/java/com/davidstanke/Greeter.java`
1. Test:
  * `mvn test` / `bazel test :all` 
  * [fail]
1. Fix:
  * `vim demo-app/src/test/java/com/davidstanke/GreeterTest.java`
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