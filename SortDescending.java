package combinedProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDescending {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(147,147,3,4,147,108,7,108,9,108);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e+" "));
	}

}
