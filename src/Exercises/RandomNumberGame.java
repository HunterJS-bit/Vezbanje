package Exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * 
 * A "guess-that-number" game is exactly what it sounds like: a number is guessed at random by the computer, and you must guess that number to win! The only thing the computer tells you is if your guess is below or above the number.
Your goal is to write a program that, upon initialization, guesses a number between 1 and 100 (inclusive), and asks you for your guess. If you type a number, the program must either tell you if you won (you guessed the computer's number),
 or if your guess was below the computer's number, or if your guess was above the computer's number.

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class RandomNumberGame {
public static void main(String[] args) {
	
	
	
	numberGame();

}
	

	
	
	
	
	
	



public static int generateRandomNum(){
	Random r = new Random();
	int n = r.nextInt(100);
	return n;
}


public static void numberGame(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to guess-that-numbers game!"
			+ " I have already picked a number in [1, 100]. Please make a guess.");
	int randN = generateRandomNum();
	int n = scan.nextInt();
	


	while (n!=randN) {
		
		if(n<randN){
			System.out.println(" Wrong. That number is bellow my number.");
			n = scan.nextInt();
		}else if(n>randN){
			System.out.println("Wrong. That number is above my number.");
			n = scan.nextInt();
		}
	}
	if(randN== n){
		System.out.println("you got the number");
	}
}

	

	
	
	

}