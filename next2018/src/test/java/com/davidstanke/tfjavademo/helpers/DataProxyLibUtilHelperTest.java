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

public class DataProxyLibUtilHelperTest {
    @Test
    public void testValidDataProxyLibUtil() {
		DataProxyLibUtilHelper helper = new DataProxyLibUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidDataProxyLibUtil() {
	DataProxyLibUtilHelper helper = new DataProxyLibUtilHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileDataProxyLibUtilHelper", ".tmp"); 
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
public void testOtherFalseDataProxyLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataProxyLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataProxyLibUtil0() {
	assertFalse(16943==16943+1);
}
@Test
public void bigFalseTestDataProxyLibUtil1() {
	assertFalse(1919==1919+1);
}
@Test
public void bigFalseTestDataProxyLibUtil2() {
	assertFalse(25039==25039+1);
}
@Test
public void bigFalseTestDataProxyLibUtil3() {
	assertFalse(10445==10445+1);
}
@Test
public void bigFalseTestDataProxyLibUtil4() {
	assertFalse(22338==22338+1);
}
@Test
public void bigFalseTestDataProxyLibUtil5() {
	assertFalse(31887==31887+1);
}
@Test
public void bigFalseTestDataProxyLibUtil6() {
	assertFalse(1413==1413+1);
}
@Test
public void bigFalseTestDataProxyLibUtil7() {
	assertFalse(12767==12767+1);
}
@Test
public void bigFalseTestDataProxyLibUtil8() {
	assertFalse(27910==27910+1);
}
@Test
public void bigFalseTestDataProxyLibUtil9() {
	assertFalse(24030==24030+1);
}
@Test
public void bigFalseTestDataProxyLibUtil10() {
	assertFalse(5429==5429+1);
}
@Test
public void bigFalseTestDataProxyLibUtil11() {
	assertFalse(6950==6950+1);
}
@Test
public void bigFalseTestDataProxyLibUtil12() {
	assertFalse(27224==27224+1);
}
@Test
public void bigFalseTestDataProxyLibUtil13() {
	assertFalse(13390==13390+1);
}
@Test
public void bigFalseTestDataProxyLibUtil14() {
	assertFalse(10524==10524+1);
}
@Test
public void bigFalseTestDataProxyLibUtil15() {
	assertFalse(29679==29679+1);
}
@Test
public void bigFalseTestDataProxyLibUtil16() {
	assertFalse(11496==11496+1);
}
@Test
public void bigFalseTestDataProxyLibUtil17() {
	assertFalse(9572==9572+1);
}
@Test
public void bigFalseTestDataProxyLibUtil18() {
	assertFalse(30671==30671+1);
}
@Test
public void bigFalseTestDataProxyLibUtil19() {
	assertFalse(4158==4158+1);
}
@Test
public void bigFalseTestDataProxyLibUtil20() {
	assertFalse(695==695+1);
}
@Test
public void bigFalseTestDataProxyLibUtil21() {
	assertFalse(29983==29983+1);
}
@Test
public void bigFalseTestDataProxyLibUtil22() {
	assertFalse(16919==16919+1);
}
@Test
public void bigFalseTestDataProxyLibUtil23() {
	assertFalse(32124==32124+1);
}
@Test
public void bigFalseTestDataProxyLibUtil24() {
	assertFalse(16209==16209+1);
}
@Test
public void bigFalseTestDataProxyLibUtil25() {
	assertFalse(22651==22651+1);
}
@Test
public void bigFalseTestDataProxyLibUtil26() {
	assertFalse(8338==8338+1);
}
@Test
public void bigFalseTestDataProxyLibUtil27() {
	assertFalse(5599==5599+1);
}
@Test
public void bigFalseTestDataProxyLibUtil28() {
	assertFalse(26826==26826+1);
}
@Test
public void bigFalseTestDataProxyLibUtil29() {
	assertFalse(25796==25796+1);
}
@Test
public void bigFalseTestDataProxyLibUtil30() {
	assertFalse(3850==3850+1);
}
@Test
public void bigFalseTestDataProxyLibUtil31() {
	assertFalse(24217==24217+1);
}
@Test
public void bigFalseTestDataProxyLibUtil32() {
	assertFalse(14457==14457+1);
}
@Test
public void bigFalseTestDataProxyLibUtil33() {
	assertFalse(10139==10139+1);
}
@Test
public void bigFalseTestDataProxyLibUtil34() {
	assertFalse(20884==20884+1);
}
@Test
public void bigFalseTestDataProxyLibUtil35() {
	assertFalse(7360==7360+1);
}
@Test
public void bigFalseTestDataProxyLibUtil36() {
	assertFalse(27511==27511+1);
}
@Test
public void bigFalseTestDataProxyLibUtil37() {
	assertFalse(13257==13257+1);
}
@Test
public void bigFalseTestDataProxyLibUtil38() {
	assertFalse(3945==3945+1);
}
@Test
public void bigFalseTestDataProxyLibUtil39() {
	assertFalse(19712==19712+1);
}
@Test
public void bigFalseTestDataProxyLibUtil40() {
	assertFalse(7894==7894+1);
}
@Test
public void bigFalseTestDataProxyLibUtil41() {
	assertFalse(11975==11975+1);
}
@Test
public void bigFalseTestDataProxyLibUtil42() {
	assertFalse(16260==16260+1);
}
@Test
public void bigFalseTestDataProxyLibUtil43() {
	assertFalse(27138==27138+1);
}
@Test
public void bigFalseTestDataProxyLibUtil44() {
	assertFalse(13217==13217+1);
}
@Test
public void bigFalseTestDataProxyLibUtil45() {
	assertFalse(11017==11017+1);
}
@Test
public void bigFalseTestDataProxyLibUtil46() {
	assertFalse(17151==17151+1);
}
@Test
public void bigFalseTestDataProxyLibUtil47() {
	assertFalse(11675==11675+1);
}
@Test
public void bigFalseTestDataProxyLibUtil48() {
	assertFalse(30360==30360+1);
}
@Test
public void bigFalseTestDataProxyLibUtil49() {
	assertFalse(23310==23310+1);
}
@Test
public void bigFalseTestDataProxyLibUtil50() {
	assertFalse(18734==18734+1);
}
@Test
public void bigFalseTestDataProxyLibUtil51() {
	assertFalse(14517==14517+1);
}
@Test
public void bigFalseTestDataProxyLibUtil52() {
	assertFalse(1960==1960+1);
}
@Test
public void bigFalseTestDataProxyLibUtil53() {
	assertFalse(26921==26921+1);
}
@Test
public void bigFalseTestDataProxyLibUtil54() {
	assertFalse(22904==22904+1);
}
@Test
public void bigFalseTestDataProxyLibUtil55() {
	assertFalse(19966==19966+1);
}
}
