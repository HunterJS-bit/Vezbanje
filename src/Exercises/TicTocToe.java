package Exercises;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;



public class TicTocToe{
    private boolean IsWinner;
	private String [][] arr;
	private int arrSize = 3;
	private enum tic{
		EMPTY("null"),X("X"),O("O");
		
		private final String name;
		
		private tic(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
		
	}
	
public TicTocToe() {
	arr = new String[3][3];
	IsWinner = false;
}
	





public void initiateArray(){
	
	
	for(int i = 0;i<arr.length;i++){
		for(int j = 0;j<arr[i].length;j++){
			arr[i][j] = "null";
		}
	}
	
	
}




public void playX(int a,int b){
	if(a<arr.length && b<arr.length){
	
	
	if(arr[a][b].equals(tic.EMPTY.getName())){
		arr[a][b] = tic.X.getName();
	}else{
		System.out.println("You cannot type here");
	}
	}
	
	else{
		System.out.println("Invalid position out of bounds, try again");
	}
}




public void playO(int a,int b){
	if(a<arr.length && b<arr.length){
		
		
	if(arr[a][b].equals(tic.EMPTY.getName())){
		arr[a][b] = tic.O.getName();
	}else{
		System.out.println("you cannot play here");
	}
	
	}
	
	else{
		System.out.println("Invalid position out of bounds ,try again");
	}
}



public boolean checkWinner(){

	int count = 0;
	boolean winner = false;
for(int i = 0;i<arr.length;i++){
	for(int j = 0;j<arr.length;j++){
		if(arr[i][j].equals(tic.X.getName()) || arr[j][i].equals(tic.O.getName())){
			count++;
			
		}
	}
	if(count==3){
		
		System.out.println("we have winner");
		winner = true;
		break;
	}else{
	count = 0;}
}


//some comments 

for(int i = 0;i<arr.length;i++){
	for(int j = 0;j<arr[i].length;j++){
		if(arr[j][i].equals(tic.X.getName()) || arr[j][i].equals(tic.O.getName())){
			count++;
		}
	
	}
	if(count == 3){
		System.out.println("we have winner");
		winner = true;
		break;
	}else{
		count = 0;
	}
	
}



for(int i = 0;i<arr.length;i++){
	if(arr[i][i].equals(tic.X.getName())){
		count++;
	}
	if(count==3){
		System.out.println("We have winner");
		winner = true;
	}
}


for(int i = 0;i<arr.length;i++){
	if(arr[i][arr.length-i-1].equals(tic.X.getName())  || arr[i][arr.length-i-1].equals(tic.O.getName())){
		count++;
	}
	if(count==3){
		System.out.println("We have winner");
		winner = true;
	}
	
}

return winner;



}








}
