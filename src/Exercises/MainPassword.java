package Exercises;
import java.util.Scanner;


public class MainPassword {

	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of password");
		int n;
		do {
			n = scan.nextInt();
			if(n<6){
				System.out.println("Enter longer password minimum 6 characters ");
			}else{
				PasswordGenerator generator = new PasswordGenerator(n);
				generator.generatePassword();
			
			}
		} while (n<6);
		
		
		
	}
	
	
	
	
}
