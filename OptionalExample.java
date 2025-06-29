package combinedProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList(
	            "apple", "banana", "apple", "orange", "banana", "apple"
	        );
		Optional.ofNullable(words).stream().forEach(ans -> System.out.print(ans+" "));
	}
}
