package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatchMethodForString {
	 
    public static void main(String[] args) {
 
        List<String> sectors = Arrays.asList(
                "Motor", 
                "Power", 
                "Steel", 
                "Chemicals", 
                "Capital"
                );
 
        System.out.println("Original list of Strings : " + sectors);
 
        boolean isStrLengthGreaterThan4 = sectors
                .stream()
                .allMatch(str -> str.length() > 4);
 
        System.out.println("\n1. All String - length greater than 4 ? "
                + isStrLengthGreaterThan4);
 
        boolean isFirstCharInUpperCase = sectors
                .stream()
                .allMatch(str -> Character.isUpperCase(str.charAt(0)));
 
        System.out.println("\n2. All String - 1st character is in upperCase ? "
                + isFirstCharInUpperCase);
 
        boolean isLastCharInLowerCase = sectors
                .stream()
                .allMatch(str -> Character.isLowerCase(str.charAt(str.length()-1)));
 
        System.out.println("\n3. All String - last character is in lowerCase ? "
                + isLastCharInLowerCase);
 
        boolean isContainDigits = sectors
                .stream()
                .allMatch(str -> str.matches("\\d+"));
 
        System.out.println("\n4. All String contains digits ? "
                + isContainDigits);
 
        boolean isMatchesCharacter = sectors
                .stream()
                .allMatch(str -> str.matches("[A-Za-z]+"));
 
        System.out.println("\n5. All String - matches only characters ? "
                + isMatchesCharacter);
    }
}
