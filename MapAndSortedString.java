package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapAndSortedString {

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
		
		names.stream().map(s -> s.toUpperCase()).sorted().forEach(System.out::println);
	}
}
