package additionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOf5 {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(34, 55, 132, 23, 40, 67);
		list1.stream().filter(num -> num % 5 == 0).collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
