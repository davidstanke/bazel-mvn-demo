#!/bin/sh

#METHODS_LIST="StructListIOReadLib ProcSerialIOFetchWrite TensorListProxyFetchArray DataAPIUtilMap MapFetchStringUtilMap UtilMapAPI AsyncProxyDataArrayStruct TensorDataProcStructAPI ReadListUtilProxyIO NumWriteDataArrayArray StructArrayIODataArray UtilProcListLibString IOFetchStringProxyAsync UtilMapLibUtilStruct ReadAPIWriteStructNum StreamLibUtil StructStringMapTensorIO ListNumIOAPIAsync LibFetchArrayListAPI MapStringDataDataNum ArrayIOIOStream StreamAPINumNum StreamArrayReadArrayTensor ProxyUtilNumData StreamSerialStringAPIAsync MapDataStructTensorAsync ListProxySerialFetchWrite ReadNumMapStreamAsync StreamUtilStructFetchAPI AsyncFetchNumStringMap ProcUtilIOSerial AsyncReadIOTensor WriteAPILibIOList ProxyListUtilFetch Serial AsyncTensorStructIOList DataFetchStreamMapIO DataStringSerialAPI StringArrayIONum LibProxyProcStringFetch AsyncFetchStructAPIData SerialReadSerialUtilStream ProcMapReadTensor APIIOStringNumNum StructUtilWriteAPIString FetchArrayAsyncDataSerial NumProcMapAPIProxy StringStructArrayIOFetch FetchStringStructWriteNum StreamUtilAsyncStringFetch ListIO StreamDataReadDataAPI DataStructNumAPINum AsyncNumAPIIO IOLibTensorUtil ArrayStringArrayArray MapProxyIOReadIO ProxyAsyncSerialProcProc StreamMapProcDataIO StructUtilUtilListAsync SerialMapListArrayData ProxyStructWrite IOArrayRead LibLibStreamStreamAsync ProcUtilStringProxyProc FetchStructLibAsyncUtil NumNumAsyncStringProc APIProcNumArrayRead IOIOStringStreamAsync StructSerialSerialNum LibAPISerialMap ListUtilReadWrite ListFetchSerialList UtilTensorProxyProxyProc StreamStructAsyncUtil LibSerialSerialStructUtil DataProxyArrayStruct APILibFetchRead StructNumFetchNum WriteDataDataStreamIO IOProxyTensorStruct NumArrayStringTensor ProcDataFetchArray AsyncListStructReadStream NumProcLibSerialList ReadAsyncDataData StructAsyncSerialNumAPI IOAsyncListProxyProxy StructArrayArrayUtil LibArrayUtilStructSerial DataAsyncProcLib StructWriteDataSerialFetch APIStructMapList MapArrayStreamStream ArrayReadTensorReadProxy APIStringProcTensorProxy TensorSerialStructAPILib NumProxyStreamStructFetch TensorProxyFetchDataFetch NumLibDataProc DataSerialProxyAPI Fetch WriteMapTensorSerial IODataAPIWrite StructDataLibAPIList WriteFetchAsyncLibString DataTensorTensorNumFetch ProcLibReadDataIO ReadProxyTensorAsyncString ArrayNumMapProcData ArrayString APIReadDataUtilList ProcProcStructString APIUtilLibSerialList WriteStreamProcStruct MapDataArrayTensorFetch ReadMapProxySerialRead NumStringArrayMapString ReadTensorDataData FetchIOMapMapRead TensorStructUtilWrite ProcDataDataNum AsyncAPIIOListArray MapStringWriteSerial LibLibLibMapProc String TensorNumLibAsync TensorLibStringWriteArray AsyncSerialDataWriteMap TensorNumLibStreamNum IOUtilStringDataSerial LibReadProcProc StringArrayIODataAsync DataSerialDataAsync UtilListMapAPI LibAPIFetchProxyRead APISerialMapSerialAsync ArrayAsyncWriteArrayLib StringFetch NumListStructWriteIO AsyncAPIArrayIOFetch TensorStreamWriteString APIProcStringTensorAPI LibIOArrayNumList ProxyNumStreamArrayAPI ReadAPISerialDataProxy NumIONumReadNum ProxyUtilStructProc ReadReadDataStruct APISerialAPIMap WriteMapStreamTensor StringTensorStreamStruct StreamFetchAPIAsync LibFetchFetchList Map FetchTensorTensorLib StringArrayNumFetchStream APIIOStructLibAsync DataMapFetchSerial IOSerial StringStructListSerialIO DataAPIStringFetch SerialFetchUtilIOSerial ReadDataDataTensorStruct ProcDataUtilAsyncAPI WriteUtilStructWriteUtil TensorNumNumSerialWrite ReadReadWriteStruct AsyncStruct AsyncTensorSerialFetch StringStreamStringLibWrite StringArrayIOList DataStringSerialUtilProxy LibNumLibStringList IOListAPIArray ProxyAPISerialTensorRead APIListAPIMapLib UtilLib DataLibUtilTensorAsync UtilProcDataStreamProxy WriteArrayAsync ListReadAPILibFetch TensorReadStructLibStream FetchStructIOSerialData SerialProcLibStreamRead ArrayUtilDataStreamProc FetchListDataProc WriteAPIIOAsync AsyncMapReadProxy LibUtil ProxyUtilLibProxyData StructStructSerialMap ArrayUtilArrayStream ArrayStructTensorStruct LibFetch ProxyTensorDataStructStream StringIOArrayLibLib SerialSerial TensorProcProxyProxySerial ReadNumMapNum AsyncMapProcLibIO ProcWriteStructTensor TensorAsyncArrayReadStruct StreamStringLibListList ArrayStructWriteReadTensor IOIOProxyStream StructListLibAPIList IOStructStructTensorWrite ReadIOStructProxyWrite WriteSerialLibLibLib IOAsyncFetchSerialIO StreamIOIOSerialStream ProcAPIIO StructLibListStringMap MapAsyncReadSerialData ProcDataLibString ProcSerialAsyncStringData Stream FetchArrayDataNum IOStringUtilLibAPI StringAPI APIDataNumStructIO FetchTensorUtilSerial StreamFetchFetchLibRead IOStringAPIFetchAsync WriteWriteMapAsyncAsync StreamListProcSerialArray ArrayIOStructUtilSerial IOWriteUtilProc LibNumStreamStreamAPI StructNumWriteStruct WriteTensorDataSerialFetch ListStreamStructWriteData MapWriteProxyMap FetchProxyProxyFetch NumReadMapMap ListNumArrayAsync UtilAPIWriteDataNum ListLibMapArrayList IOReadWriteArrayProc ProcNumIOListNum ListReadAPILibProxy ArrayIONumStreamProxy UtilMapAsyncProcLib ProcAPIStructWriteStruct ArrayFetchList ProxyWriteStructTensorWrite UtilArrayNumMap StreamAsyncNumProxy TensorAsync StructReadDataUtil APIIOListStringProc FetchNumFetchStreamIO DataReadAsyncTensorUtil ArrayTensorWriteProc AsyncTensorStructReadNum UtilMapListFetch SerialLibAPIUtilWrite WriteListProcRead FetchMapProxySerialProc DataFetchAsyncFetch UtilReadProxyStream AsyncListAPIMap MapListLibAsyncUtil MapArrayIO DataProxyLibUtil WriteLibMapTensorTensor TensorAPIWriteAPIWrite ReadReadWriteMap StreamMapSerialWrite StringStringTensorList StructSerialProxyAPI StringProxyReadListAsync ProxyArrayLib UtilArrayDataFetchRead ReadWriteAPIAPIStream StreamIOProcStreamStream LibAPIStreamUtilStream ProcProcUtilAPI StringProxyAPIFetchAPI TensorProxyStringNumAPI SerialLibDataTensor TensorMapNumStream LibWriteLibLib LibMapIOLib AsyncLibAsyncStringIO StructMapMapRead StructSerialList AsyncMapStructProxyString TensorStructTensorProxy ArrayStreamWrite NumStringMapDataList ArrayWriteAPIDataArray DataUtilLibStructData StreamFetchStreamStructSerial Lib FetchUtilWriteMapStruct IOStructArrayStreamLib"

