import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Key {


	private int meters;
	
public Key(int n) {
	this.meters = n;
}
	
	
	public void menu(){
		System.out.println("1.Convert to kilometers:\n"+
                           "2.Convert to inches\n"+
                           "3.Convert to feet\n"+
                           "4.Quit the program");
		System.out.println();
	}
	
	
	
	public double convertToKilometers(int meters){
		this.meters = meters;
		double km = meters * 0.001;
		return km;
	}
	
	
	
	public double calculateInches(int meters){
		this.meters = meters;
		double inc = meters*39.37;
		return inc;
	}
	
	
	public double calculateFeet(int meters){
		this.meters = meters;
		double feet = meters* 3.281;
		return feet;
	}
	
	
	public void quit(){
		System.out.println("Bye");
	}
}