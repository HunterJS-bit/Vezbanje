package Exercises;

import java.text.DecimalFormat;

public class TemperatureConverter {

	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	
	
	public static void fanrehitToCelzius(int celzous){
	
	
		double farenhit = (celzous * 9/5) +32;
		System.out.println("Temperature is "+farenhit+"F");
		
		
		
	}
	
	
	public static void celziusToFarenhit(double farenhit){
	//	(98.6°F  -  32)  x  5/9 
		
		int celzius = (int) ((farenhit - 32)* 5/9);
		System.out.println("Temperature is "+celzius+"C");
		
	}
	
	
	
	public static void celziusToKelvin(int c){
		double value  = 273.15;
		double kelvin = c +  value;
		System.out.println("Temerature is "+kelvin+"K");
	}
	
	
	public static void kelvinToCelzius(double k){
		double celzius = k - 273.15;
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.println("It is "+format.format(celzius)+ "C");
	}
	
	
	
	
	public static void farenhitToKelvin(double farenhit){
	
	
		double kelvin = ((farenhit+459.67)* 5/9);
		System.out.println(kelvin);
	}
	
	
	public static void kelvinToFarenhit(double k){
		
		
		double f = k * 9/5 - 459.67;
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.println("It is "+format.format(f)+"F");
	}
	
	
}
