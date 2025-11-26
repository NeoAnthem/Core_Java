package day20;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {
	
	public static void main(String[] args) {
		
		Set<String> favFruits = new TreeSet<String>();
		
		favFruits.add("Blue Berry");
		favFruits.add("Orange");
		favFruits.add("Litchie");
		favFruits.add("Banana");
		favFruits.add("Apple");
		favFruits.add("Mango");
		favFruits.add("Banana");
		favFruits.add("Water Mellon");
		favFruits.add("Banana");
		
		System.out.println(favFruits);
		
		favFruits.remove("Banana");
		System.out.println(favFruits);
		
		favFruits.forEach((fruit)->System.out.println(fruit));
		
		System.out.println("Before removing all fruits with letter 'a'");
		System.out.println(favFruits);
		
		favFruits.removeIf((fruit)->fruit.toLowerCase().contains("a")); 
		
		System.out.println("After removing all fruits with letter 'a'");
		System.out.println(favFruits);
		
		
	}

}