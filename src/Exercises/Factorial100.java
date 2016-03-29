package Exercises;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Factorial100 {

	// Assigment :Calculate and print 100 factorial
	public static void main(String[] args) {
		
		
		
factorial(100);
		
	}
	
	
	public static void factorial (int n){
double m =1;
		for(int i = n;i>=1;i--){
			m = m * i;
			
		}
		
	
		System.out.println(m);
	
	}
	
	
}
