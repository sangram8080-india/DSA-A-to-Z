package LambdaExperssion;

import java.util.Arrays;
import java.util.List;

public class Sotring_Name_3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Zaheer","Rahul","Aryan","Sailesh");
		names.stream().sorted().forEach((e)->System.out.println(e));
	}
}
