package EarlyObjects;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	
	public static void main(String[] args) {
		
		
		int [] arr = { 1,2,5,4,6,9,8};
		List<int []> a = Stream.of(arr).collect(Collectors.toList());
		for(int [] b:a){
			System.out.println(b);
		}
	}
}
