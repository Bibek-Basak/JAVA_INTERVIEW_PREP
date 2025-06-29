package combinedProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OccurenceMoreThanOnce {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(147,147,3,4,147,108,7,108,9,108);
		Set<Integer> unique = new HashSet<>();
		boolean occurence = numbers.stream().anyMatch(set -> !unique.add(set));
		System.out.println(occurence);
	}

}
