package combinedProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'b', 'e', 'f');
		Set<Character> seen = new HashSet<>();

        Optional<Character> firstRepeated = chars.stream()
            .filter(c -> !seen.add(c))
            .findFirst();
        System.out.println(firstRepeated);
	}
}
