package combinedProgramming;

import java.util.List;

public class CountTotalElements {
	public static void main(String[] args) {

		List<String> names = List.of("Aman","Nitin","Rajesh");
		long count = names.stream().count();
		System.out.println(count);
	}
}
