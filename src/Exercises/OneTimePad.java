package Exercises;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class OneTimePad {

	
	private String text;
	
	
	
	public OneTimePad(String text){
		this.text = text;
	}
	
	
	
	
	
	
	public String getString(){
		return this.text;
	}
	
	
	
	
	
	
	
	
	
	
	private  byte[] getRand(int size){
		Random r = new Random(3);
		 byte [] arr = new byte[size];
	
	      r.nextBytes(arr);
		
		return arr;
			
		
	}
	
	
	
	
	
	
	
	public String encryptString(){
		byte [] arr = text.getBytes();
		
		
		
		
		byte [] random = getRand(text.length());
		
		
	
		  
		 
		
		byte [] arr3 = new byte[text.length()];
		
		for(int i = 0;i<arr3.length;i++){
			arr3[i] = (byte) (arr[i] ^ random[i]);
		}
		
		
		String newText = new String(arr3);
		
	return newText;
	

		
	}
	
	
	
	public void decryptString(String newText){
  byte [] arr = getRand(text.length());

  
  byte [] arr2 = newText.getBytes();
  
  
  byte [] decode = new byte[text.length()];
  
  for(int i = 0;i<decode.length;i++){
	  decode[i] = (byte) (arr2[i]^arr[i]);
  }
  
  
  String n = new String(decode);
  System.out.println(n);
  
  
  
	}
	
	
	
	
	
	
	
	
	
	
	
}
