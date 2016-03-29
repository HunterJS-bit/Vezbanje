package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ASCIITree {
/*
 * 
 * Tree Generation

Your goal is to draw a tree given the base-width of the tree (the number of characters on the bottom-most row of the triangle section).
 This "tree" must be drawn through ASCII art-style graphics on standard console output. 
It will consist of a 1x3 trunk on the bottom, and a triangle shape on the top. 
The tree must be centered, with the leaves growing from a base of N-characters, up to a top-layer of 1 character. Each layer reduces by 2 character, 
so the bottom might be 7, while shrinks to 5, 3, and 1 on top layers. See example output
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	public static void main(String[] args) {
		
		
		
		generateTree(21, 'x', '#');
	}
	
	
	
	public static void generateTree(int num,char a,char b){
	
		
		
	
		for(int i = 0;i<num;i+=2){
			for(int j = 0;j<i+2-1;j++){
				
				System.out.print(a);
				
				
			}
			System.out.println("");
		}
		
	
		
		for(int i = 0;i<3;i++){
			System.out.print(b);
		
		}
		
		
		
			
	
	}
	
	
	
	
	
}




