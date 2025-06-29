package combinedProgramming;

import java.util.List;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3);
		List<Integer> list2 = List.of(5,6,7);
		
		Stream<Integer> st1 = list1.stream();
		Stream<Integer> st2 = list2.stream();
		
		Stream<Integer> concatenated = Stream.concat(st1, st2);
		concatenated.forEach(e -> System.out.print(e+" "));
	}
}
