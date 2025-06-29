package additionalProgramming;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInAString {

	public static void main(String[] args) {

		String s1 = "swiss";
		Map<Character, Long> count = s1.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Optional<Character> duplicates = count.entrySet().stream()
		.filter(entry -> entry.getValue() == 1)
		.map(Map.Entry::getKey).findFirst();
		
		if(duplicates.isPresent()) {
			System.out.println(duplicates.get());
		}
		else {
			System.out.println("All are duplicates");
		}
	}
}
