package additionalProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {

	public static void main(String[] args) {
		int []arr = {23, 45, 34, 67, 67};
		int secondMax = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secondMax);
	}
}
