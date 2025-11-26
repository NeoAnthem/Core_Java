package day19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionList1 {

	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(-5);
		numbers.add(14);
		numbers.add(12);
		numbers.add(10);
		numbers.add(2);
		numbers.push(50);
		
		System.out.println(numbers);
		
		numbers.offer(66);
		System.out.println(numbers);
		numbers.offerFirst(33);
		
		numbers.add(3, 1000);
		System.out.println(numbers);
		System.out.println("Gives which element will be deleted from head not delete = "+ numbers.peek());
		System.out.println(numbers);
		System.out.println("Deleted element from head = "+ numbers.poll());
		System.out.println(numbers);
		System.out.println("Deleted element from head = "+ numbers.pop());
		
		
	}
}
