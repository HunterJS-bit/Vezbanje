package Exercises;

import java.util.Random;
import java.util.Scanner;

public class Practice {

	
	public static void main(String[] args) {
		  int number = new Random().nextInt(100) + 1;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Welcome to guess-that-numbers game! I have already picked a number in [1, 100]. Please make a guess. Type \"exit\" to quit.\n");
	        int guess = 0;
	        do{
	            String input = scan.nextLine();
	            try{
	                guess = Integer.parseInt(input);
	            }catch (NumberFormatException e){
	                if(input.equalsIgnoreCase("exit")) break;
	                else{
	                    System.out.println("That's not a number! Wrong!");
	                    continue;
	                }
	            }
	            if(guess == number) System.out.println("You were right! The number was " + guess + "!");
	            else
	                System.out.println("Wrong! " + guess + " is " + (guess < number ? "lower" : "higher") + " than the number.");

	        }while(guess != number);
	        System.out.println("Goodbye!");

	    }
	
}
