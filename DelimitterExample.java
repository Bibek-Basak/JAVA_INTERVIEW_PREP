package additionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DelimitterExample {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "orange");
		System.out.println(items.stream().collect(Collectors.joining(",", "", "")));
	}
}
