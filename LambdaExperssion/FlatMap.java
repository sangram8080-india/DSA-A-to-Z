package LambdaExperssion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A","B","C");
		List<String> list2 = Arrays.asList("D","E","F");
		List<String> list3 = Arrays.asList("G","H","I");
		
		List<List<String>> listOfLists = Arrays.asList(list1, list2, list3);
		System.out.println(listOfLists);
		List<String> collect = listOfLists.stream().flatMap((list)->list.stream()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
