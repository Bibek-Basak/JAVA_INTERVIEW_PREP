package additionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIncreasingOrder {

	public static void main(String[] args) {
		List<String> s1 = Arrays.asList("Rahul", "Rajesh", "Rinki", "Sachiv");
		s1.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
