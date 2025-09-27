package java8Hashmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterMapByValue {

	public static void main(String[] args) {
		String s = "baannana";
		
		Map<Character, Long> count = s.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(count);
		
		Map<Character, Long> collect = count.entrySet().stream().filter(e -> e.getValue() > 2)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(collect);
	}
}
