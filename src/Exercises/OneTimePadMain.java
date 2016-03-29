package Exercises;

import java.util.Arrays;
import java.util.Random;

public class OneTimePadMain {
public static void main(String[] args) {
	

	OneTimePad it  = new OneTimePad("zikacar");
System.out.println("String to encrypt -- " + it.getString());
	String s = it.encryptString();
	
	System.out.println(s);
	it.decryptString(s);
	
	
	
}







}
