package com.davidstanke.tfjavademo.helpers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ArrayWriteAPIDataArrayHelper {
	public static String help() {
		return "valid";
	}
	
	private static void writeToText() {
		String writeMe = "hello";
        try {
            Files.write(Paths.get("~/tmp/txt/ArrayWriteAPIDataArrayHelper.txt"), writeMe.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
