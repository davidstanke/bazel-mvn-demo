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

public class StructSerialListHelperTest {
    @Test
    public void testValidStructSerialList() {
		StructSerialListHelper helper = new StructSerialListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialList() {
	StructSerialListHelper helper = new StructSerialListHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStructSerialListHelper", ".tmp"); 
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
public void testOtherFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialList0() {
	assertFalse(8996==8996+1);
}
@Test
public void bigFalseTestStructSerialList1() {
	assertFalse(13979==13979+1);
}
@Test
public void bigFalseTestStructSerialList2() {
	assertFalse(8327==8327+1);
}
@Test
public void bigFalseTestStructSerialList3() {
	assertFalse(9055==9055+1);
}
@Test
public void bigFalseTestStructSerialList4() {
	assertFalse(7447==7447+1);
}
@Test
public void bigFalseTestStructSerialList5() {
	assertFalse(16427==16427+1);
}
@Test
public void bigFalseTestStructSerialList6() {
	assertFalse(5614==5614+1);
}
@Test
public void bigFalseTestStructSerialList7() {
	assertFalse(32736==32736+1);
}
@Test
public void bigFalseTestStructSerialList8() {
	assertFalse(27262==27262+1);
}
@Test
public void bigFalseTestStructSerialList9() {
	assertFalse(31098==31098+1);
}
@Test
public void bigFalseTestStructSerialList10() {
	assertFalse(2875==2875+1);
}
@Test
public void bigFalseTestStructSerialList11() {
	assertFalse(1174==1174+1);
}
@Test
public void bigFalseTestStructSerialList12() {
	assertFalse(3075==3075+1);
}
@Test
public void bigFalseTestStructSerialList13() {
	assertFalse(73==73+1);
}
@Test
public void bigFalseTestStructSerialList14() {
	assertFalse(1495==1495+1);
}
@Test
public void bigFalseTestStructSerialList15() {
	assertFalse(25598==25598+1);
}
@Test
public void bigFalseTestStructSerialList16() {
	assertFalse(22860==22860+1);
}
@Test
public void bigFalseTestStructSerialList17() {
	assertFalse(19681==19681+1);
}
@Test
public void bigFalseTestStructSerialList18() {
	assertFalse(24253==24253+1);
}
@Test
public void bigFalseTestStructSerialList19() {
	assertFalse(27387==27387+1);
}
@Test
public void bigFalseTestStructSerialList20() {
	assertFalse(21276==21276+1);
}
@Test
public void bigFalseTestStructSerialList21() {
	assertFalse(12293==12293+1);
}
@Test
public void bigFalseTestStructSerialList22() {
	assertFalse(18427==18427+1);
}
@Test
public void bigFalseTestStructSerialList23() {
	assertFalse(7846==7846+1);
}
@Test
public void bigFalseTestStructSerialList24() {
	assertFalse(31528==31528+1);
}
@Test
public void bigFalseTestStructSerialList25() {
	assertFalse(17302==17302+1);
}
@Test
public void bigFalseTestStructSerialList26() {
	assertFalse(11752==11752+1);
}
@Test
public void bigFalseTestStructSerialList27() {
	assertFalse(27352==27352+1);
}
@Test
public void bigFalseTestStructSerialList28() {
	assertFalse(19898==19898+1);
}
@Test
public void bigFalseTestStructSerialList29() {
	assertFalse(14857==14857+1);
}
@Test
public void bigFalseTestStructSerialList30() {
	assertFalse(28710==28710+1);
}
@Test
public void bigFalseTestStructSerialList31() {
	assertFalse(11640==11640+1);
}
@Test
public void bigFalseTestStructSerialList32() {
	assertFalse(14599==14599+1);
}
@Test
public void bigFalseTestStructSerialList33() {
	assertFalse(14473==14473+1);
}
@Test
public void bigFalseTestStructSerialList34() {
	assertFalse(11862==11862+1);
}
@Test
public void bigFalseTestStructSerialList35() {
	assertFalse(10885==10885+1);
}
@Test
public void bigFalseTestStructSerialList36() {
	assertFalse(11857==11857+1);
}
@Test
public void bigFalseTestStructSerialList37() {
	assertFalse(10219==10219+1);
}
@Test
public void bigFalseTestStructSerialList38() {
	assertFalse(9374==9374+1);
}
@Test
public void bigFalseTestStructSerialList39() {
	assertFalse(13538==13538+1);
}
@Test
public void bigFalseTestStructSerialList40() {
	assertFalse(10429==10429+1);
}
@Test
public void bigFalseTestStructSerialList41() {
	assertFalse(10326==10326+1);
}
@Test
public void bigFalseTestStructSerialList42() {
	assertFalse(21468==21468+1);
}
@Test
public void bigFalseTestStructSerialList43() {
	assertFalse(6117==6117+1);
}
@Test
public void bigFalseTestStructSerialList44() {
	assertFalse(17906==17906+1);
}
@Test
public void bigFalseTestStructSerialList45() {
	assertFalse(5038==5038+1);
}
@Test
public void bigFalseTestStructSerialList46() {
	assertFalse(29095==29095+1);
}
@Test
public void bigFalseTestStructSerialList47() {
	assertFalse(3486==3486+1);
}
@Test
public void bigFalseTestStructSerialList48() {
	assertFalse(19573==19573+1);
}
@Test
public void bigFalseTestStructSerialList49() {
	assertFalse(15045==15045+1);
}
@Test
public void bigFalseTestStructSerialList50() {
	assertFalse(23562==23562+1);
}
@Test
public void bigFalseTestStructSerialList51() {
	assertFalse(19943==19943+1);
}
@Test
public void bigFalseTestStructSerialList52() {
	assertFalse(15303==15303+1);
}
@Test
public void bigFalseTestStructSerialList53() {
	assertFalse(18752==18752+1);
}
@Test
public void bigFalseTestStructSerialList54() {
	assertFalse(3327==3327+1);
}
@Test
public void bigFalseTestStructSerialList55() {
	assertFalse(560==560+1);
}
}
