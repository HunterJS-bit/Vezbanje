package Exercises;

import java.util.Scanner;

public class TossMain {
public static void main(String[] args) {
Toss tos = new Toss();
int head = 0;
int tails = 0;
for(int i = 0;i<100;i++){
	tos.toss();
	String s = tos.getSideUp();
	if(s.equals("heads")){
		head++;
	}else if(s.equals("tails")){
		tails++;
	}
}
	
	
	
System.out.println("Heads won "+ head + " times");
System.out.println("Tails won "+ tails + " times");
}

















}
