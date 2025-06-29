package streamAPI;

import java.util.Arrays;
import java.util.List;

public class SpecificElementNotPresent {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays
                .asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(numbers.stream().noneMatch(n -> n > 10));
		System.out.println(numbers.stream().noneMatch(n -> n > 7));
		
		List<String> sectors = Arrays.asList(
                "Motor", 
                "Power", 
                "Steel", 
                "Chemicals", 
                "Capital"
                );
	
		System.out.println(sectors.stream().noneMatch(str -> str.contains("Titan")));
		System.out.println(sectors.stream().noneMatch(str -> str.contains("Power")));
	}
}
