package java8Hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordsInASentence {

	public static void main(String[] args) {
		
		String program = "Java Java Python Java Kotlin Kotlin";
		
		Map<String, Long> count = Arrays.stream(program.split("\\s"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(count);
	}
}
