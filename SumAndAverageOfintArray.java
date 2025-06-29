package additionalProgramming;

import java.util.Arrays;

public class SumAndAverageOfintArray {

	public static void main(String[] args) {
		int []arr = {23, 45, 34, 67, 67};
		int sum = Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		double average = Arrays.stream(arr).boxed().mapToInt(Integer::intValue)
				.average().getAsDouble();
		System.out.println(average);
	}
}
