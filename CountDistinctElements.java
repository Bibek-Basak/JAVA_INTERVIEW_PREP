package streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountDistinctElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
                1,
                2,2,
                3,3,3,
                4,4,4,4,
                5,5,5,5,5
                );
		long count = numbers.stream().distinct().count();
		System.out.println(count);
	}
}
