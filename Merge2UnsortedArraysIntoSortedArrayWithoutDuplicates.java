package additionalProgramming;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge2UnsortedArraysIntoSortedArrayWithoutDuplicates {

	public static void main(String[] args) {
		Integer[] arr1 = {5, 1, 9, 3};
		Integer[] arr2 = {3, 7, 1, 4, 9};
        
        Integer[] mergedSortedNoDuplicates = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .distinct()
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(mergedSortedNoDuplicates));
	}
	
}
