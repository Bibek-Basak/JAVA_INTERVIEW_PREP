package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindSpecificElementPresentOrNot {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays
                .asList(1,2,3,4,5,6,7,8,9,10);
		
		boolean present = numbers.stream().anyMatch(n -> n > 9);
		System.out.println(present);
		
		List<String> sectors = Arrays.asList(
                "Motor", 
                "Power", 
                "Steel", 
                "Chemicals", 
                "Capital"
                );
		boolean isPresent = sectors.stream().anyMatch(str -> str.equalsIgnoreCase("Delhi"));
		System.out.println(isPresent);
	}
}
