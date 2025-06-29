package additionalProgramming;

import java.util.stream.IntStream;

public class SumOfFirst10NaturalNumbers {

	public static void main(String[] args) {
		//int add = IntStream.range(1, 10).sum();
		int sum = IntStream.rangeClosed(1, 10) // 1 to 10 inclusive
                .sum();

		System.out.println(sum);
	}
}
