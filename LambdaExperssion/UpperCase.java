package LambdaExperssion;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		List<String> listOfString =       List.of("Raj","Rahul","Hyderabad", "ArrayIndexOutOfBoundsException");
		List<String> collect = listOfString.stream().map((e)->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
