package combinedProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithCount {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(147,147,3,4,147,108,7,108,9,108);
		Set<Integer> dupSet = new HashSet<>();
		Map<Integer, Long> count = numbers.stream().filter(name -> !dupSet.add(name))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
	}
}
