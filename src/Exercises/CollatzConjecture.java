package Exercises;

public class CollatzConjecture {

	
	
	public static void main(String[] args) {
		//enter any positive integer , it should always return 1
		collatzConjecture(9);
		
		
	}
	





public static void collatzConjecture(int n){

	

while(n!=1){
	if(n%2==0){
		n = n/2;
		System.out.println(n);
	}else if(n%2!=0){
		n= 3*n+1;
		System.out.println(n);

	}

 }

System.out.println(n);



}











}