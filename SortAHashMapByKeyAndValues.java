package java8Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortAHashMapByKeyAndValues {

	public static void main(String[] args) {
		
		String s = "baannana";
		
		Map<Character, Long> count = s.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<Character, Long> collect = count.entrySet().stream()
			    .sorted(Map.Entry.comparingByValue()) // Sort alphabetically: 'a', 'b', 'n'
			    .collect(Collectors.toMap(
			        Map.Entry::getKey,
			        Map.Entry::getValue,
			        (e1, e2) -> e1, 
			        LinkedHashMap::new
			    ));
		System.out.println(collect);
	}
}
