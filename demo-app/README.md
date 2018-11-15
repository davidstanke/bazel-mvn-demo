# TensorFlow/Java Build demo

## about
This project provides a comparison between build systems/techniques. It's a simple Java application that wraps TensorFlow's Java JNI wrapper, which calls a native library. It has a dependency on the Apache Commons "lang3" Java library, which is vendored beneath this folder. There are also a number of not-terribly-useful generated Java libraries, designed to increase the complexity of the build.

This application has been successfully built on Ubuntu 16.04. It _should_ work on other OSes, though native library install may be different.

### Setup
* Required software
  * Bazel 0.15+
    * Maven 3+
* Setup local machine (at root of repo)
  * Run `./configure` to prepare TensorFlow Bazel workspace
    * Note: this might fail b/c the repo is pre-configured with an Ubuntu config. TBH I'm not sure what happens if you try to configure over it.
  * Build the TF native library and Java wrapper: `bazel build //tensorflow/java:pom`
  * Configure the local JDK to load the native library: add `export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:${cwd}/bazel-bin/tensorflow/java` to ~/.bashrc; `source ~/.bashrc`
* Setup GCP (at root of repo)
  * Authenticate: `gcloud init` --> choose project "btd-pm" and default zone "us-central1-c"
  * Copy service account credentials: `gsutil cp gs://next2018-demo-bazel/creds/demo-cred.json ./creds/`

### Building
Run commands in this directory
#### To build and run JAVA APP with Maven:
`mvn test`
#### To build and run JAVA PP with Bazel (local execution):
`bazel test :all`

#### To build TF with Bazel (local execution):
`bazel test //tensorflow/core/util/...`
#### To build TF with Bazel (remote execution):
`bazel test ... --config=rbe && bazel run tfjavademo --config=rbe`

### Demo script
1. Java change: Edit a file in src/main/java/org/apache/commons/lang3/
1. Re-run Maven and Bazel (local): both should re-execute JUnit tests
1. C++ chnange: Edit ../tensorflow/core/kernels/???
1. Re-run Bazel (local) and Bazel (remote): both should re-execute C++ tests