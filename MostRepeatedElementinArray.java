package additionalProgramming;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementinArray {

	public static void main(String[] args) {
		Integer[] array = {1, 3, 2, 1, 4, 1, 3, 2, 3, 3};
		Map<Integer, Long> count = Arrays.stream(array)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map.Entry<Integer, Long> mostRepeated = count.entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElse(null);
		
		System.out.println(mostRepeated.getKey());
	}
}
