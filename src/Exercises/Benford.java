package Exercises;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Benford {
	 
		  
	public static void main(String[] args) {
		Random r = new Random();
		int [] arr = { 0,1,2,3,4,5,6,7,8,9};
	  // random generated numbers
		int [] numbers = { 1134,6889,3306,5871,1757,7451,8481,1356,5572,2037,3901,2618,3036,2010,2441,3130,2916,
2841,8945,6030,9830,6637,5750,4934,5762,5985,7017,2779,9884,1853,178,5489,18473943,1105,1625,8530,1913,2086,2052,1964,5219,
3287,6234,2610,2122,4123,3389,8035,3072,7119,5951,5121,1335,2010,1793,2341,8047,5387,1809,4982,2683,6449,1512,1139,3441,1399,
2518,1902,2803,3929,4268,1495,3924,1470,2243,1641,1633,5516,1970,1231};
		getFirstDigit(arr, numbers);
		
	}
	


	




public static void getFirstDigit(int [] n,int[] arr){
	int num = 0;
	for(int i = 0;i<arr.length;i++){
		num = arr[i];
		while(num>10){
			num=num/10;
		}
		switch (num) {
		case 0:
			n[0]++;
			break;
		case 1:
			n[1]++;
			break;
		case 2:
			n[2]++;
			break;
		case 3:
			n[3]++;
			break;
		case 4:
			n[4]++;
			break;
		case 5:
			n[5]++;
			break;
		case 6:
			n[6]++;
			break;
		case 7:
			n[7]++;
			break;
		case 8:
			n[8]++;
			break;
		case 9:
			n[9]++;
			break;
		default:
			break;
		}

	}
	
	


}

}