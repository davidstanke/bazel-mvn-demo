# Description:
# A simple Java application based on TensorFlow's java example

java_binary(
    name="tfjavademo",
    srcs=glob(["src/main/java/com/davidstanke/**/*.java"]),
    main_class = "com.davidstanke.tfjavademo.TFJavaDemo",
    deps = ["//tensorflow/java:tensorflow"],
    data = [":images",":model"]
)

filegroup(
	name = "images",
	srcs = glob([
		"img/*",
	]),
)

filegroup(
	name = "model",
	srcs=glob(["model/*"]),
)

java_library(
	name="Greeter",
	srcs=["src/main/java/com/davidstanke/tfjavademo/Greeter.java"],
)

java_test(
	name="GreeterTest",
	srcs=["src/test/java/com/davidstanke/tfjavademo/GreeterTest.java"],
	deps=[":Greeter","//tensorflow/core"],
	runtime_deps=["//tensorflow/java:tensorflow"]
)


#CODEGEN TESTS AFTER HERE
java_library(name="MapArrayIOHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/MapArrayIOHelper.java"])
java_test(name="MapArrayIOHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/MapArrayIOHelperTest.java"],deps=[":MapArrayIOHelper",":Greeter"])
java_library(name="DataProxyLibUtilHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/DataProxyLibUtilHelper.java"])
java_test(name="DataProxyLibUtilHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/DataProxyLibUtilHelperTest.java"],deps=[":DataProxyLibUtilHelper",":Greeter"])
java_library(name="WriteLibMapTensorTensorHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/WriteLibMapTensorTensorHelper.java"])
java_test(name="WriteLibMapTensorTensorHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/WriteLibMapTensorTensorHelperTest.java"],deps=[":WriteLibMapTensorTensorHelper",":Greeter"])
java_library(name="TensorAPIWriteAPIWriteHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/TensorAPIWriteAPIWriteHelper.java"])
java_test(name="TensorAPIWriteAPIWriteHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/TensorAPIWriteAPIWriteHelperTest.java"],deps=[":TensorAPIWriteAPIWriteHelper",":Greeter"])
java_library(name="ReadReadWriteMapHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/ReadReadWriteMapHelper.java"])
java_test(name="ReadReadWriteMapHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/ReadReadWriteMapHelperTest.java"],deps=[":ReadReadWriteMapHelper",":Greeter"])
java_library(name="StreamMapSerialWriteHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StreamMapSerialWriteHelper.java"])
java_test(name="StreamMapSerialWriteHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StreamMapSerialWriteHelperTest.java"],deps=[":StreamMapSerialWriteHelper",":Greeter"])
java_library(name="StringStringTensorListHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StringStringTensorListHelper.java"])
java_test(name="StringStringTensorListHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StringStringTensorListHelperTest.java"],deps=[":StringStringTensorListHelper",":Greeter"])
java_library(name="StructSerialProxyAPIHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StructSerialProxyAPIHelper.java"])
java_test(name="StructSerialProxyAPIHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StructSerialProxyAPIHelperTest.java"],deps=[":StructSerialProxyAPIHelper",":Greeter"])
java_library(name="StringProxyReadListAsyncHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StringProxyReadListAsyncHelper.java"])
java_test(name="StringProxyReadListAsyncHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StringProxyReadListAsyncHelperTest.java"],deps=[":StringProxyReadListAsyncHelper",":Greeter"])
java_library(name="ProxyArrayLibHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/ProxyArrayLibHelper.java"])
java_test(name="ProxyArrayLibHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/ProxyArrayLibHelperTest.java"],deps=[":ProxyArrayLibHelper",":Greeter"])
java_library(name="UtilArrayDataFetchReadHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/UtilArrayDataFetchReadHelper.java"])
java_test(name="UtilArrayDataFetchReadHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/UtilArrayDataFetchReadHelperTest.java"],deps=[":UtilArrayDataFetchReadHelper",":Greeter"])
java_library(name="ReadWriteAPIAPIStreamHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/ReadWriteAPIAPIStreamHelper.java"])
java_test(name="ReadWriteAPIAPIStreamHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/ReadWriteAPIAPIStreamHelperTest.java"],deps=[":ReadWriteAPIAPIStreamHelper",":Greeter"])
java_library(name="StreamIOProcStreamStreamHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StreamIOProcStreamStreamHelper.java"])
java_test(name="StreamIOProcStreamStreamHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StreamIOProcStreamStreamHelperTest.java"],deps=[":StreamIOProcStreamStreamHelper",":Greeter"])
java_library(name="LibAPIStreamUtilStreamHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/LibAPIStreamUtilStreamHelper.java"])
java_test(name="LibAPIStreamUtilStreamHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/LibAPIStreamUtilStreamHelperTest.java"],deps=[":LibAPIStreamUtilStreamHelper",":Greeter"])
java_library(name="ProcProcUtilAPIHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/ProcProcUtilAPIHelper.java"])
java_test(name="ProcProcUtilAPIHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/ProcProcUtilAPIHelperTest.java"],deps=[":ProcProcUtilAPIHelper",":Greeter"])
java_library(name="StringProxyAPIFetchAPIHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StringProxyAPIFetchAPIHelper.java"])
java_test(name="StringProxyAPIFetchAPIHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StringProxyAPIFetchAPIHelperTest.java"],deps=[":StringProxyAPIFetchAPIHelper",":Greeter"])
java_library(name="TensorProxyStringNumAPIHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/TensorProxyStringNumAPIHelper.java"])
java_test(name="TensorProxyStringNumAPIHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/TensorProxyStringNumAPIHelperTest.java"],deps=[":TensorProxyStringNumAPIHelper",":Greeter"])
java_library(name="SerialLibDataTensorHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/SerialLibDataTensorHelper.java"])
java_test(name="SerialLibDataTensorHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/SerialLibDataTensorHelperTest.java"],deps=[":SerialLibDataTensorHelper",":Greeter"])
java_library(name="TensorMapNumStreamHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/TensorMapNumStreamHelper.java"])
java_test(name="TensorMapNumStreamHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/TensorMapNumStreamHelperTest.java"],deps=[":TensorMapNumStreamHelper",":Greeter"])
java_library(name="LibWriteLibLibHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/LibWriteLibLibHelper.java"])
java_test(name="LibWriteLibLibHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/LibWriteLibLibHelperTest.java"],deps=[":LibWriteLibLibHelper",":Greeter"])
java_library(name="LibMapIOLibHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/LibMapIOLibHelper.java"])
java_test(name="LibMapIOLibHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/LibMapIOLibHelperTest.java"],deps=[":LibMapIOLibHelper",":Greeter"])
java_library(name="AsyncLibAsyncStringIOHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/AsyncLibAsyncStringIOHelper.java"])
java_test(name="AsyncLibAsyncStringIOHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/AsyncLibAsyncStringIOHelperTest.java"],deps=[":AsyncLibAsyncStringIOHelper",":Greeter"])
java_library(name="StructMapMapReadHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StructMapMapReadHelper.java"])
java_test(name="StructMapMapReadHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StructMapMapReadHelperTest.java"],deps=[":StructMapMapReadHelper",":Greeter"])
java_library(name="StructSerialListHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StructSerialListHelper.java"])
java_test(name="StructSerialListHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StructSerialListHelperTest.java"],deps=[":StructSerialListHelper",":Greeter"])
java_library(name="AsyncMapStructProxyStringHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/AsyncMapStructProxyStringHelper.java"])
java_test(name="AsyncMapStructProxyStringHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/AsyncMapStructProxyStringHelperTest.java"],deps=[":AsyncMapStructProxyStringHelper",":Greeter"])
java_library(name="TensorStructTensorProxyHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/TensorStructTensorProxyHelper.java"])
java_test(name="TensorStructTensorProxyHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/TensorStructTensorProxyHelperTest.java"],deps=[":TensorStructTensorProxyHelper",":Greeter"])
java_library(name="ArrayStreamWriteHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/ArrayStreamWriteHelper.java"])
java_test(name="ArrayStreamWriteHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/ArrayStreamWriteHelperTest.java"],deps=[":ArrayStreamWriteHelper",":Greeter"])
java_library(name="NumStringMapDataListHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/NumStringMapDataListHelper.java"])
java_test(name="NumStringMapDataListHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/NumStringMapDataListHelperTest.java"],deps=[":NumStringMapDataListHelper",":Greeter"])
java_library(name="ArrayWriteAPIDataArrayHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/ArrayWriteAPIDataArrayHelper.java"])
java_test(name="ArrayWriteAPIDataArrayHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/ArrayWriteAPIDataArrayHelperTest.java"],deps=[":ArrayWriteAPIDataArrayHelper",":Greeter"])
java_library(name="DataUtilLibStructDataHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/DataUtilLibStructDataHelper.java"])
java_test(name="DataUtilLibStructDataHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/DataUtilLibStructDataHelperTest.java"],deps=[":DataUtilLibStructDataHelper",":Greeter"])
java_library(name="StreamFetchStreamStructSerialHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/StreamFetchStreamStructSerialHelper.java"])
java_test(name="StreamFetchStreamStructSerialHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/StreamFetchStreamStructSerialHelperTest.java"],deps=[":StreamFetchStreamStructSerialHelper",":Greeter"])
java_library(name="LibHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/LibHelper.java"])
java_test(name="LibHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/LibHelperTest.java"],deps=[":LibHelper",":Greeter"])
java_library(name="FetchUtilWriteMapStructHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/FetchUtilWriteMapStructHelper.java"])
java_test(name="FetchUtilWriteMapStructHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/FetchUtilWriteMapStructHelperTest.java"],deps=[":FetchUtilWriteMapStructHelper",":Greeter"])
java_library(name="IOStructArrayStreamLibHelper",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/IOStructArrayStreamLibHelper.java"])
java_test(name="IOStructArrayStreamLibHelperTest",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/IOStructArrayStreamLibHelperTest.java"],deps=[":IOStructArrayStreamLibHelper",":Greeter"])
