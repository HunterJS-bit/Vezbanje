package Exercises;

import java.util.Scanner;

public class CalculateAge {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	
	Age a = new Age();
	System.out.println("enter your age ");
	int year = s.nextInt();
	a.calculateAge(year);
	
	
	
}
}
