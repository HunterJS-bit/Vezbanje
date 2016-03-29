package Exercises;

public class BinarySearch {

	
	
	
	public static void main(String[] args) {
		
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		binarySearch(11, arr);
	}
	
	
	
	
	public static boolean binarySearch(int key,int [] data){
		int size = data.length;
	     int low = 0;
	             int high = size - 1;
	              
	             while(high >= low) {
	                  int middle = (low + high) / 2;
	                  if(data[middle] == key) {
	                      return true;
	                  }
	                  if(data[middle] < key) {
	                      low = middle + 1;
	                  }
	                  if(data[middle] > key) {
	                      high = middle - 1;
	                  }
	             }
	             return false;
	
}
	
}
