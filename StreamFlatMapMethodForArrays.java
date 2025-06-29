package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapMethodForArrays {

	public static void main(String[] args) {
		String[][] namesArray = new String[][] {
            {"Stephen", "Nathan", "Williams"}, 
            {"Bob", "John", "Alice"}, 
            {"Ramesh", "Suresh", "Naresh", "Rajesh"}
        };
 
        System.out.println("1. Before flatMap and flattening :- \n");
 
        for(int index=0; index < namesArray.length; index++) {
            System.out.println(Arrays.toString(namesArray[index]));
        }
 
 
 
        // merge Arrays of Arrays of String into single List
        List<String> resultingList = Arrays.stream(namesArray) // 1. get stream
                .flatMap(str -> Arrays.stream(str)) // 2. intermediate operation
                .collect(Collectors.toList()); // 3. terminal operation
 
        System.out.println("\n\n2. Merging Arrays of Arrays into single List :- \n\n"
                + resultingList);
 
 
 
        System.out.println("\n\n3. Iterating 2-d Array using Java 8 forEach :- \n");
 
        // print to console using Java 8 forEach elegantly
        Stream.of(namesArray) // 1. get stream
        .flatMap(Stream::of) // 2. intermediate operation
        .forEach(name -> System.out.println(name)); 
	}
}
