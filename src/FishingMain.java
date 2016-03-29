import java.util.Scanner;


public class FishingMain {


	public FishingMain() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		Fishing f = new Fishing();
		int n  ;
	String fish;
	int points;
		int sum = 0 ;

		do {
			 n  = f.getRandomN();
				fish  = f.getString(n);
				points  = f.getPoints(n);
				sum = sum + points;
				System.out.println("Lets go fishing! Enter Y to play:");
			System.out.println("You rolled:"+n+"\n" +"You got:"+fish+"\n"+"You have  "+points+"points");
			s = scan.next();
		} while (s.equals("y"));
	System.out.println("Thanks for playing, total points: "+sum);
	}
	
	
	
	
	}

