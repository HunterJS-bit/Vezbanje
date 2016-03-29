package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 * (Pig Latin) Write an application that encodes English-language phrases into pig Latin.
 * Thus, the word “jump”
becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.”
 * 
 * 
 * 
 * 
 */


public class PigLatin {
public static void main(String[] args) {
	
	String name = " marko  car  asd     daaa";
	convertToPigLatin(name);
}



public static void convertToPigLatin(String sentence){
	String [] arr = sentence.trim().split("\\s+");
	StringBuilder b = new StringBuilder();

	for(String s:arr){
		
		StringBuilder build = new StringBuilder(s);
		char c = build.charAt(0);
		build.append(c+"ay");
		build.deleteCharAt(0);
		
		b.append(build);
		b.append(" ");
		
	}
	b.deleteCharAt(b.length()-1);
	
System.out.println(b);
}



}
