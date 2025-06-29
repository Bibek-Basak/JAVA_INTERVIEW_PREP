package combinedProgramming;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		String s1 = "I am a good boy";
		Map<Character, Long> count = s1.chars().mapToObj(ch -> (char)ch)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
	}
}
