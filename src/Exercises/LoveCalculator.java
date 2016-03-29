package Exercises;

import java.util.Scanner;

public class LoveCalculator {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two names");
		String name1 = scan.next();
		String name2 = scan.next();
		
		loveCalculator(name1, name2);
		
		
	
		
		
		
	}
	
	
	
	
	
	
	
	public static void loveCalculator(String name,String name2){
		//convert values to array of chars
		char [] arr1 = name.toLowerCase().toCharArray();
		char [] arr2 = name2.toLowerCase().toCharArray();
		int sumName1 = 0;
		int sumName2 = 0;
		
		//we get int representation of each char and add it to sum
		
		for(int i = 0;i<arr1.length;i++){
			
			sumName1+=arr1[i];
		}
		
		
		for(int i = 0;i<arr2.length;i++){
			sumName2+=arr2[i];
		}
		
	
		

		int total = (sumName1 + sumName2)%101;
		System.out.println(name +" and " + name2 + " have " + total +"% of love");
		
		
	}
	
	
	
	
	
}

