package Exercises;

import java.util.Arrays;

public class Tokenization {
/*
 * 
 * (Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a
string in the form (555) 555-5555.
The seven digits of the phone number should be concatenated into
one string. Both the area code and the phone number should be printed.
 * 
 * 
 */
	
	public static void main(String[] args) {
		String s = "(123123)  6544-5555";
		TokenizingNumbers(s);
	}
	
	
	public static void TokenizingNumbers(String s){
		String [] arr = s.split("\\s+");
		System.out.println(Arrays.toString(arr));
		String [] arr2 = arr[1].split("-");
		System.out.println(Arrays.toString(arr2));
		StringBuilder number = new StringBuilder();
		for(int i = 0;i<arr2.length;i++){
			number.append(arr2[i]);
		}
		
		System.out.println("area code "+arr[0]);
		System.out.println("phone number "+number);
	}
}
