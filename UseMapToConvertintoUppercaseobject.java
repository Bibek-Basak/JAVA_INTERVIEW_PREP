package combinedProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseMapToConvertintoUppercaseobject {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("alice", "bob", "charlie");
		System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));
	}
}
