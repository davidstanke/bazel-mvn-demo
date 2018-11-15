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

public class TensorAPIWriteAPIWriteHelperTest {
    @Test
    public void testValidTensorAPIWriteAPIWrite() {
		TensorAPIWriteAPIWriteHelper helper = new TensorAPIWriteAPIWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidTensorAPIWriteAPIWrite() {
	TensorAPIWriteAPIWriteHelper helper = new TensorAPIWriteAPIWriteHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileTensorAPIWriteAPIWriteHelper", ".tmp"); 
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
public void testAnotherFalseTensorAPIWriteAPIWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseTensorAPIWriteAPIWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite0() {
	assertFalse(23010==23010+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite1() {
	assertFalse(19404==19404+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite2() {
	assertFalse(6153==6153+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite3() {
	assertFalse(29216==29216+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite4() {
	assertFalse(25831==25831+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite5() {
	assertFalse(12111==12111+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite6() {
	assertFalse(9736==9736+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite7() {
	assertFalse(22392==22392+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite8() {
	assertFalse(26925==26925+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite9() {
	assertFalse(8263==8263+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite10() {
	assertFalse(15901==15901+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite11() {
	assertFalse(27219==27219+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite12() {
	assertFalse(16711==16711+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite13() {
	assertFalse(25777==25777+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite14() {
	assertFalse(12615==12615+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite15() {
	assertFalse(14028==14028+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite16() {
	assertFalse(29484==29484+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite17() {
	assertFalse(936==936+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite18() {
	assertFalse(26905==26905+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite19() {
	assertFalse(32282==32282+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite20() {
	assertFalse(25742==25742+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite21() {
	assertFalse(6290==6290+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite22() {
	assertFalse(14717==14717+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite23() {
	assertFalse(19356==19356+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite24() {
	assertFalse(30972==30972+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite25() {
	assertFalse(11534==11534+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite26() {
	assertFalse(4652==4652+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite27() {
	assertFalse(20136==20136+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite28() {
	assertFalse(30135==30135+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite29() {
	assertFalse(17817==17817+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite30() {
	assertFalse(19433==19433+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite31() {
	assertFalse(1299==1299+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite32() {
	assertFalse(18260==18260+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite33() {
	assertFalse(3331==3331+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite34() {
	assertFalse(3456==3456+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite35() {
	assertFalse(640==640+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite36() {
	assertFalse(1301==1301+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite37() {
	assertFalse(19092==19092+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite38() {
	assertFalse(1154==1154+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite39() {
	assertFalse(24682==24682+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite40() {
	assertFalse(19976==19976+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite41() {
	assertFalse(3837==3837+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite42() {
	assertFalse(28093==28093+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite43() {
	assertFalse(8943==8943+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite44() {
	assertFalse(23517==23517+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite45() {
	assertFalse(17408==17408+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite46() {
	assertFalse(10622==10622+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite47() {
	assertFalse(7778==7778+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite48() {
	assertFalse(26504==26504+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite49() {
	assertFalse(2783==2783+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite50() {
	assertFalse(22406==22406+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite51() {
	assertFalse(10638==10638+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite52() {
	assertFalse(15259==15259+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite53() {
	assertFalse(5510==5510+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite54() {
	assertFalse(14029==14029+1);
}
@Test
public void bigFalseTestTensorAPIWriteAPIWrite55() {
	assertFalse(10443==10443+1);
}
}
