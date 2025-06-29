package additionalProgramming;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInAString {

	public static void main(String[] args) {
		String s1 = "animal";
		Map<Character, Long> count = s1.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<Character> duplicates = count.entrySet().stream()
		.filter(entry -> entry.getValue() > 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(duplicates);
	}
}
