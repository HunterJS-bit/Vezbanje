package Exercises;

import java.awt.image.ReplicateScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountWords {

	
	public static void main(String[] args) {
		
		
		 String str = new String("marko                                   voli sasku ");

	    
		
	      
	     int num =  countWords(str);
	     System.out.println(num);
	}
	
	

		
		
	
	
	
	
	public static int countWords(String s ){
	ArrayList<String> list = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(s," ");
		while(tokenizer.hasMoreElements()){
			list.add(tokenizer.nextToken());
		}
		return list.size();
}

	
	
	
	
	
	
	
	
}