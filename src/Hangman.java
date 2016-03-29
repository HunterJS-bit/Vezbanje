import java.util.Arrays;
import java.util.Scanner;


public class Hangman {

	
	
	
	
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String name = "aca";
char []nameArray = new char[name.length()];
int numOfGueses = 5;

	
		
		
		do {
			if(checkWinner(name, nameArray)==true ){
				numOfGueses=0;
				System.out.println("Congrats you win");
				
			}
			else{
				String	s= start();
	if(checkWord(s, name)==true){
		System.out.println("Great ,you got it");
		changeChars(s, name,nameArray);
	}else{
		
		numOfGueses--;
		System.out.println("Sorry :( ,enter other word ,you have "+numOfGueses+" tries");
	}
	}
			
		} while (numOfGueses>=1);
		
		
		
		

		
	}
	
	
	
	
	

		
		

	
	
	
	
	
	public static boolean checkWord(String n,String name){
	char m = n.charAt(0);
	
	for(int i = 0;i<name.length();i++){
		if(name.charAt(i) == m){
		return true;
		}
		}
	return false;
	}
	
	
	
	public static void changeChars(String n,String name,char [] arr){
		char m = n.charAt(0);
		
		for(int i = 0;i<name.length();i++){
			if(name.charAt(i)==m){
				arr[i]=name.charAt(i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static boolean checkWinner(String name,char [] arr){
	String b = new String(arr);
	if(name.equals(b)){
		return true;
	}else{
		return false;
	}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String start(){
		Scanner scan  = new Scanner(System.in);
		System.out.println("type a letter");
		System.out.println("_ _ _ _ _");
		String s = scan.next();
		while(s.length()>1){
			System.out.println("Try again");
			 s = scan.next();
		}
		return s;
	}
	
	
	
	
	
	
	
	
	
}

