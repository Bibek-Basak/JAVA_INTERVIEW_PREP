package combinedProgramming;

import java.util.Arrays;

public class MaximumElement {

	public static void main(String[] args) {
		int []arr = {3, 5, 7, 4};
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
	}
}
