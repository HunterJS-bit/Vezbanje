package BrickBreaker;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Main {


	
	public static void main(String[] args) throws IOException  {

  Node n1 = new Node(1);
  Node n2 = new Node(2);
  Node n3 = new Node(3);
  Node n4 = new Node(4);
  Node n5 = new Node(5);
  Node n6 = new Node(6);
  Node n7 = new Node(7);
  n1.setLeft(n2);
  n1.setRight(n3);
  n3.setLeft(n4);
  n3.setRight(n5);
  n5.setLeft(n6);
  n5.setRight(n7);
  BinaryTRee tree = new BinaryTRee();
  tree.setRoot(n1);
  
  tree.callPreorder();
  tree.callInOrder();
  tree.CallPostOrder();
  
  
  
  
  System.out.println();
System.out.println("Print tree");
System.out.println("    /5 ");
System.out.println("  /3 ");
System.out.println("1   \\4 ");
System.out.println("  \\2  \\");
System.out.println("       6");



	
	System.out.println("preorder stack");	

  tree.preOrderStack(n1);
  
  System.out.println("Inorder iterative");
tree.inOrderIterative(n1);
	
	}
		
		
	
		

		
		
		
		
		

	
	
	public static void differenceStrings(String s1,String s2){
		/*
		 * Hi folks! We are in the midst of discussing how this subreddit will go about but for now how about we just concentrate on challenges!
Write a function that takes two strings and removes from the first string any character that appears in the second string. For instance, if the first string is “Daily Programmer” and the second string is “aeiou ” the result is “DlyPrgrmmr”.
note: the second string has [space] so the space between "Daily Programmer" is removed
edit: if anyone has any suggestions for the subreddit, kindly post it in the feedback thread posted a day before. It will be easier to assess. Thank you.
		 * 
		 * 
		 * 
		 */
		Pattern p = Pattern.compile("["+s2+"]");
		

		String [] split = p.split(s1);
		
		StringBuilder builder = new StringBuilder();
		
		
		for(int i = 0;i<split.length;i++){
		builder.append(split[i]);
	
		
		}
		System.out.println(builder);
		
		
		
		
	}






	
	public static void convertPhoneNumber(String number){
		
		/*
		 * Often times in commercials, phone numbers contain letters so that they're easy to remember (e.g. 1-800-VERIZON). Write a program that will convert a phone number that contains letters into a phone number with only numbers and the appropriate dash. Click here to learn more about the telephone keypad.
Example Execution: Input: 1-800-COMCAST Output: 1-800-266-2278
		 * 
		 * 
		 * 
		 */
		
		String [] arr = number.split("[^A-Z]");
		
		System.out.println(Arrays.toString(arr));
		StringBuilder builder = new StringBuilder();
		for(int i = 0;i<arr.length;i++){
			builder.append(arr[i]);
		}
		
		StringBuilder numberBilder = new StringBuilder();
		for(int i= 0;i<builder.length();i++){
			char c = builder.charAt(i);
			if(c=='A' || c=='B' || c=='C'){
				numberBilder.append('2');
			}else if(c=='D' || c=='E' || c=='F'){
				numberBilder.append('3');
			}else if(c=='G' || c=='H' || c=='I'){
				numberBilder.append('4');
			}else if(c=='J' || c=='K' || c=='L'){
				numberBilder.append('5');
			}else if(c=='P' || c=='Q' || c=='R' || c=='S'){
				numberBilder.append('7');
			}else if(c=='M' || c=='N' || c=='O' ){
				numberBilder.append('6');
			}
			else if(c=='T' || c=='U' || c=='V'){
				numberBilder.append('8');
			}else if(c=='W' || c=='X' || c=='Y' || c=='Z'){
				numberBilder.append('9');
			}
		}
		
		System.out.println(numberBilder);
		
	}

	
	
	public static void primeNumbers(){
		/*
		 * create a program that will find all prime numbers below 2000
		 * 
		 */
		
		
		for(int p = 1;p<2000;p++){
			System.out.println(p);
			int count  = 0;
		for(int i = 2;i<p-1;i++){
			if(p%i==0){
				count++;
				}
			}
		if(count==0){
			System.out.println("Number is prime");
		}else{
			System.out.println("Numer is not prime");
		}
	
		
		}
		
		
		
		
		
	}
	
	
	

public static void compareArrays(List<String> arr,List<String> arr2){
	
	
	for(int i = 0;i<arr2.size();i++){
		if(!(arr.contains(arr2.get(i)))){
			String s = arr2.get(i);
			arr.add(s);
		}
	}
	
	
	System.out.println(arr);
}



	


public static List[] splitList(List list) {
	/*
	 * Input: a list
Output: Return the two halves as different lists.
If the input list has an odd number, the middle item can go to any of the list.
Your task is to write the function that splits a list in two halves.
	 * 
	 */
    List firstList = list.subList(0, list.size() / 2);
    List secondList = new ArrayList(list);
    secondList.removeAll(firstList);
    return new List[] { firstList, secondList };
}






public static void challenge27(int year){
/*
 * Write a program that accepts a year as input and outputs the century the year belongs in (e.g. 18th century's year ranges are 1701 to 1800) and whether or not the year is a leap year. Pseudocode for leap year can be found here.
Sample run:
Enter Year: 1996
Century: 20
Leap Year: Yes
Enter Year: 1900
Century: 19
Leap Year: No
 * 
 */

if(year%100>=1){
	System.out.println(year/100+1 +" century");
	
}else{
	System.out.println(year/100 + " century");
	
}
}



public static void challenge29(String s){
	/*
	 * A Palindrome is a sequence that is the same in reverse as it is forward.
I.e. hannah, 12321.
Your task is to write a function to determine whether a given string is palindromic or not.
	 * 
	 */
	StringBuilder build = new StringBuilder(s);
	
	
	int count = 0;
	for(int i = 0;i<s.length();i++){
		if(s.charAt(i)==build.reverse().charAt(s.length()-i-1)){
			count++;
		}else{
			count--;
		}
	}
	
	if(s.length()==count){
		System.out.println("palindrome");
	}else{
		System.out.println("Not a palindrome");
	}
}



public static void challenge30(int [] arr,int target){
	/*
	 * Write a program that takes a list of integers and a target number and determines if any two integers in the list sum to the target number. 
	 * If so, return the two numbers. If not, return an indication that no such integers exist.
	 * 
	 * 
	 */
Arrays.sort(arr);

for(int i = 0;i<arr.length;i++){
	
	for(int j = 0;j<arr.length;j++){
		if(arr[i]+arr[j]==target){
			System.out.println(arr[i]+"  "+arr[j]);
		}
	}
	
	
	
}


	
}


public static void challenge34(int a,int b,int c){
	
	
	int min = Math.min(Math.min(a, b), c);
	int max = Math.max(Math.max(a, b), c);
	
	double pow1 = Math.pow(min, 2);
	double pow2 = Math.pow(max, 2);
	double result = pow1+pow2;
	System.out.println("Result is "+ result);
}




	
	public static String challenge40(int a){
		/*
		 * Print the numbers from 1 to 1000 without using any loop or conditional statements.
Don’t just write the printf() or cout statement 1000 times.
Be creative and try to find the most efficient way!
		 * 
		 */
		
		if(a==1){
			
			return "1\n";
		}else{
			
			return challenge40(a-1)+a+"\n";
		}
		
		
		
	}
	


public static void challenge41(String s){
	for(int i = 0;i<s.length()+5;i++){
		System.out.print("*");
	}
	
	System.out.print("\n*");
	for(int i = 1;i<s.length()+4;i++){
		System.out.print(" ");
	}
	System.out.print("*");
	System.out.print("\n* "+s+"  *");
	System.out.print("\n*");
	for(int i = 1;i<s.length()+4;i++){
		System.out.print(" ");
	}
	System.out.print("*");
	System.out.println();
	for(int i = 0;i<s.length()+5;i++){
		System.out.print("*");
	}
	
}
	


public static void challenge37(String nameOfFile) throws IOException{
/*
 * write a program that takes
input : a file as an argument
output: counts the total number of lines.
for bonus, also count the number of words in the file.
 * 
 */
	
	File f = new File(nameOfFile);
	
	FileReader reader = new FileReader(f);
	StringBuilder builder = new StringBuilder();
	
	BufferedReader buffreader = new BufferedReader(reader);
	
	String line = null;
	 while((line = buffreader.readLine()) != null) {
        builder.append(line+"\n");
     }   

     // Always close files.
     buffreader.close();  
     
  String r = new String(builder);
  String [] arr = r.split("\n");
  System.out.println(arr.length);
  
}





public static void challenge44(String s){
	
	/*
	 * Write a program that divides up some input text into sentences and then determines which sentence in the input has the most words. Print out the sentence with the most words and the number of words that are in it. Optionally, also print out all words in that sentence that are longer than 4 characters.
Sentences can end in periods, exclamation points and question marks, but not colons or semi-colons.
If you need something to input, try Shylock's famous speech from Shakespeare's The Merchant of Venice:
	 * 
	 */
	String [] arr = s.split("[.!?]");
	
	System.out.println(Arrays.toString(arr));
	
	
	
	int [] numOfWord = new int[arr.length];
	
	for(int i = 0;i<arr.length;i++){
		String [] arr2 = arr[i].split("\\s+");
		numOfWord[i] =arr2.length;
	}
	
	Arrays.sort(numOfWord);
	System.out.println("Number of words in longest sentence is "+numOfWord[numOfWord.length-1]);
}



private static void printGrid(int rows, int columns) {

	   for (int i = 0; i < rows; i++) {
	      for (int j = 0; j <= 4 * columns; j++)
	         System.out.print('*');
	      System.out.println();
	      for (int k = 0; k < 3; k++) {
	         for (int j = 0; j < columns; j++) {
	            if ((j + i) % 2 == 0)
	               System.out.print("*   ");
	            else
	               System.out.print("*###");
	         }

	         System.out.println('*');
	      }
	   }
	   for (int j = 0; j <= 4 * columns; j++)
	      System.out.print('*');
	}




  public static void challenge46(int n){
	
	  int count = 0;
	  while(n>0){
		  if(n%2==0){
			  
		  }else{
			  count++;
		  }
		n=   n/2;
		
	  }
	  
	  System.out.println(count);
	  
  }


  
  
 
	  

	  
	  
	 
	  
  
 
  
  
  
  
  


}











