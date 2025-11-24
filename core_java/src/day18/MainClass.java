package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
//		Calculator calculator = (int n1,int n2)->{
//			return n1+n2;
//		};
		
		Calculator calculator = (n1,n2) -> n1+n2;

		
		System.out.println( calculator.sum(50, 10));
		
		Demo demo = ()->System.out.println("Hello All");
		
		demo.sayHello();
		
		List<Integer> numbers =  Arrays.asList(10,20,30,-5,80,-12);
		
		numbers.forEach((element)->System.out.println("Value is = "+element));
	}

}