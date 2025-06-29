package combinedProgramming;

import java.util.Arrays;
import java.util.List;

public class SortAscending {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(147,147,3,4,147,108,7,108,9,108);
		numbers.stream().sorted().forEach(e -> System.out.print(e+" "));
	}
}
