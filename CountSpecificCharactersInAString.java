package streamAPI;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountSpecificCharactersInAString {

	public static void main(String[] args) {
		String str = "zzzAzzNzzzIzzY";
        char find = 'z';
        
        System.out.println(str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}
}
