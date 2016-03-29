import java.util.Arrays;


public class LengthEncoding {

	
	
	
	public static void main(String[] args) {
		/*
		
		String s = "abaaaaba";
		lengthEncoding(s);
		
		
		
		int[] arr = {1,2,3,4,5,6,7};
		rotateArray(arr, 5);
		*/
		/*
		int[] arr = {1,2,3,4,5,5,5,5,6,7};
		
		findKthLargest(arr, 3);
		
		int [] arr = {2, 7, 11, 15};
		
		twoSum(arr, 9);
		System.out.println(isDuplicated(arr));
		
		passcalTriangel(6);
		*/
		
int arr = 4355;


largestNumber(arr);
		
		
		
		
	}
	
	
	
	
	public static void lengthEncoding(String str){
		/*
		 * 
		 * 
		 * aaaaPPPrrrrr

	is replaced with

	4a3P5r
		 */
		StringBuilder b = new StringBuilder();
		char letter = str.charAt(1);
		b.append(str.charAt(0));
		int count = 0;
		for(int i = 0;i<str.length();i++){
			
			
			if(str.charAt(i)==letter){
				count++;
			}else{
				b.append("("+count+")");
				b.append(str.charAt(i));
				
				
				letter = str.charAt(i);
				
				count=1;
				
			}
			
		}
		b.append("("+count+")");
		System.out.println(b);
	
		
		
	}
	
	
	
	public static void rotateArray(int [] arr,int k){
		/*
		 * Problem: Rotate an array of n elements to the right by k steps.
		 *  For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different ways do you know to solve this problem?
		 * 
		 * 
		 */
		
		
	int [] arr2 = new int[arr.length];
	
	for(int i = 0;i<k;i++){
		arr2[i] = arr[arr.length-k+i];
	}
	
	
	
	for(int i = k;i<arr.length;i++){
		arr2[i] = arr[i-k];
	}
	
	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
	
	
	
	
	
	
	public static void findKthLargest(int [] arr,int k){
		/*
		 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example, given [3,2,1,5,6,4] and k = 2, return 5.

Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
		 * 
		 */
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-k]);
		
		
	}
	
	
	
	
	
	
	public static void twoSum(int [] arr,int n){
		/*
		 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

For example:

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
		 * 
		 * 
		 * 
		 */
		
	
		
		
	
			for(int j = 0;j<arr.length;j++){
				
				
				
				for(int i = j+1;i<arr.length;i++){
					if(arr[j]+arr[i]==n){
						System.out.println(arr[j]+" "+arr[i]);
						System.out.println("Their indexes are "+j+" , "+i);
					}
				}
				
				
				
			}
			
			
		
		
		
		
	}
	
	
	
	
	
	
	public static boolean isDuplicated(int [] arr){
		
		
		
		for(int i = 0;i<arr.length;i++){
			
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					return false;
				}
			}
			
			
			
		}
		
		return true;
		
		
	}
	
	
	
	
	
	public static void passcalTriangel(int n){
		/*
		 * 
		 * 
		 * Given numRows, generate the first numRows of Pascal's triangle. For example, given numRows = 5, the result should be:

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		int [][] arr = new int [n][];
		
		if(n<3){
			for(int i = 0;i<arr.length;i++){
				arr[i] = new int[i+1];
				arr[i][0] = 1;
				arr[i][arr[i].length-1] = 1;
				
			}
			System.out.println(Arrays.deepToString(arr));
			
		}else{
			
			for(int i = 0;i<arr.length;i++){
				arr[i] = new int[i+1];
				arr[i][0] = 1;
				arr[i][arr[i].length-1] = 1;
				
			}
			
			
			for(int i = 2;i<arr.length;i++){
				for(int j = 1;j<arr[i].length-1;j++){
					arr[i][j] = arr[i-1][j-1] +arr[i-1][j];
				}
			}
		
		
		System.out.println(Arrays.deepToString(arr));
			
			
			
		}
			
			
			
			
			
		
	}

	
	
	
	
	public static void largestNumber(int arr ){
		StringBuilder build = new StringBuilder();
		

	
	while(arr>10){
		System.out.println(arr);
		arr = arr/10;
	}
		
	
	}
	
	
}
