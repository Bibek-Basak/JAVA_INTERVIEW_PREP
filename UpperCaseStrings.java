package streamAPI;

import java.util.Arrays;
import java.util.List;

public class UpperCaseStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
                "Sachin",
                "Rahul",
                "Sehwag",
                "Anil",
                "Sourav",
                "Sunil",
                "Laxman"
                );
		names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
	}
}
