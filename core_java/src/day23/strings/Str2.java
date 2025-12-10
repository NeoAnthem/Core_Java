package day23.strings;

public class Str2 {

	public static void main(String[] args) {
		String str = "Hello, I am learning Java, and I enjoy learning Java";

		System.out.println("Char at index 1 = " + str.charAt(1));

		System.out.println(str.indexOf("Java"));
		System.out.println(str.lastIndexOf("Java"));

		System.out.println("My String starts with H? " + str.startsWith("H"));
		System.out.println("My String starts with Hii? " + str.startsWith("Hii"));

		String str1 = "SPRK";
		String str2 = "SPRK";

		System.out.println("Both string values are same or not? " + str1.equals(str2));

		str1 = "SPRK";
		str2 = "spRK";

		System.out.println("Both string values are same or not ignore case? " + str1.equalsIgnoreCase(str2));

		System.out.println("Str contains enjoy term or not? " + str.contains("enjoy"));

		System.out.println("str = " + str);

		System.out.println(str.replace("Java", "Python"));
		System.out.println("str = " + str);

		System.out.println(str.substring(7));
		System.out.println(str.substring(21, 29));

		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		str1 = null;// form submit -> no value give -> ""
		
		// when testing through tools like postman -> we don't
		// pass value in object(body)
		
		if( str1 != null && str1.isBlank()) {
			System.out.println("String is not empty");
		}else {
			System.out.println("String is empty");
		}
		
		str1 = "      ";
		if( str1 != null && !str1.isBlank()) {
			System.out.println("String is not empty");
		}else {
			System.out.println("String is empty");
		}
		
		str1 ="    Hello    ";
		
		System.out.println(str1.length());
		
		System.out.println(str1.trim());
		System.out.println(str1.trim().length());
		
	}

}