package streamAPI;

import java.util.Arrays;
import java.util.List;

public class DistinctFilterSortMap {

	public static void main(String[] args) {
		
		List<String> sectors = Arrays.asList(
                "Motor", 
                "Power",
                "Steel", 
                "Chemicals",
                "Chemicals",
                "Power",
                "Steel",
                "Capital",
                "TCS",
                "Motor", 
                "Power",
                "Communications"
                );
		
		sectors.stream().distinct().filter(s -> s.startsWith("C")).sorted().map(String :: toUpperCase).forEach(System.out::println);
	}
}
