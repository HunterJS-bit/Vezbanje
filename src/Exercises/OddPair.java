package Exercises;

public class OddPair {

	/*
	 * 
	 * Write a short Java function that takes an array of int values
		and determines if there is a pair of numbers in the array whose
		product is odd.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int [] n = { 1 ,2,3,5};
		findOddPair(n);
		
	}
	
	
	
	
	public static void findOddPair(int [] arr){
		
		for(int j = 0;j<arr.length;j++){
		for(int i = j;i<arr.length;i++){
	         if((arr[j]*arr[i])%2!=0 && j!=i){
				System.out.println("Here are the pair of numbers :"+arr[j]+" and "+arr[i]);
			}
		}
	}
	
		
		
}
	
	
	
}
