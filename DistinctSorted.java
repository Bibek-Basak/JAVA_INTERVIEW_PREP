package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSorted {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
                3,3,3,
                5,5,5,5,5,
                2,2,
                1,
                4,4,4,4
                );
 
        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        distinctNumbers.forEach(System.out::println);
	}
}
