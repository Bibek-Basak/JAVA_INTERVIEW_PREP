package additionalProgramming;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {

	public static void main(String[] args) {
		String s1 = "Rhinocerous";
		Map<Character, Long> count = s1.chars().mapToObj(ch -> (char)ch)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
	}
}
