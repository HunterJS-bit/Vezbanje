package Exercises;

import java.util.Scanner;

public class MainBMI {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BMI bmi = new BMI();
		System.out.println("Enter your weight in pounds ");
		int weight =  scan.nextInt();
		bmi.setWeight(weight);
		System.out.println("Enter your height in inches");
		int height = scan.nextInt();
		bmi.setHeight(height);
		bmi.calculateBMI();
		
	}
	
	
	
}
