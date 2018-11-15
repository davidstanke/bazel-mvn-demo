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

public class AsyncMapStructProxyStringHelperTest {
    @Test
    public void testValidAsyncMapStructProxyString() {
		AsyncMapStructProxyStringHelper helper = new AsyncMapStructProxyStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncMapStructProxyString() {
	AsyncMapStructProxyStringHelper helper = new AsyncMapStructProxyStringHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileAsyncMapStructProxyStringHelper", ".tmp"); 
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
public void testFalseAsyncMapStructProxyString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAsyncMapStructProxyString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncMapStructProxyString0() {
	assertFalse(6140==6140+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString1() {
	assertFalse(2401==2401+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString2() {
	assertFalse(15466==15466+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString3() {
	assertFalse(25461==25461+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString4() {
	assertFalse(18312==18312+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString5() {
	assertFalse(20558==20558+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString6() {
	assertFalse(4557==4557+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString7() {
	assertFalse(27212==27212+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString8() {
	assertFalse(21544==21544+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString9() {
	assertFalse(31237==31237+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString10() {
	assertFalse(25321==25321+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString11() {
	assertFalse(21603==21603+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString12() {
	assertFalse(24265==24265+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString13() {
	assertFalse(12210==12210+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString14() {
	assertFalse(26699==26699+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString15() {
	assertFalse(13152==13152+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString16() {
	assertFalse(2166==2166+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString17() {
	assertFalse(1564==1564+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString18() {
	assertFalse(26264==26264+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString19() {
	assertFalse(933==933+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString20() {
	assertFalse(13702==13702+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString21() {
	assertFalse(32602==32602+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString22() {
	assertFalse(13216==13216+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString23() {
	assertFalse(31344==31344+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString24() {
	assertFalse(22405==22405+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString25() {
	assertFalse(27734==27734+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString26() {
	assertFalse(42==42+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString27() {
	assertFalse(6580==6580+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString28() {
	assertFalse(27107==27107+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString29() {
	assertFalse(27139==27139+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString30() {
	assertFalse(29306==29306+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString31() {
	assertFalse(9652==9652+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString32() {
	assertFalse(3423==3423+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString33() {
	assertFalse(30302==30302+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString34() {
	assertFalse(23970==23970+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString35() {
	assertFalse(22629==22629+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString36() {
	assertFalse(28209==28209+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString37() {
	assertFalse(22822==22822+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString38() {
	assertFalse(8590==8590+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString39() {
	assertFalse(28289==28289+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString40() {
	assertFalse(24826==24826+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString41() {
	assertFalse(23642==23642+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString42() {
	assertFalse(32717==32717+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString43() {
	assertFalse(27243==27243+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString44() {
	assertFalse(25196==25196+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString45() {
	assertFalse(4215==4215+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString46() {
	assertFalse(28959==28959+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString47() {
	assertFalse(10438==10438+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString48() {
	assertFalse(26041==26041+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString49() {
	assertFalse(6254==6254+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString50() {
	assertFalse(18372==18372+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString51() {
	assertFalse(8915==8915+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString52() {
	assertFalse(7612==7612+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString53() {
	assertFalse(14695==14695+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString54() {
	assertFalse(10879==10879+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString55() {
	assertFalse(31374==31374+1);
}
}
