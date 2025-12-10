package day23.mutable_strings;

//Mutable String -> StringBuffer / StringBuilder
public class Str1 {
	
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb);
		
		sb.append("I learn Java");
		System.out.println(sb);
		
		sb.delete(5, 6);
		System.out.println(sb);

		sb.insert(5, " I am learning at SPRK you");
		
		System.out.println(sb);
		
		
	}

}