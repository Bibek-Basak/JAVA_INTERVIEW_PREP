package streamAPI;

import java.util.Arrays;
import java.util.List;

public class UpperCaseDistinctElements {

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
		
		sectors.stream().distinct().map(s -> s.toUpperCase()).forEach(System.out::println);
	}
}
