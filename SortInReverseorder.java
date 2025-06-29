package additionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInReverseorder {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(7, 8, 3, 89, 67, 1);
	    list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
	    .forEach(ans -> System.out.print(ans+" "));
	}
}
