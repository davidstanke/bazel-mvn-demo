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

public class ProxyArrayLibHelperTest {
    @Test
    public void testValidProxyArrayLib() {
		ProxyArrayLibHelper helper = new ProxyArrayLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProxyArrayLib() {
	ProxyArrayLibHelper helper = new ProxyArrayLibHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileProxyArrayLibHelper", ".tmp"); 
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
public void testFalseProxyArrayLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProxyArrayLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProxyArrayLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxyArrayLib0() {
	assertFalse(9121==9121+1);
}
@Test
public void bigFalseTestProxyArrayLib1() {
	assertFalse(16763==16763+1);
}
@Test
public void bigFalseTestProxyArrayLib2() {
	assertFalse(15660==15660+1);
}
@Test
public void bigFalseTestProxyArrayLib3() {
	assertFalse(31682==31682+1);
}
@Test
public void bigFalseTestProxyArrayLib4() {
	assertFalse(6427==6427+1);
}
@Test
public void bigFalseTestProxyArrayLib5() {
	assertFalse(11331==11331+1);
}
@Test
public void bigFalseTestProxyArrayLib6() {
	assertFalse(27555==27555+1);
}
@Test
public void bigFalseTestProxyArrayLib7() {
	assertFalse(14254==14254+1);
}
@Test
public void bigFalseTestProxyArrayLib8() {
	assertFalse(29477==29477+1);
}
@Test
public void bigFalseTestProxyArrayLib9() {
	assertFalse(32510==32510+1);
}
@Test
public void bigFalseTestProxyArrayLib10() {
	assertFalse(14956==14956+1);
}
@Test
public void bigFalseTestProxyArrayLib11() {
	assertFalse(3837==3837+1);
}
@Test
public void bigFalseTestProxyArrayLib12() {
	assertFalse(29616==29616+1);
}
@Test
public void bigFalseTestProxyArrayLib13() {
	assertFalse(6065==6065+1);
}
@Test
public void bigFalseTestProxyArrayLib14() {
	assertFalse(3220==3220+1);
}
@Test
public void bigFalseTestProxyArrayLib15() {
	assertFalse(16687==16687+1);
}
@Test
public void bigFalseTestProxyArrayLib16() {
	assertFalse(12123==12123+1);
}
@Test
public void bigFalseTestProxyArrayLib17() {
	assertFalse(23557==23557+1);
}
@Test
public void bigFalseTestProxyArrayLib18() {
	assertFalse(32536==32536+1);
}
@Test
public void bigFalseTestProxyArrayLib19() {
	assertFalse(25143==25143+1);
}
@Test
public void bigFalseTestProxyArrayLib20() {
	assertFalse(27757==27757+1);
}
@Test
public void bigFalseTestProxyArrayLib21() {
	assertFalse(29325==29325+1);
}
@Test
public void bigFalseTestProxyArrayLib22() {
	assertFalse(30277==30277+1);
}
@Test
public void bigFalseTestProxyArrayLib23() {
	assertFalse(4766==4766+1);
}
@Test
public void bigFalseTestProxyArrayLib24() {
	assertFalse(30094==30094+1);
}
@Test
public void bigFalseTestProxyArrayLib25() {
	assertFalse(17623==17623+1);
}
@Test
public void bigFalseTestProxyArrayLib26() {
	assertFalse(9426==9426+1);
}
@Test
public void bigFalseTestProxyArrayLib27() {
	assertFalse(3703==3703+1);
}
@Test
public void bigFalseTestProxyArrayLib28() {
	assertFalse(23624==23624+1);
}
@Test
public void bigFalseTestProxyArrayLib29() {
	assertFalse(5684==5684+1);
}
@Test
public void bigFalseTestProxyArrayLib30() {
	assertFalse(26809==26809+1);
}
@Test
public void bigFalseTestProxyArrayLib31() {
	assertFalse(16134==16134+1);
}
@Test
public void bigFalseTestProxyArrayLib32() {
	assertFalse(26434==26434+1);
}
@Test
public void bigFalseTestProxyArrayLib33() {
	assertFalse(15175==15175+1);
}
@Test
public void bigFalseTestProxyArrayLib34() {
	assertFalse(6618==6618+1);
}
@Test
public void bigFalseTestProxyArrayLib35() {
	assertFalse(15151==15151+1);
}
@Test
public void bigFalseTestProxyArrayLib36() {
	assertFalse(10294==10294+1);
}
@Test
public void bigFalseTestProxyArrayLib37() {
	assertFalse(15952==15952+1);
}
@Test
public void bigFalseTestProxyArrayLib38() {
	assertFalse(9807==9807+1);
}
@Test
public void bigFalseTestProxyArrayLib39() {
	assertFalse(25248==25248+1);
}
@Test
public void bigFalseTestProxyArrayLib40() {
	assertFalse(30135==30135+1);
}
@Test
public void bigFalseTestProxyArrayLib41() {
	assertFalse(31798==31798+1);
}
@Test
public void bigFalseTestProxyArrayLib42() {
	assertFalse(6285==6285+1);
}
@Test
public void bigFalseTestProxyArrayLib43() {
	assertFalse(32702==32702+1);
}
@Test
public void bigFalseTestProxyArrayLib44() {
	assertFalse(17573==17573+1);
}
@Test
public void bigFalseTestProxyArrayLib45() {
	assertFalse(1622==1622+1);
}
@Test
public void bigFalseTestProxyArrayLib46() {
	assertFalse(25407==25407+1);
}
@Test
public void bigFalseTestProxyArrayLib47() {
	assertFalse(7248==7248+1);
}
@Test
public void bigFalseTestProxyArrayLib48() {
	assertFalse(7531==7531+1);
}
@Test
public void bigFalseTestProxyArrayLib49() {
	assertFalse(21774==21774+1);
}
@Test
public void bigFalseTestProxyArrayLib50() {
	assertFalse(3810==3810+1);
}
@Test
public void bigFalseTestProxyArrayLib51() {
	assertFalse(29934==29934+1);
}
@Test
public void bigFalseTestProxyArrayLib52() {
	assertFalse(10495==10495+1);
}
@Test
public void bigFalseTestProxyArrayLib53() {
	assertFalse(5896==5896+1);
}
@Test
public void bigFalseTestProxyArrayLib54() {
	assertFalse(9505==9505+1);
}
@Test
public void bigFalseTestProxyArrayLib55() {
	assertFalse(14119==14119+1);
}
}
