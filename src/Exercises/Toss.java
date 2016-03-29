package Exercises;

import java.util.Random;

public class Toss {

	
	
	private String sideUp;
	
	public Toss() {
		toss();
	}
	
	
	
	public void toss(){
		Random r = new Random();
	int num = r.nextInt(2);
	if(num==1){
		sideUp = "heads";
	}else if(num==0){
		sideUp = "tails";
	}
	}
	
	
	public String getSideUp(){
		return sideUp;
	}
}
