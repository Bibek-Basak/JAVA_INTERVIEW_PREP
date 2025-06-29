package additionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastElementOfAnArray {

	public static void main(String[] args) {

		Integer []arr = {1, 2, 3, 4, 5};
		List<Integer> reversedList = Arrays.stream(arr)
		.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list;
		}));
		System.out.println(reversedList.stream().findFirst().get());
	
	}
}
