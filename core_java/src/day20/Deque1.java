package day20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
	
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(50);
		deque.add(20);
		deque.add(26);
		System.out.println(deque);
		
		deque.push(555);
		System.out.println(deque);
		
		deque.offer(1111);
		System.out.println(deque);
		
		
		
		
	}

}