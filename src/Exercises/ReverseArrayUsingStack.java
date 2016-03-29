package Exercises;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class ReverseArrayUsingStack {


	
	
	public static void main(String[] args) {
		
		
		int [] arr = {1,2,3,4,5};
		
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		String r = "{}";
		System.out.println(parenthasisMathcing(r));
	
		
	}
	
	
	
	
	public static void reverseArray(int [] arr){
		
		
		/*
		 * 
		 * 
		 * Reversing array using stack
		 */
		
		Stack<Integer> g = new Stack<Integer>();
		for(int i = 0 ;i<arr.length;i++){
			g.push(arr[i]);
		}
		
		for(int i = 0;i<arr.length;i++){
			arr[i] = g.pop();
		}
	}
	
	
	
	
	
	public static boolean parenthasisMathcing(String word){
		
		/*
		 * 
		 * *  Reads in a text file and checks to see if the paretheses, curly
 *  braces, and square brackets are balanced.
 *
 *  % java  java Parentheses
 *  {{}}
 *  true
 *
 *  % java Parentheses
 *  {{{}
 *  false
		 * 
		 * 
		 */
Stack<Character> stack = new Stack<Character>();
	
	for(int i = 0;i<word.length();i++){
		if(word.charAt(i)=='{'){
			stack.push(word.charAt(i));
		}else if(word.charAt(i)=='}'){
			
				stack.pop();
			
			
		}
	}
	if(stack.isEmpty()){
		return true;
	}else{
		return false;
	}

	}
	
	
	
	
	
}




