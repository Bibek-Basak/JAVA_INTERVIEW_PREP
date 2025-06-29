package additionalProgramming;

import java.util.stream.Collectors;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1 = "Silent";
		String s2 = "Listen";
		
		System.out.println(checkAnagram(s1, s2));
	}
	
	public static boolean checkAnagram(String s1, String s2) {
		String sorted1 = s1.toLowerCase().replaceAll("\\s", "").chars().sorted()
				.mapToObj(c ->String.valueOf((char)c))
				.collect(Collectors.joining());
		
		String sorted2 = s2.toLowerCase().replaceAll("\\s", "").chars().sorted()
				.mapToObj(ch -> String.valueOf((char)ch))
				.collect(Collectors.joining());
		
		return sorted1.equals(sorted2);
	}
}
