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

public class AsyncLibAsyncStringIOHelperTest {
    @Test
    public void testValidAsyncLibAsyncStringIO() {
		AsyncLibAsyncStringIOHelper helper = new AsyncLibAsyncStringIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncLibAsyncStringIO() {
	AsyncLibAsyncStringIOHelper helper = new AsyncLibAsyncStringIOHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileAsyncLibAsyncStringIOHelper", ".tmp"); 
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
public void testFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO0() {
	assertFalse(5621==5621+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO1() {
	assertFalse(5406==5406+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO2() {
	assertFalse(2105==2105+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO3() {
	assertFalse(7704==7704+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO4() {
	assertFalse(31349==31349+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO5() {
	assertFalse(7012==7012+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO6() {
	assertFalse(25057==25057+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO7() {
	assertFalse(13999==13999+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO8() {
	assertFalse(14503==14503+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO9() {
	assertFalse(2598==2598+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO10() {
	assertFalse(31111==31111+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO11() {
	assertFalse(3613==3613+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO12() {
	assertFalse(19281==19281+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO13() {
	assertFalse(111==111+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO14() {
	assertFalse(31476==31476+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO15() {
	assertFalse(14221==14221+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO16() {
	assertFalse(23239==23239+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO17() {
	assertFalse(20480==20480+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO18() {
	assertFalse(15206==15206+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO19() {
	assertFalse(19913==19913+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO20() {
	assertFalse(26154==26154+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO21() {
	assertFalse(21468==21468+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO22() {
	assertFalse(15150==15150+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO23() {
	assertFalse(10925==10925+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO24() {
	assertFalse(17504==17504+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO25() {
	assertFalse(9103==9103+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO26() {
	assertFalse(9482==9482+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO27() {
	assertFalse(10573==10573+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO28() {
	assertFalse(14551==14551+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO29() {
	assertFalse(12098==12098+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO30() {
	assertFalse(26435==26435+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO31() {
	assertFalse(24294==24294+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO32() {
	assertFalse(6137==6137+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO33() {
	assertFalse(4224==4224+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO34() {
	assertFalse(17030==17030+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO35() {
	assertFalse(30341==30341+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO36() {
	assertFalse(14189==14189+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO37() {
	assertFalse(7110==7110+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO38() {
	assertFalse(27267==27267+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO39() {
	assertFalse(7033==7033+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO40() {
	assertFalse(9748==9748+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO41() {
	assertFalse(32460==32460+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO42() {
	assertFalse(5191==5191+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO43() {
	assertFalse(7802==7802+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO44() {
	assertFalse(26558==26558+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO45() {
	assertFalse(30614==30614+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO46() {
	assertFalse(3674==3674+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO47() {
	assertFalse(16790==16790+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO48() {
	assertFalse(12464==12464+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO49() {
	assertFalse(28729==28729+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO50() {
	assertFalse(16024==16024+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO51() {
	assertFalse(22239==22239+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO52() {
	assertFalse(23766==23766+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO53() {
	assertFalse(2926==2926+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO54() {
	assertFalse(8655==8655+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO55() {
	assertFalse(7638==7638+1);
}
}
