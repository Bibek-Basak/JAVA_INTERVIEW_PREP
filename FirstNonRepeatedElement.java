package combinedProgramming;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(147,147,3,4,147,108,7,108,9,108);
		Integer firstNonRepeated = numbers.stream()
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
		.filter(entry -> entry.getValue() == 1)
		.map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(firstNonRepeated);
	}
}
