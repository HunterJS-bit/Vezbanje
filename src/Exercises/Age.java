package Exercises;

import java.util.Date;

public class Age {

	
	
	
	private int seconds;
	
	public Age() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void calculateAge(int n){
		double d =calculateNormal();
		for(int i = 1;i<n;i++){
			if(i%4==0){
				d = d+calculateLeap();
			}else{
			 d= d+ calculateNormal();}
		}
		System.out.println(d);
		
		
		
	}
	
	
	public int calculateNormal(){
		return 24*365*60*60;
	}
	
	
	
	
	public int calculateLeap(){
		return 24*364*60*60;
	}
	
	

}
