package Exercises;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise22 {
public static void main(String[] args) {
	
	

	searchingString("legenda je car", 'e');
}



public static void displayingStringsUpperorLow(String text){
	/*
	 * (Displaying Strings in Uppercase and Lowercase) Write an application that inputs a line of
text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.
	 * 
	 */
	System.out.println(text.toUpperCase());
	System.out.println(text.toLowerCase());
}

public static void searchingString(String text,char c){
/*
 * Searching Strings) Write an application that inputs a line of text and a search character and
uses String method indexOf to determine the number of occurrences of the character in the text.
 * 
 */


		HashSet<Integer> s = new HashSet<Integer>();
int n =0;
int j = 0;

while(n!=-1){
	n = text.indexOf(c, j);
	s.add(n);
	j++;
}
int numOfoccurence = s.size()-1;
System.out.println("Number of occurences is "+numOfoccurence);
}


public static void searchAndTokenize(String text){
	
	/*
	 * Write an application that reads a line of text, tokenizes
the line using space characters as delimiters and outputs only those words beginning with the
letter "b".
	 * 
	 */
	String [] arr = text.split("\\s+");
	for(String s:arr){
		if(s.startsWith("b")){
			System.out.println(s);
		}
	}

}


public static void searchAndTokenizeVer2(String text){
	/*
	 * (Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes
it using space characters as delimiters and outputs only those words ending with the letters "ED".
	 * 
	 */
	
	String [] arr = text.split("\\s");
	for(String s:arr){
		if(s.endsWith("ED")){
			System.out.println(s);
		}
	}
}


public static void indexOf(String s,char b){
	/*
	 * (Defining Your Own String Methods) Write your own versions of String search methods
indexOf and lastIndexOf.
	 * 
	 */
	int n =0 ;
	for(int i = 0;i<s.length();i++){
		if(s.charAt(i)==b){
			n = i;
			break;
		}
	}
	System.out.println(n);
}


public static void lastIndexOf(String s,char b){
	
	for(int i = s.length()-1;i>0;i--){
		if(s.charAt(i)==b){
			System.out.println(i);
			break;
		}
	}
}


}
