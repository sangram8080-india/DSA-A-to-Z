package LambdaExperssion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fillter_1 {

	
	public static void main(String[] args) {
		
		 List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,3, 10);
		 
		 Stream<Integer> filter = asList.stream().filter((e)->e%2==0);
		 List<Integer> collect = filter.collect(Collectors.toList());
		 Object[] array = collect.toArray();
		 System.out.println(Arrays.toString(array));
		
		
	}
}
