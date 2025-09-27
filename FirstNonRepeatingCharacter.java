package java8Hashmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "swiss";
		
		Map<Character, Long> count = s.chars().mapToObj(ch -> (char)ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		char ch = count.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().get();
		
		System.out.println(ch);
	}
}
