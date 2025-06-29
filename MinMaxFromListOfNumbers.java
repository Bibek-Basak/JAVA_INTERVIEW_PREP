package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxFromListOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(numbers.stream().max(Comparator.naturalOrder()).get());
		System.out.println(numbers.stream().min(Comparator.naturalOrder()).get());
	}
}
