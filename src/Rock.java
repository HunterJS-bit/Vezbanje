import java.util.Random;


public class Rock {

	
	
	public int random(){
		Random r = new Random();
		
		int n = r.nextInt(3)+1;
		return n;
	}
	
	
	public void choices(){
		System.out.println("1. Rock\n"+
                           "2. Paper\n"+
                           "3. Scissors");
	                       }
	
	
	public String computerChoice(){
		int n = random();
		String s;
		if(n==1){
			return s = "Rock";
			
		}else if(n==2){
			return s = "Paper";
			
		}else if(n==3){
			return s ="Scissors";
			}
		return "type again";
	}
	
	
	
	public String userChoice(int n){
		String s;
		if(n==1){
			return s = "Rock";
			
		}else if(n==2){
			return s= "Paper";
			
		}else if(n==3){
			return s="Scissors";
			}
		return "type again";
	}
	
	
	
	
	
}
