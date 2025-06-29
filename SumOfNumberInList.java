package additionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumOfNumberInList {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(34, 57, 132, 23, 46, 67);
		int sum = list1.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		Optional<Integer> max = list1.stream().max(Comparator.comparing(Integer::intValue));
		System.out.println(max.get());
	}
}
