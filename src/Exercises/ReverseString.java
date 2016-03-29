package Exercises;

import java.util.Arrays;

public class ReverseString {

	
	
	public static void main(String[] args) {
		String text = "marko je car";
		String reverse1 = reverseString(text);
		System.out.println(reverse1);
		String reverse2 = reverseStringVersion2(text);
		System.out.println(reverse2);
	}
	
	
	public static String reverseString(String text){
		char[] arr = text.toCharArray();
		char [] arrReverse = new char[arr.length];
	
		
		for(int i = 0;i<arr.length;i++){
			arrReverse[i] = arr[arr.length-i-1];
		}
		
		String reverse = new String(arrReverse);
		return reverse;
}
	
	
	
	public static String reverseStringVersion2(String text){
		StringBuilder builder = new StringBuilder(text);
		builder.reverse();
		String reverse = new String(builder);
		return reverse;
	}
	
	
	
	
}