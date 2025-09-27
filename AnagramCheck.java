package java8Hashmap;

import java.util.stream.Collectors;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		
		System.out.println(checkAnagram(s1, s2));
	}
	
	private static boolean checkAnagram(String s1, String s2) {
		
		String sorted1 = s1.toLowerCase().chars().sorted().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
		
		String sorted2 = s2.toLowerCase().chars().sorted().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
		
		return sorted1.equals(sorted2);
		
	}
}
