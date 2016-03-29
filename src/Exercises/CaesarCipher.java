package Exercises;

import java.util.Arrays;




/*
 * 
 * Welcome to cipher day!
write a program that can encrypt texts with an alphabetical caesar cipher.
 This cipher can ignore numbers, symbols, and whitespace.
for extra credit, add a "decrypt" function to your program!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class CaesarCipher {

	
	public static void main(String[] args) {
		String name = "wz droge je car";
		encrypttext(name);
	}
	
	
	
	
	
	public static void encrypttext(String text){
		
		
		char [] arr = text.toLowerCase().toCharArray();
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>=97 && arr[i]<=122 ){
				arr[i]+=3;
			 switch (arr[i]) {
			case '{':
				arr[i]= 'a';
				break;
			case '|':
			    arr[i] = 'b';
			    break;
			case '}':
			     arr[i]  = 'c';
			    break;
			default:
				break;
			}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	
	}
}
