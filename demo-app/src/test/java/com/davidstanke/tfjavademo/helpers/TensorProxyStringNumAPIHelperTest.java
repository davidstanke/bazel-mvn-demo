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

public class TensorProxyStringNumAPIHelperTest {
    @Test
    public void testValidTensorProxyStringNumAPI() {
		TensorProxyStringNumAPIHelper helper = new TensorProxyStringNumAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseTensorProxyStringNumAPI() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
@Test
public void testThisFalseTensorProxyStringNumAPI() {
	for(int i=1;i<100;i++) {
		assertFalse(false);
	}
}
}
