package EarlyObjects;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Makro {
public static void main(String[] args) {
	//dd/mm/yyyy
	String word = " marko stefan{{ as 99 filip 21/ 00jpo{ marko@live.com imae.jpg 00 asdasd 21/11/1989 stefan@gmail.com asd";
	String regex = "[0-2][0-9]/[0-1][0-9]/\\d{4}";
checkRegex(regex, word);
	
	
}



public static void checkRegex(String regex,String word){
	Pattern patern = Pattern.compile(regex);
	
	Matcher matcher = patern.matcher(word);
	
	while(matcher.find()){
		System.out.println("Found");
		System.out.println(matcher.group());
	}
	
}







}


































	

	













	
	


	
	
	
	
	

	





















	
	






	
	
	


	
	
	
	

	
	
	


	  

	

	



	
	
	
	
	
	
	
	





















