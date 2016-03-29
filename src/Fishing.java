import java.util.Random;


public class Fishing {

	
	
	
	
	public Fishing(){
		
	}
	
	
	
	public int getRandomN(){
		Random r = new Random();
		int n = r.nextInt(6)+1;
		return n;
	}

		
		
	public String getString(int n){
		
		String s = "";
		switch (n) {
		case 1:
			s = "big fish";
			break;
       case 2:
			s= "an old shoe";
			break;
       case 3:
    	   s = "little fish";
    	   break;
       case 4:
    	   s= "30 inch walleye";
    	   break;
       case 5:
    	   s = "jaws";
    	   break;
       case 6:
    	   s = "whale";
    	   break;
       default:
			break;
		}
		return s;
	}
	
	
	
	
	
	
	public int getPoints(int n){
		
		return n*10;
	}

	
}
