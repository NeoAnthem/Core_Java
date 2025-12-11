package day24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(60,80,1,-5,-5,30,-85,60,1);
		
//		numbers.stream().forEach(System.out::println);
		
		// Remove all negative numbers
		// filter
//		List<Integer> positiveNumbers = numbers
//			.stream()
//			.filter((num)-> (num > 0))
//			.collect(Collectors.toList());
		
		List<Integer> positiveNumbers = numbers
				.stream()
				.filter((num)-> (num > 0))
				.toList();
		
		System.out.println("All Numbers = "+numbers);
		System.out.println("Only Positive Numbers = "+positiveNumbers);
		
		
	}
}