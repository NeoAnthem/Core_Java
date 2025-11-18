package day15;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println(numbers);
		
		numbers.add(10);
		System.out.println(numbers);
		
		numbers.add(20);
		numbers.add(80);
		numbers.add(-5);
		System.out.println(numbers);
		
		numbers.add(1,-520);
		System.out.println(numbers);
		
		ArrayList<Integer> newCollection = new ArrayList<Integer>();
		newCollection.add(-510);
		newCollection.add(2220);
		newCollection.add(999);
		
		numbers.addAll(newCollection);
		
		System.out.println(numbers);
		numbers.addAll(1, newCollection);
		System.out.println(numbers);
		
		System.out.println("Length of array list = "+numbers.size());
		
		System.out.println("Accessing Elements");
		System.out.println("Element at index 3 = "+numbers.get(3));
		
		System.out.println("First Element = "+numbers.get(0));
		System.out.println("Last Element = "+numbers.get(numbers.size()-1));
		
		System.out.println(numbers);
		System.out.println("Element deleted at index 2 ="+ numbers.remove(2));
		System.out.println(numbers);
		
	}

}