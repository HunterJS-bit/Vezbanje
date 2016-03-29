package Exercises;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Arrays;

public class BMI{

	
	private int height,weight;
	
	
public BMI() {
	
}


public int getHeight() {
	return height;
}


public void setHeight(int height) {
	this.height = height;
}


public int getWeight() {
	return weight;
}


public void setWeight(int weight) {
	this.weight = weight;
}
	
	
public void calculateBMI(){
	double bmi = 703*weight/(Math.pow(height, 2));
	DecimalFormat df = new DecimalFormat("#.00");
	
	if(bmi<17){
		System.out.println("Your bmi is " + df.format(bmi)+ " and you are anorexic");
	}
	if(bmi>17 && bmi<25){
		System.out.println("Your bmi is " + df.format(bmi)+ " and you are normal");
	}
	if(bmi>25 && bmi<30){
		System.out.println("Your bmi is " + df.format(bmi)+ " and you are overweight");
	}else if(bmi>30){
		System.out.println("Your bmi is " + df.format(bmi)+ " and you are obese");
	}
}
	

}