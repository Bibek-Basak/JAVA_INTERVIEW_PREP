package combinedProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(147,112,3,4,513,621,7,108,9,10);
		System.out.println(numbers.stream().filter(num -> num.toString().startsWith("1")).collect(Collectors.toList()));
	}
}
