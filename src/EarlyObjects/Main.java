package EarlyObjects;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	
	
	public static void main(String[] args) {
		
		priorityQue();
	
	}
	
	


	public static void countingLetter(String word){
		/* 
		 * (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
	of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
	Es, two Ls, one O, one T and one R. Display the results.
		 */
String [] words  =	word.split("\\s+");

HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();

for(int i = 0;i<words.length;i++){
	for(int j = 0;j<words[i].length();j++){
		
		if(mapa.containsKey(words[i].charAt(j))){
			int count  = mapa.get(words[i].charAt(j));
			
			mapa.put(words[i].charAt(j), count + 1);
		}else{
			mapa.put(words[i].charAt(j), 1);
		}
		
	}
}

System.out.println(mapa.toString());
	}
	
	
	
	
	public static void linkedList125(){
		/*
		 * (Inserting Elements in a LinkedList in Sorted Order) Write a program that inserts 25 random
integers from 0 to 100 in order into a LinkedList object. The program should sort the elements,
then calculate the sum of the elements and the floating-point average of the elements.
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		java.util.List<Integer> liste = new LinkedList<Integer>();
		for(int i = 0;i<25;i++){
			//int n = scan.nextInt();
			int n = (int) (Math.random() * (100)) + 0;
			System.out.println(n);
			liste.add(n);
		}
		
		
		System.out.println(liste);
		Collections.sort(liste);
		System.out.println(liste);
		int total = 0;
		for(int i = 0;i<liste.size();i++){
			total = total + liste.get(i);
		}
		
		System.out.println(total);
	}
	
	
	
	
	public static void copyReverseList(){
		/*
		 * (Copying and Reversing LinkedLists) Write a program that creates a LinkedList object of
10 characters, then creates a second LinkedList object containing a copy of the first list, but in reverse
order
		 */
		 
		 String alphabet= "abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		java.util.List<Character> list = new LinkedList<Character>();
		for(int i = 0;i<10;i++){
		
		 char random_3_Char =  alphabet.charAt((int) (Math.random()*alphabet.length()));
		
		 list.add(random_3_Char);
		}
		
		List<Character> list2 = new LinkedList<Character>();
	
		list2.addAll(list);
		System.out.println(list);
		Collections.reverse(list2);
		System.out.println(list2);
		
		
	}
	
	
	
	
	
	public static void primeFactors(int num){
		/*
		 * (Prime Numbers and Prime Factors) Write a program that takes a whole number input
from a user and determines whether it’s prime. If the number is not prime, display its unique prime
factors. Remember that a prime number’s factors are only 1 and the prime number itself. Every
number that’s not prime has a unique prime factorization. For example, consider the number 54.
The prime factors of 54 are 2, 3, 3 and 3. When the values are multiplied together, the result is 54.
For the number 54, the prime factors output should be 2 and 3. Use Sets as part of your solution.
		 */
		
		
	boolean prime = isPrime(num);
		if(prime==true){
			System.out.println("Number is prime");
		}else{
			
			Set<Integer> divisors = new HashSet<Integer>();
			
			int [] primeNumbers = {2,	3,	5,	7,	11,	13,	17,	19,	23,	29 ,31};
			int i = 0;
			System.out.println(num);
			while(!(isPrime(num))){
				
				if(num% primeNumbers[i]==0){
					
					num = num/ primeNumbers[i];
					divisors.add(primeNumbers[i]);
					System.out.println(num);
				}else{
					i++;
				}
			}
			
			
			
			
			System.out.println("prime factors are " +divisors);
			
			
		}
		
		
		
	}
	
	public static boolean isPrime(int num){
		for(int i = 2;i<num-1;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void sortinWithTreeSet(String word){
		/*
		 * 16.20 (Sorting Words with a TreeSet) Write a program that uses a String method split to tokenize
a line of text input by the user and places each token in a TreeSet. Print the elements of the
TreeSet. [Note: This should cause the elements to be printed in ascending sorted order.]
		 * 
		 * 
		 */
		
		String [] ar = word.split("\\s+");
		for(int i = 0;i<ar.length;i++){
			System.out.print(ar[i]);
			System.out.println();
		}
		
		TreeSet<String> words = new TreeSet<String>(Arrays.asList(ar));
		
		System.out.println(words);
	}
	
	
	
	
	public static void priorityQue(){
		
		/*
		 * (Changing a PriorityQueue’s Sort Order) The output of Fig. 16.15 shows that Priority-
Queue orders Double elements in ascending order. Rewrite Fig. 16.15 so that it orders Double elements
in descending order (i.e., 9.8 should be the highest-priority element rather than 3.2).
		 */
		Queue<Double> list = new PriorityQueue<Double>(10, new Comparator());
	
		list.offer(3.2);
		list.offer(9.8);
		list.offer(5.4);
		
		for(int i = 0;i<list.size();i++){
			list.peek();
			list.remove();
			System.out.println(list);
		}
		
		/*
		 * public class Comparator implements java.util.Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
	if(o1 <o2){
		return 1;
	} if(o1>o2){
		return -1;
	}else{
		return 0;
	}
	}
		 * 
		 * 
		 */
		
	}
	
	
	
		
	
	
	
	
	
}
