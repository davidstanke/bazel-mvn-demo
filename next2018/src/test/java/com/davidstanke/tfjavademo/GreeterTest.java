package com.davidstanke.tfjavademo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class GreeterTest {
    @Test
    public void testGreeter() {
	Greeter testgreeter = new Greeter();
	assertEquals("Hello world! Welcome to the Java Image Labeller!",testgreeter.getGreeting());
    }
}
