package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(15);
		list.add(2);
		list.add(90);
		list.add(-5);
		list.add(0);
		list.add(78);
		list.add(30);
		list.add(1);
		System.out.println("List before Sorting in ascending order: ");
		System.out.println(list);
		
		System.out.println("List after Sorting in ascending order: ");
//		Sorting Algo is TIMSORT
		list.sort(null);
		System.out.println(list);
		
		System.out.println("List after Sorting in descending order: ");
//		list.sort(Comparator.reverseOrder());
		list.sort(Collections.reverseOrder());
		System.out.println(list);
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shriti");
		names.add("Ankesh");
		names.add("Aman");
		names.add("Rohini");
		names.add("Pranjal");
		names.add("Abdul");
		names.add("Tommy");
		
		System.out.println("Names before sorting:");
		System.out.println(names);
		
		names.sort(null);
		System.out.println("Names after sorting in ASC:");
		System.out.println(names);
		
		names.sort(Collections.reverseOrder());
		System.out.println("Names after sorting in DESC:");
		System.out.println(names);
		
	}

}