package additionalProgramming;

import java.util.stream.IntStream;

public class PalindromeUsingJava8 {

	public static void main(String[] args) {
		String s1 = "madam";
		
		boolean isPalindrome = IntStream.range(0, s1.length() / 2)
		.allMatch(input -> s1.charAt(input) == s1.charAt(s1.length() - 1 - input));
		System.out.println(isPalindrome);
	}
}
