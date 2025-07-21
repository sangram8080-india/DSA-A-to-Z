package LambdaExperssion;

import java.util.stream.Stream;

public class Skip1 {

	
		public static void main(String[] args) 
		{
			Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina","Sahwag","Sachin","Bumrah");
			s.skip(3).limit(4).forEach(System.out::println);
		}
	
}
