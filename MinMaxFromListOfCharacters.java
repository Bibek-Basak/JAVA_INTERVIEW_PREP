package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxFromListOfCharacters {

	public static void main(String[] args) {
		List<Character> chars = Arrays.asList(
                'a', 'b', 'c', 
                'd', 'e', 'f', 
                'g', 'h', 'i'
                );
		
		System.out.println(chars.stream().max(Comparator.comparing(Character::charValue)).get());
		System.out.println(chars.stream().min(Comparator.comparing(Character::charValue)).get());
	}
}
