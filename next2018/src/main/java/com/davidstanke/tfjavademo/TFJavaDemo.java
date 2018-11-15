package com.davidstanke.tfjavademo;

//import org.tensorflow.examples.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
//import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class TFJavaDemo {
	
	final static int ASCII_WIDTH = 42;

	public static void main(String[] args) throws IOException {

		// create an instance of the Java wrapper class around TF 
		LabelImage li = new LabelImage();		
		
		System.out.println();
		System.out.println();

		Scanner keyboard = new Scanner(System.in);
		Greeter greeter = new Greeter();
		System.out.println(greeter.getGreeting());
		
		System.out.println("Which image would you like to evaluate?");
		System.out.print("Type a number from 1 to 6: ");
		int numImg = keyboard.nextInt();
		
		//System.out.println(System.getProperty("user.dir"));		

		System.out.println("Great, let's see what it looks like:");
		
		String filepath = "next2018/img/" + numImg + ".jpg";
		
		// pass command-line args to LabelImage class
		String[] labelArgs = {"next2018/model",filepath};
		
		System.out.print(getAscii(filepath));
		System.out.println();
		System.out.println("Press Enter to see what TensorFlow thinks it is...");
		
		try{System.in.read();}
		catch(Exception e){}
		
		System.out.println(li.getLabels(labelArgs));


	}

	

	private static String getAscii(String filepath) throws IOException {
		File file = new File(filepath);
                BufferedImage image = ImageIO.read(file);
		Image thumb = image.getScaledInstance(ASCII_WIDTH, -1, Image.SCALE_SMOOTH);
		BufferedImage bufferedThumb = new BufferedImage(thumb.getWidth(null), thumb.getHeight(null), BufferedImage.TYPE_INT_RGB);
		bufferedThumb.getGraphics().drawImage(thumb,0,0,null);
                String ascii = new ASCII().convert(bufferedThumb);

		return ascii;
	}
}
