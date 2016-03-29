package Exercises;

import java.util.Scanner;

public class DecimalToBinary {

	
	
	public static void main(String[] args) {
binToDecimal(147);
	}
	
	
	
	
	
	public static void binToDecimal(int n){
	
		
		while(n>0){
			if(n%2==0){
				System.out.print("0");
			}else if(n%2!=0) {
				System.out.print("1");
			}
			n = n/2;
			
		}
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	public static void decimalToBinary(int n){
		Integer g = new Integer(0);
	String text = g.toBinaryString(n);
	System.out.println(text);
	}
	
}