package combinedProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class PerformCubeAndFilterGreaterThan50 {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(2, 3, 4, 5, 6);
		list1.stream().map(num -> num*num*num).filter(ans -> ans > 50)
		.collect(Collectors.toList()).forEach(System.out::println);
	}
}
