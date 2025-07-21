package LambdaExperssion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapIntegerNumer {

	public static void main(String[] args) {
		int []a1 = new int[] {1,2,3};
		int []a2 = new int[] {4,5,6};
		int []a3 = new int[] {7,8,9};
		
		List<int[]> intArray = Arrays.asList(a1,a2,a3);
		
		IntStream intStream = intArray.stream().flatMapToInt(array -> Arrays.stream(array));
        intStream.forEach(System.out::println);
	}
	
}
