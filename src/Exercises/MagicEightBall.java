package Exercises;

import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {

	
	private String question;
	
	public MagicEightBall() {
		question = getQuestion();
		getAnswer();
	}
	
	
	
	
	public void getAnswer(){
		Random r = new Random();
		String quest = question.toLowerCase();
		int num = r.nextInt(20);
		if(quest.startsWith("will") || quest.startsWith("should") || quest.startsWith("is") || quest.startsWith("am")){
			switch (num) {
			case 1:
				System.out.println("Signs point to yes.");
				break;
			case 2:
				System.out.println("Yes");
				break;
			case 3:
	            System.out.println("Without a doubt.");
				break;
			case 4:
				System.out.println("My sources say no.");
				break;
			case 5:
				System.out.println("As I see it, yes.");
				break;
			case 6:
				System.out.println("You may rely on it");
				break;
			case 7:
				System.out.println("Concentrate and ask again.");
				break;
			case 8:
				System.out.println("Better not tell you now.");
				break;
			case 9:
				System.out.println("Very doubtful");		
				break;
			case 10:
				System.out.println("Cannot predict now.");
				break;
			case 11:
				System.out.println("My reply is no. ");
				break;
			case 12:
				System.out.println("Dumb Question Ask Another ");
				break;
			case 13:
				System.out.println("Looks good to me!");
				break;
			case 14:
				System.out.println("Are you kidding? You are seriously asking me that.");
				break;
			case 15:
				System.out.println("Ask again later....");
				break;
			default:
		        System.out.println("Magic Eight Ball is broken,try something else");
				break;
			}
			
			
			
		}else{
			System.out.println("Ask a question Again\n in Form \"Will i ,or should I or Am I or Is there etc\"");
		}
	}
		
		
		
		
		public String getQuestion(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your question");
			String s = scan.nextLine();
			return s;
		}
	
	
	
	
	
	
	
}
