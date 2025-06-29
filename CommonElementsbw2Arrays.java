package additionalProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsbw2Arrays {

	public static void main(String[] args) {
		Integer []arr1 = {3, 5, 6, 9};
		Integer []arr2 = {5, 6, 7, 8};
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        
        Set<Integer> commonSet = set1.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println(commonSet);
	}
}
