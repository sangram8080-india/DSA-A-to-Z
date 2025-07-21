package LambdaExperssion;

import java.util.stream.Stream;

public class LimitStreamDemo {

	public static void main(String[] args) 
	{
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Stream<Integer> limitedStream = numbers.limit(6);

		limitedStream.forEach(System.out::println);
	}
}
