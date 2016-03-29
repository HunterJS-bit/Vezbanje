package Exercises;

import java.util.ArrayList;
import java.util.Random;

public class RandomSentence {

	
	public static void main(String[] args) {
		
	
	generateSentence();
		
	}
	
	
	
	public static void generateSentence(){
		Random r = new Random();
		
		String [] article = {"the", "a", "one", "some","any"};
		String [] noun = {"boy", "girl", "dog", "person" , "lady" };
		String [] verbs = { "drove", "jumped", "ran", "walked","move"};
		String [] preposition = {"to", "from", "over", "under","on"};
		String [] noun2 = { "table","lion","car"};
		int n = r.nextInt(5);
		int n2 = r.nextInt(5);
		int n3 = r.nextInt(5);
		int n4 = r.nextInt(5);
		int n5= r.nextInt(3);
	
		StringBuilder build = new StringBuilder(article[n]+" "+noun[n2]+" "+verbs[n3]+" "+preposition[n4]+" "+noun2[n5]);
	
		build.setCharAt(0, Character.toUpperCase(build.charAt(0)));
		build.append('.');
		System.out.println(build);
		
	}
	
}
