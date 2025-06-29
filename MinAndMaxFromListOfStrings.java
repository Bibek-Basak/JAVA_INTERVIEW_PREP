package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxFromListOfStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
                "Putin",
                "Biden",
                "Modi",
                "Ali",
                "Jack"
                );
		System.out.println(names.stream().max(Comparator.comparing(String::valueOf)).get());
		System.out.println(names.stream().min(Comparator.comparing(String::valueOf)).get());
	}
}