METHODS_LIST="MapArrayIO DataProxyLibUtil WriteLibMapTensorTensor TensorAPIWriteAPIWrite ReadReadWriteMap StreamMapSerialWrite StringStringTensorList StructSerialProxyAPI StringProxyReadListAsync ProxyArrayLib UtilArrayDataFetchRead ReadWriteAPIAPIStream StreamIOProcStreamStream LibAPIStreamUtilStream ProcProcUtilAPI StringProxyAPIFetchAPI TensorProxyStringNumAPI SerialLibDataTensor TensorMapNumStream LibWriteLibLib LibMapIOLib AsyncLibAsyncStringIO StructMapMapRead StructSerialList AsyncMapStructProxyString TensorStructTensorProxy ArrayStreamWrite NumStringMapDataList ArrayWriteAPIDataArray DataUtilLibStructData StreamFetchStreamStructSerial Lib FetchUtilWriteMapStruct IOStructArrayStreamLib"


#METHODS_LIST="StructListIOReadLib ProcSerialIOFetchWrite"
PARENT_DIR=$(cd .. && PWD)
TARGETDIR_MAIN=$PARENT_DIR/src/main/java/com/davidstanke/tfjavademo/helpers
TARGETDIR_TEST=$PARENT_DIR/src/test/java/com/davidstanke/tfjavademo/helpers
BUILD_CONTENTS=add_to_buildfile.txt

