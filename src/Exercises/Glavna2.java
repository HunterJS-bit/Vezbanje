package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Glavna2 {
public static void main(String[] args) {
	
	
	
	String word = "SHENANIGANS SALTY YOUNGSTER ROUND DOUBLET TERABYTE ESSENCE";
	
ArrayList<Integer> numbers = new  ArrayList<Integer>();
numbers.add(0);
	for(int i = 0;i<word.length();i++){
		if(Character.isWhitespace(word.charAt(i))){
		
		numbers.add(i);
	
	}
}
	
	System.out.println(numbers);
	

	ArrayList<String> words = new ArrayList<String>();
	for(int i = 0;i<numbers.size()-1;i++){
	String soma = word.substring(numbers.get(i),numbers.get(i+1));
	words.add(soma);
	
	}
	
	
	System.out.println(words);
	
	
	for(int i = 0;i<words.size();i++){
		if(i%2!=0){
			System.out.print(words.get(i));
		}else{
			String m = words.get(i);
			for(int g = 0;g<m.length();g++){
				System.out.println(m.charAt(g));
			}
		}
	}
	
	
	
	
	
}




}
