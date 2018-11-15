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

public class ArrayStreamWriteHelperTest {
    @Test
    public void testValidArrayStreamWrite() {
		ArrayStreamWriteHelper helper = new ArrayStreamWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayStreamWrite() {
	ArrayStreamWriteHelper helper = new ArrayStreamWriteHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileArrayStreamWriteHelper", ".tmp"); 
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
public void testFalseArrayStreamWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayStreamWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayStreamWrite0() {
	assertFalse(11049==11049+1);
}
@Test
public void bigFalseTestArrayStreamWrite1() {
	assertFalse(31782==31782+1);
}
@Test
public void bigFalseTestArrayStreamWrite2() {
	assertFalse(24561==24561+1);
}
@Test
public void bigFalseTestArrayStreamWrite3() {
	assertFalse(12194==12194+1);
}
@Test
public void bigFalseTestArrayStreamWrite4() {
	assertFalse(19668==19668+1);
}
@Test
public void bigFalseTestArrayStreamWrite5() {
	assertFalse(6938==6938+1);
}
@Test
public void bigFalseTestArrayStreamWrite6() {
	assertFalse(30990==30990+1);
}
@Test
public void bigFalseTestArrayStreamWrite7() {
	assertFalse(24585==24585+1);
}
@Test
public void bigFalseTestArrayStreamWrite8() {
	assertFalse(8031==8031+1);
}
@Test
public void bigFalseTestArrayStreamWrite9() {
	assertFalse(30195==30195+1);
}
@Test
public void bigFalseTestArrayStreamWrite10() {
	assertFalse(28181==28181+1);
}
@Test
public void bigFalseTestArrayStreamWrite11() {
	assertFalse(7196==7196+1);
}
@Test
public void bigFalseTestArrayStreamWrite12() {
	assertFalse(19223==19223+1);
}
@Test
public void bigFalseTestArrayStreamWrite13() {
	assertFalse(30504==30504+1);
}
@Test
public void bigFalseTestArrayStreamWrite14() {
	assertFalse(14299==14299+1);
}
@Test
public void bigFalseTestArrayStreamWrite15() {
	assertFalse(21285==21285+1);
}
@Test
public void bigFalseTestArrayStreamWrite16() {
	assertFalse(32271==32271+1);
}
@Test
public void bigFalseTestArrayStreamWrite17() {
	assertFalse(28787==28787+1);
}
@Test
public void bigFalseTestArrayStreamWrite18() {
	assertFalse(2147==2147+1);
}
@Test
public void bigFalseTestArrayStreamWrite19() {
	assertFalse(17800==17800+1);
}
@Test
public void bigFalseTestArrayStreamWrite20() {
	assertFalse(25513==25513+1);
}
@Test
public void bigFalseTestArrayStreamWrite21() {
	assertFalse(10612==10612+1);
}
@Test
public void bigFalseTestArrayStreamWrite22() {
	assertFalse(2897==2897+1);
}
@Test
public void bigFalseTestArrayStreamWrite23() {
	assertFalse(23234==23234+1);
}
@Test
public void bigFalseTestArrayStreamWrite24() {
	assertFalse(2277==2277+1);
}
@Test
public void bigFalseTestArrayStreamWrite25() {
	assertFalse(15364==15364+1);
}
@Test
public void bigFalseTestArrayStreamWrite26() {
	assertFalse(16659==16659+1);
}
@Test
public void bigFalseTestArrayStreamWrite27() {
	assertFalse(23333==23333+1);
}
@Test
public void bigFalseTestArrayStreamWrite28() {
	assertFalse(14697==14697+1);
}
@Test
public void bigFalseTestArrayStreamWrite29() {
	assertFalse(23130==23130+1);
}
@Test
public void bigFalseTestArrayStreamWrite30() {
	assertFalse(24781==24781+1);
}
@Test
public void bigFalseTestArrayStreamWrite31() {
	assertFalse(2384==2384+1);
}
@Test
public void bigFalseTestArrayStreamWrite32() {
	assertFalse(8532==8532+1);
}
@Test
public void bigFalseTestArrayStreamWrite33() {
	assertFalse(23264==23264+1);
}
@Test
public void bigFalseTestArrayStreamWrite34() {
	assertFalse(27912==27912+1);
}
@Test
public void bigFalseTestArrayStreamWrite35() {
	assertFalse(22384==22384+1);
}
@Test
public void bigFalseTestArrayStreamWrite36() {
	assertFalse(16323==16323+1);
}
@Test
public void bigFalseTestArrayStreamWrite37() {
	assertFalse(9683==9683+1);
}
@Test
public void bigFalseTestArrayStreamWrite38() {
	assertFalse(26395==26395+1);
}
@Test
public void bigFalseTestArrayStreamWrite39() {
	assertFalse(13370==13370+1);
}
@Test
public void bigFalseTestArrayStreamWrite40() {
	assertFalse(30239==30239+1);
}
@Test
public void bigFalseTestArrayStreamWrite41() {
	assertFalse(24733==24733+1);
}
@Test
public void bigFalseTestArrayStreamWrite42() {
	assertFalse(19797==19797+1);
}
@Test
public void bigFalseTestArrayStreamWrite43() {
	assertFalse(11172==11172+1);
}
@Test
public void bigFalseTestArrayStreamWrite44() {
	assertFalse(16429==16429+1);
}
@Test
public void bigFalseTestArrayStreamWrite45() {
	assertFalse(29426==29426+1);
}
@Test
public void bigFalseTestArrayStreamWrite46() {
	assertFalse(20463==20463+1);
}
@Test
public void bigFalseTestArrayStreamWrite47() {
	assertFalse(22374==22374+1);
}
@Test
public void bigFalseTestArrayStreamWrite48() {
	assertFalse(24787==24787+1);
}
@Test
public void bigFalseTestArrayStreamWrite49() {
	assertFalse(16812==16812+1);
}
@Test
public void bigFalseTestArrayStreamWrite50() {
	assertFalse(26805==26805+1);
}
@Test
public void bigFalseTestArrayStreamWrite51() {
	assertFalse(23348==23348+1);
}
@Test
public void bigFalseTestArrayStreamWrite52() {
	assertFalse(4011==4011+1);
}
@Test
public void bigFalseTestArrayStreamWrite53() {
	assertFalse(15207==15207+1);
}
@Test
public void bigFalseTestArrayStreamWrite54() {
	assertFalse(16750==16750+1);
}
@Test
public void bigFalseTestArrayStreamWrite55() {
	assertFalse(26808==26808+1);
}
}
