package streamAPI;

import java.util.Arrays;
import java.util.List;

public class LimitFirst2oddNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7
                );
		
		numbers.stream().filter(n -> n%2 != 0).limit(2).forEach(System.out::println);
	}
}
