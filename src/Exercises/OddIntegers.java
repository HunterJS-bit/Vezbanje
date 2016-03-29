package Exercises;

public class OddIntegers {

	
	/*
	 * 
	 * Write a short Java function that takes an integer n and returns
	the sum of all the odd integers smaller than n.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		oddInt(10);
		
	}
	
	
	
	public static void oddInt(int n){
		int sum = 0;
		for(int i = 0;i<n;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}
	
	
	
}
