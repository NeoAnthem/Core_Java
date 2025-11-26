package day20;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps2 {
	
	public static void main(String[] args) {
//		Map<String, String> contact = new TreeMap<String, String>();
		Map<String, String> contact = new LinkedHashMap<String, String>();
//		Map<String, String> contact = new Hashtable<String, String>();
		
		
		contact.put("Rohan", "+91 11111 12344");
		contact.put("Shruti", "+91 12345 12345");
		contact.put("Abdul", "+91 12345 22222");
		contact.put("Aditya", "+91 99999 22222");
		contact.put("Sakshi", "+91 12345 99999");
		
		System.out.println(contact);
		contact.put("Abdul", "+91 12345 12344");
		
		System.out.println(contact);
		System.out.println(contact.get("Shruti"));
		
		System.out.println( contact.getOrDefault("Shubham", "Not Found"));
		System.out.println( contact.getOrDefault("Abdul", "Not Found"));
		
		contact.replace("Shruti", "+91 12345 12345", "1212121212");
		System.out.println(contact);
		
		contact.putIfAbsent("Abdul", "1122112211");
		contact.putIfAbsent("Nalini", "1122112211");
		System.out.println(contact);
		
		contact.keySet().forEach((key)->System.out.println(key + " = "+ contact.get(key)));
		
		contact.values().forEach((value)->System.out.println(value));
		
		contact.remove("Abdul","1515888899");
		
		System.out.println(contact);
		contact.remove("Abdul");
		System.out.println(contact);
		
		contact.forEach((key, value)->System.out.println(key + " = "+value));
		
		
		
	}

}