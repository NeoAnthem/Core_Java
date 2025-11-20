package day16;

import java.util.ArrayList;

// Store fruits name (String) in a List
public class ArrayListEx2 {
	
	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Watermelon");
		fruits.add("Litchi");
		fruits.add("Stawberry");
		fruits.add("Banana");
		fruits.add("Papaya");
		
		System.out.println(fruits);
		fruits.add(1,"Apple");
		System.out.println(fruits);
		fruits.add("Banana");
		System.out.println(fruits);
		
		System.out.println(fruits.get(3));
		
		System.out.println("Element Banana at index number = "+fruits.indexOf("Banana"));
	
		System.out.println("Last Element Banana at index number = "+fruits.lastIndexOf("Banana"));
		
		System.out.println("My Fruits Contains Guava or not? "+fruits.contains("Guava"));
		System.out.println("My Fruits Contains Apple or not? "+fruits.contains("Apple"));
		
		System.out.println(fruits);
		
		System.out.println(fruits.remove("Guava"));
		System.out.println(fruits);
	
		System.out.println(fruits.remove("Apple"));
		System.out.println(fruits);
		
		// Loops to print element 
		System.out.println("All fruits using normal for loop are: ");
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println("I like "+fruits.get(i));
		}
		// Enhanced for loop
		System.out.println("All fruits using enhanced for loop are: ");
		for(String theFruit : fruits) {
			System.out.println("I have "+theFruit+" in refrigerator");
		}
		
	}
	

}