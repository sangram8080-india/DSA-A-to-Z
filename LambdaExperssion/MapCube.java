package LambdaExperssion;

import java.util.List;
import java.util.stream.Collectors;

public class MapCube {

	
	public static void main(String[] args) {
		List<Integer> numbers =    List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> collect = numbers.stream().map((e)->e*e*e).collect(Collectors.toList());
		System.out.println(collect);
	}
}
