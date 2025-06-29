package additionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartWithNumber {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Rohan", "2Sohan", "6Ajay", "Binod");
		list1.stream().filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0)))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
