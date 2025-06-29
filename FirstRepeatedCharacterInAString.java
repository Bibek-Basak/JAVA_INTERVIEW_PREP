package additionalProgramming;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FirstRepeatedCharacterInAString {

	public static void main(String[] args) {
		String s1 = "animal";
		
		Set<Character> seen = new HashSet<>();
		Optional<Character> duplicate = s1.chars().mapToObj(c -> (char)c)
		.filter(name -> !seen.add(name)).findFirst();
		
		if(duplicate.isPresent()) {
			System.out.println(duplicate.get());
		}
		else {
			System.out.println("false");
		}
	}
}
