package LambdaExperssion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FeachFristChar {

	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Jyoti","Ankit","Vaibhab","Aman");
		asList.stream().flatMap(str -> Stream.of(str.charAt(0))).forEach(ch -> System.out.print(ch));
	}
}
