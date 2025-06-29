package combinedProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElementFromList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
	}
}
