package additionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class SeparateoddAndEvenFromList {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(34, 57, 132, 23, 46, 67);
		List<Integer> even = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = list1.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		
		System.out.println("Even Numbers are : "+even);
		System.out.println("Odd Numbers are : "+odd);
	}
}
