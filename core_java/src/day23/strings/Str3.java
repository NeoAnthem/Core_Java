package day23.strings;

import java.util.ArrayList;
import java.util.Comparator;

public class Str3 {
	
	public static void main(String[] args) {
		String skills = "Java,Python,SQL,Spring Boot,AWS";
		
		System.out.println(skills);
		
		String[] skillsArr= skills.split(",");
		
		System.out.println(skillsArr);
		
		for(String skill:skillsArr) {
			System.out.println("User Skill = "+skill);
		}
		
		String[] fruitsArr = {"Apple","Orange","Chickoo","Banana"};
		
		
		System.out.println(fruitsArr);
		
		// convert array into single String
		String fruitsStr = String.join(" - ", fruitsArr);
		
		System.out.println(fruitsStr);
		
		
	}

}

