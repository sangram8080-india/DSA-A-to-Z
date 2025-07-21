package LambdaExperssion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_2 {

	
	public static void main(String[] args) {
		 List<Integer> primeNumbers = Arrays.asList(5,7,11);
	      List<Integer> evenNumbers = Arrays.asList(2,4,6);
	      List<Integer> oddNumbers = Arrays.asList(1,3,5);
	      List<List<Integer>> listOfList= Arrays.asList(primeNumbers,evenNumbers,oddNumbers);
	      
	      List<Integer> collect = listOfList.stream().flatMap((e)->e.stream()).collect(Collectors.toList());
	      System.out.println(collect);
	      
	}
}
