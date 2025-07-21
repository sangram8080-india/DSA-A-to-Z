package LambdaExperssion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FillterByName_2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ravi", "Rahul", "Akshar", "Roshan","Raj","Ankit","Ravi");
		List<String> collect = list.stream().filter((e)->e.startsWith("R")).distinct().collect(Collectors.toList());
		Object[] array = collect.toArray();
		System.out.println(Arrays.toString(array));
	}
}
