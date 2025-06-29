package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapMethod {

	public static void main(String[] args) {
		List<String> firstList = Arrays.asList("Stephen", "Nathan", "Williams");
        List<String> secondList = Arrays.asList("Bob", "John", "Alice");
        List<String> thirdList = Arrays.asList("Ramesh", "Suresh", "Naresh", "Rajesh");
        
        List<List<String>> namesList = Arrays.asList(
                firstList, 
                secondList, 
                thirdList
                );
        System.out.println(namesList.stream().flatMap(list -> list.stream()).collect(Collectors.toList()));
	}
}
