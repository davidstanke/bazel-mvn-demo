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

public class LibMapIOLibHelperTest {
    @Test
    public void testValidLibMapIOLib() {
		LibMapIOLibHelper helper = new LibMapIOLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibMapIOLib() {
	LibMapIOLibHelper helper = new LibMapIOLibHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileLibMapIOLibHelper", ".tmp"); 
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
public void testFalseLibMapIOLib() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
@Test
public void testOtherFalseLibMapIOLib() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
@Test
public void testAnotherFalseLibMapIOLib() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
}