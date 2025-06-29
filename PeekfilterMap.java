package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekfilterMap {

	//peek() performs the given action on each elements.
	//It does not modifies the stream elements rather returns a new stream with the same elements
	public static void main(String[] args) {
		 
        List<String> numbers = 
                Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
 
        numbers.stream().forEach(System.out::println);
    }
}
