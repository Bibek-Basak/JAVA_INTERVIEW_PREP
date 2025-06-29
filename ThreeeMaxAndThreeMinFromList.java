package additionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeeMaxAndThreeMinFromList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 89, 67, 23, 100, 765, 465);
		
	    list1.stream().sorted(Comparator.reverseOrder()).limit(3)
				.forEach(e -> System.out.print(e+" "));
		System.out.println();
		list1.stream().sorted(Comparator.naturalOrder()).limit(3)
				.forEach(e -> System.out.print(e+" "));
	}
}