echo "creating directory (if not already present): $TARGETDIR_MAIN"
mkdir -p $TARGETDIR_MAIN
echo "creating directory (if not already present): $TARGETDIR_TEST"
mkdir -p $TARGETDIR_TEST

#cleanup
echo "deleting all contents of $TARGETDIR_MAIN"
rm -f $TARGETDIR_MAIN/*
echo "deleting all contents of $TARGETDIR_TEST"
rm -f $TARGETDIR_TEST/*

rm $BUILD_CONTENTS
touch $BUILD_CONTENTS

for i in $METHODS_LIST
do
THIS_METHOD="${i}Helper"
FILENAME_MAIN=${TARGETDIR_MAIN}/$THIS_METHOD.java

echo "writing $FILENAME_MAIN"

cat > $FILENAME_MAIN << EOF
package com.davidstanke.tfjavademo.helpers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class $THIS_METHOD {
	public static String help() {
		return "valid";
	}
	
	private static void writeToText() {
		String writeMe = "hello";
        try {
            Files.write(Paths.get("~/tmp/txt/${THIS_METHOD}.txt"), writeMe.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
EOF

FILENAME_TEST=${TARGETDIR_TEST}/${THIS_METHOD}Test.java

echo "writing $FILENAME_TEST"

cat > $FILENAME_TEST << EOF
package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ${THIS_METHOD}Test {
    @Test
    public void testValid${i}() {
		${THIS_METHOD} helper = new ${THIS_METHOD}();
		assertEquals(helper.help(),"valid");
    }
EOF

if (($RANDOM > 16000))
then
cat >> $FILENAME_TEST << EOF
@Test
public void testDoubleValid${i}() {
	${THIS_METHOD} helper = new ${THIS_METHOD}();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfile${THIS_METHOD}", ".tmp"); 
		//Get tempropary file path
		String absolutePath = temp.getAbsolutePath();
		String tempFilePath = absolutePath.
		    substring(0,absolutePath.lastIndexOf(File.separator));

		//System.out.println("Temp file path : " + tempFilePath);
	
    //write it
	    BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
	    for(int i=0; i<2999999; i++) {
			bw.write(i + "\n");
		}
	    bw.close();
		
		// read it
		byte[] myBytes = Files.readAllBytes(temp.toPath());
		
		// randomize it
		List<Byte> myBytesList = new ArrayList<>();
		for(int i = 1; i<myBytes.length; i++) {
			myBytesList.add(myBytes[i]);
		}
		Collections.shuffle(myBytesList);
		
		
		
	}catch(IOException e){
	
	    e.printStackTrace();
	
	}
	
	assertEquals(helper.help() + helper.help(),"validvalid");
}
EOF
fi

if (($RANDOM > 16000))
then
cat >> $FILENAME_TEST << EOF
@Test
public void testFalse${i}() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
EOF
fi

if (($RANDOM > 16000))
then
cat >> $FILENAME_TEST << EOF
@Test
public void testOtherFalse${i}() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
EOF
fi

if (($RANDOM > 16000))
then
cat >> $FILENAME_TEST << EOF
@Test
public void testAnotherFalse${i}() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
EOF
fi

if (($RANDOM > 16000))
then
cat >> $FILENAME_TEST << EOF
@Test
public void testThisFalse${i}() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
EOF
fi

echo '}' >> $FILENAME_TEST

cat >> $BUILD_CONTENTS << EOF
java_library(name="${THIS_METHOD}",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/${THIS_METHOD}.java"])
java_test(name="${THIS_METHOD}Test",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/${THIS_METHOD}Test.java"],deps=[":${THIS_METHOD}",":Greeter"])
EOF
	
done