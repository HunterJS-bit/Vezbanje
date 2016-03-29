import java.awt.Choice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Klass {

	
private int row;
private int column;
private int[][] array;


public Klass(){
	
}


public Klass(int n,int m) {
	this.row = n;
	this.column = m;
	array = new int [row][column];
}




public int getTotal(int [][] arr){
	int sum = 0;
	this.array = arr;

	for(int i = 0;i<arr.length;i++){
for(int i3= 0;i3<arr[i].length;i3++){
	sum+=arr[i][i3];
	

}

	}
	return sum;

}



public int getAverage(int [][] arr){
	int total = getTotal(arr);
	
	int counter = 0;
	
	for(int  i = 0;i<arr.length;i++){
		for(int y=0;y<arr[i].length;y++){
			counter++;
		}
	}
	int average = total/counter;
	return average;
}




public int getRowTotal( int [][] arr,int n){
	
	int sum = 0;
	for(int i = 0;i<arr[n].length;i++){
		sum+= arr[n][i];
	}
	
return sum;
	}






public void getColumnTotal(int [][] arr,int n){
	
	int sum = 0;
	
	for(int i = 0;i<arr.length;i++){
		sum+= arr[i][n];
	
	}
	System.out.println(sum);
}




public void getHighestInRow(int [][] arr,int n){
	int min = arr[n][0];
	int r = arr[n].length;
	for(int i = 0;i<arr[n].length;i++){
		if(arr[n][i]<min){
			min = arr[n][i];
		}
	}
	System.out.println(min);
}
	
}
	
	
	
	
	

