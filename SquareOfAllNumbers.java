package streamAPI;

import java.util.Arrays;
import java.util.List;

public class SquareOfAllNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().map(n -> n * n).forEach(System.out::println);
	}
}
