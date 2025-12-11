package day24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamEx2 {
	
	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(84,45,35,12,32,48,30,50,26);
		
		System.out.println("Marks");
		System.out.println(marks);
		
		// get all pass students marks
		
		System.out.println("Passed Marks");
		System.out.println(
				marks
				.stream()
				.filter((theMark)->(theMark >= 35))
				.toList()
				);
		
		System.out.println("Failed Marks");
		System.out.println(
				marks
				.stream()
				.filter((theMark)->(theMark < 35))
				.toList()
				);
	
		// Give failed student marks grace marks of 10
		
		System.out.println("Failed Student Marks after adding 10 Grace Marks");
		System.out.println(
				marks.stream()
				.filter((theMark)->(theMark<35))
				.map((theMark)-> (theMark+10))
				.toList()
		);
		
		System.out.println("Passed Student Marks after adding 10 Grace Marks");
		System.out.println(
				marks.stream()
				.filter((theMark)->(theMark<35))
				.map((theMark)-> (theMark+10))
				.filter((theMark)->(theMark >= 35))
				.toList()
		);
		
		System.out.println("Count Passed Student Marks after adding 10 Grace Marks");
		System.out.println(
				marks.stream()
				.filter((theMark)->(theMark<35))
				.map((theMark)-> (theMark+10))
				.filter((theMark)->(theMark >= 35))
				.count()
		);
		
		System.out.println("Total Students ");
		
		System.out.println(
				marks.stream().count()
				);
		
		System.out.println("Maximum Marks Of Students");
		
		Optional<Integer> optionalMax = marks
				.stream()
				.max((o1,o2)->(Integer.compare(o1, o2)));
		
		Integer maxNumber = optionalMax.orElseThrow(()-> new RuntimeException("Max Not Found"));
		System.out.println(maxNumber);
		
		System.out.println("Minimum Marks Of Students");
		System.out.println(
				marks
				.stream()
				.min((o1,o2)->(Integer.compare(o1, o2)))
				.orElseThrow(()-> new RuntimeException("Min Not Found"))
				);
		
		
	}

}