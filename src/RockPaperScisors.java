import java.util.Scanner;


public class RockPaperScisors {
 
	
	public RockPaperScisors() {
	
		Scanner scan = new Scanner(System.in);
		Rock rock = new Rock();
		rock.choices();
		int n = scan.nextInt();

		String s = rock.userChoice(n);
		System.out.println("The user's choice was "+s);
		String c = rock.computerChoice();
		System.out.println("The computer's choice was "+c);


		if((s.equals("Rock") || c.equals("Rock")) && (s.equals("Scissors") || c.equals("Scissors")))
				{
			System.out.println("Rock wins");
			
		}else if((s.equals("Scissors") || c.equals("Scissors")) && (s.equals("Paper") || c.equals("Paper"))){
			System.out.println("Scissors wins");
			;
		}else if((s.equals("Paper") || c.equals("Paper")) && (s.equals("Rock") || c.equals("Rock"))){
			System.out.println("Paper wins");
		}else if(s.equals(c)){
			System.out.println("U have to play again");
	}

	
}

}