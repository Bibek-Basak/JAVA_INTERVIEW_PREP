package additionalProgramming;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		int limit = 5;
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
		.limit(limit).map(f -> f[0]).forEach(System.out::println);
		}
}
