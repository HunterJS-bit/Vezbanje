package Exercises;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class PasswordGenerator {

	
	private String password;
	private int passwordLength;
	
	public PasswordGenerator(int n) {
	this.passwordLength = n;
	}
	
	
	
	
	public void generatePassword(){

		char [] arr = new char[passwordLength];
		String [] numberArray = {"0","1","2","3","4","5","6","7","8","9"};
		Random r = new Random();
	 
	
		

		for(int i = 0;i<arr.length;i++){
			char c = (char) (r.nextInt(26)+97);
			arr[i] = c;
		}
	
		for(int i = 0;i<arr.length/2;i++){
			int num = r.nextInt(arr.length);
			char c = arr[num];
			char b = Character.toUpperCase(c);
			arr[num] = b;
		}
		
String s = new String(arr);
StringBuilder builder = new StringBuilder(s);
for(int i = 0;i<2;i++){
	int n = r.nextInt(numberArray.length);
	int numOfArr = r.nextInt(arr.length);
	//builder.replace(s.charAt(numOfArr), (char) n);
	builder.replace(numOfArr, numOfArr+1, numberArray[n]);
}
		
	
System.out.println(builder.reverse());
	
	}
	
	
	
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
