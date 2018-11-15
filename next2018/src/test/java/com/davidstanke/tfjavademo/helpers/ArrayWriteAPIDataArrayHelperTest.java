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

public class ArrayWriteAPIDataArrayHelperTest {
    @Test
    public void testValidArrayWriteAPIDataArray() {
		ArrayWriteAPIDataArrayHelper helper = new ArrayWriteAPIDataArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayWriteAPIDataArray() {
	ArrayWriteAPIDataArrayHelper helper = new ArrayWriteAPIDataArrayHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileArrayWriteAPIDataArrayHelper", ".tmp"); 
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
@Test
public void testFalseArrayWriteAPIDataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray0() {
	assertFalse(21228==21228+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray1() {
	assertFalse(9054==9054+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray2() {
	assertFalse(26371==26371+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray3() {
	assertFalse(9255==9255+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray4() {
	assertFalse(8247==8247+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray5() {
	assertFalse(21290==21290+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray6() {
	assertFalse(24870==24870+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray7() {
	assertFalse(10840==10840+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray8() {
	assertFalse(26579==26579+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray9() {
	assertFalse(31927==31927+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray10() {
	assertFalse(18899==18899+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray11() {
	assertFalse(29522==29522+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray12() {
	assertFalse(1802==1802+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray13() {
	assertFalse(28865==28865+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray14() {
	assertFalse(19638==19638+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray15() {
	assertFalse(24216==24216+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray16() {
	assertFalse(9534==9534+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray17() {
	assertFalse(13290==13290+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray18() {
	assertFalse(4597==4597+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray19() {
	assertFalse(5530==5530+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray20() {
	assertFalse(6873==6873+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray21() {
	assertFalse(14644==14644+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray22() {
	assertFalse(27896==27896+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray23() {
	assertFalse(8330==8330+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray24() {
	assertFalse(23288==23288+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray25() {
	assertFalse(18492==18492+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray26() {
	assertFalse(11259==11259+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray27() {
	assertFalse(27902==27902+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray28() {
	assertFalse(19414==19414+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray29() {
	assertFalse(2871==2871+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray30() {
	assertFalse(21589==21589+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray31() {
	assertFalse(8778==8778+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray32() {
	assertFalse(14842==14842+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray33() {
	assertFalse(174==174+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray34() {
	assertFalse(22405==22405+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray35() {
	assertFalse(24475==24475+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray36() {
	assertFalse(21025==21025+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray37() {
	assertFalse(19705==19705+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray38() {
	assertFalse(3329==3329+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray39() {
	assertFalse(16340==16340+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray40() {
	assertFalse(19945==19945+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray41() {
	assertFalse(10109==10109+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray42() {
	assertFalse(31935==31935+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray43() {
	assertFalse(16168==16168+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray44() {
	assertFalse(16194==16194+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray45() {
	assertFalse(24485==24485+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray46() {
	assertFalse(18048==18048+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray47() {
	assertFalse(24188==24188+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray48() {
	assertFalse(9876==9876+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray49() {
	assertFalse(13729==13729+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray50() {
	assertFalse(12767==12767+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray51() {
	assertFalse(8314==8314+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray52() {
	assertFalse(16304==16304+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray53() {
	assertFalse(737==737+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray54() {
	assertFalse(13085==13085+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray55() {
	assertFalse(15477==15477+1);
}
}
