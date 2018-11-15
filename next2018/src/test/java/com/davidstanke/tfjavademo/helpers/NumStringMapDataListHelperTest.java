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

public class NumStringMapDataListHelperTest {
    @Test
    public void testValidNumStringMapDataList() {
		NumStringMapDataListHelper helper = new NumStringMapDataListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumStringMapDataList() {
	NumStringMapDataListHelper helper = new NumStringMapDataListHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileNumStringMapDataListHelper", ".tmp"); 
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
public void testThisFalseNumStringMapDataList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStringMapDataList0() {
	assertFalse(17150==17150+1);
}
@Test
public void bigFalseTestNumStringMapDataList1() {
	assertFalse(30629==30629+1);
}
@Test
public void bigFalseTestNumStringMapDataList2() {
	assertFalse(7054==7054+1);
}
@Test
public void bigFalseTestNumStringMapDataList3() {
	assertFalse(13607==13607+1);
}
@Test
public void bigFalseTestNumStringMapDataList4() {
	assertFalse(14550==14550+1);
}
@Test
public void bigFalseTestNumStringMapDataList5() {
	assertFalse(12539==12539+1);
}
@Test
public void bigFalseTestNumStringMapDataList6() {
	assertFalse(27241==27241+1);
}
@Test
public void bigFalseTestNumStringMapDataList7() {
	assertFalse(15021==15021+1);
}
@Test
public void bigFalseTestNumStringMapDataList8() {
	assertFalse(16159==16159+1);
}
@Test
public void bigFalseTestNumStringMapDataList9() {
	assertFalse(5646==5646+1);
}
@Test
public void bigFalseTestNumStringMapDataList10() {
	assertFalse(5187==5187+1);
}
@Test
public void bigFalseTestNumStringMapDataList11() {
	assertFalse(4446==4446+1);
}
@Test
public void bigFalseTestNumStringMapDataList12() {
	assertFalse(1953==1953+1);
}
@Test
public void bigFalseTestNumStringMapDataList13() {
	assertFalse(3382==3382+1);
}
@Test
public void bigFalseTestNumStringMapDataList14() {
	assertFalse(17315==17315+1);
}
@Test
public void bigFalseTestNumStringMapDataList15() {
	assertFalse(31604==31604+1);
}
@Test
public void bigFalseTestNumStringMapDataList16() {
	assertFalse(28238==28238+1);
}
@Test
public void bigFalseTestNumStringMapDataList17() {
	assertFalse(10513==10513+1);
}
@Test
public void bigFalseTestNumStringMapDataList18() {
	assertFalse(2990==2990+1);
}
@Test
public void bigFalseTestNumStringMapDataList19() {
	assertFalse(29611==29611+1);
}
@Test
public void bigFalseTestNumStringMapDataList20() {
	assertFalse(21022==21022+1);
}
@Test
public void bigFalseTestNumStringMapDataList21() {
	assertFalse(1582==1582+1);
}
@Test
public void bigFalseTestNumStringMapDataList22() {
	assertFalse(12902==12902+1);
}
@Test
public void bigFalseTestNumStringMapDataList23() {
	assertFalse(4308==4308+1);
}
@Test
public void bigFalseTestNumStringMapDataList24() {
	assertFalse(8106==8106+1);
}
@Test
public void bigFalseTestNumStringMapDataList25() {
	assertFalse(22398==22398+1);
}
@Test
public void bigFalseTestNumStringMapDataList26() {
	assertFalse(25251==25251+1);
}
@Test
public void bigFalseTestNumStringMapDataList27() {
	assertFalse(5656==5656+1);
}
@Test
public void bigFalseTestNumStringMapDataList28() {
	assertFalse(27018==27018+1);
}
@Test
public void bigFalseTestNumStringMapDataList29() {
	assertFalse(19835==19835+1);
}
@Test
public void bigFalseTestNumStringMapDataList30() {
	assertFalse(465==465+1);
}
@Test
public void bigFalseTestNumStringMapDataList31() {
	assertFalse(15373==15373+1);
}
@Test
public void bigFalseTestNumStringMapDataList32() {
	assertFalse(10864==10864+1);
}
@Test
public void bigFalseTestNumStringMapDataList33() {
	assertFalse(17429==17429+1);
}
@Test
public void bigFalseTestNumStringMapDataList34() {
	assertFalse(9583==9583+1);
}
@Test
public void bigFalseTestNumStringMapDataList35() {
	assertFalse(32378==32378+1);
}
@Test
public void bigFalseTestNumStringMapDataList36() {
	assertFalse(3329==3329+1);
}
@Test
public void bigFalseTestNumStringMapDataList37() {
	assertFalse(25441==25441+1);
}
@Test
public void bigFalseTestNumStringMapDataList38() {
	assertFalse(25667==25667+1);
}
@Test
public void bigFalseTestNumStringMapDataList39() {
	assertFalse(31466==31466+1);
}
@Test
public void bigFalseTestNumStringMapDataList40() {
	assertFalse(21879==21879+1);
}
@Test
public void bigFalseTestNumStringMapDataList41() {
	assertFalse(7937==7937+1);
}
@Test
public void bigFalseTestNumStringMapDataList42() {
	assertFalse(32605==32605+1);
}
@Test
public void bigFalseTestNumStringMapDataList43() {
	assertFalse(11251==11251+1);
}
@Test
public void bigFalseTestNumStringMapDataList44() {
	assertFalse(18679==18679+1);
}
@Test
public void bigFalseTestNumStringMapDataList45() {
	assertFalse(16465==16465+1);
}
@Test
public void bigFalseTestNumStringMapDataList46() {
	assertFalse(7891==7891+1);
}
@Test
public void bigFalseTestNumStringMapDataList47() {
	assertFalse(3396==3396+1);
}
@Test
public void bigFalseTestNumStringMapDataList48() {
	assertFalse(11955==11955+1);
}
@Test
public void bigFalseTestNumStringMapDataList49() {
	assertFalse(26455==26455+1);
}
@Test
public void bigFalseTestNumStringMapDataList50() {
	assertFalse(7734==7734+1);
}
@Test
public void bigFalseTestNumStringMapDataList51() {
	assertFalse(29808==29808+1);
}
@Test
public void bigFalseTestNumStringMapDataList52() {
	assertFalse(18112==18112+1);
}
@Test
public void bigFalseTestNumStringMapDataList53() {
	assertFalse(11879==11879+1);
}
@Test
public void bigFalseTestNumStringMapDataList54() {
	assertFalse(9430==9430+1);
}
@Test
public void bigFalseTestNumStringMapDataList55() {
	assertFalse(10876==10876+1);
}
}
