package Exercises;

public class Score {

	/*
	 * You must write code that verifies the awarded points for a fictional sport are valid. This sport is a simplification of American Football scoring rules. This means that the score values must be any logical combination of the following four rewards:
6 points for a "touch-down"
3 points for a "field-goal"
1 point for an "extra-point"; can only be rewarded after a touch-down. Mutually-exclusive with "two-point conversion"
2 points for a "two-point conversion"; can only be rewarded after a touch-down. Mutually-exclusive with "extra-point"
A valid score could be 7, which can come from a single "touch-down" and then an "extra-point". Another example could be 6, from either a single "touch-down" or two "field-goals". 4 is not a valid score, since it cannot be formed by any well-combined rewards.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		
		System.out.println(detectScore(35));
		
	}
	
	
	
	

	
	public static boolean detectScore(int n){
		if(n%6==0 || n%7==0 || n%3==0 || n%8==0 ){
			return true;
		}
		return false;
	}
}
