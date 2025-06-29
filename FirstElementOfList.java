package combinedProgramming;

import java.util.List;

public class FirstElementOfList {

	public static void main(String[] args) {
		List<String> names = List.of("Aman","Nitin","Rajesh");
		String firstElement = names.stream().findFirst().get();
		System.out.println(firstElement);
	}
}
