package additionalProgramming;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge2UnsortedArraysIntoSortedArray {

	public static void main(String[] args) {
		Integer []arr1 = {1,5,3,6};
		Integer []arr2 = {2,7,1,5};
		
		System.out.println(Arrays.toString(Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted()
		.toArray(Integer[]::new)));
		
	//	int []arr3 = merged(arr1, arr2);
	//	System.out.println(Arrays.toString(arr3));
	}
	
	public static int[] merged(int[] arr1, int[] arr2) {
        return Arrays.stream(new int[][]{arr1, arr2}) 
                     .flatMapToInt(Arrays::stream)    
                     .sorted()                       
                     .toArray();
    }
}
