package additionalProgramming;

import java.util.stream.IntStream;

public class First10Even {

	public static void main(String[] args) {
		IntStream.iterate(2, n -> n + 2).limit(10).forEach(System.out::println);
	}
}
