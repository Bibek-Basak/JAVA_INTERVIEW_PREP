package combinedProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortAnArrayIntoStream {

	public static void main(String[] args) {
		int []coin = {2, 5, 3, 6 ,7};
		IntStream ans = Arrays.stream(coin).sorted();
		ans.forEach(e -> System.out.print(e+" "));
	}
}
