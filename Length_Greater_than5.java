package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Length_Greater_than5 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
                "Sachin",
                "Rahul",
                "Sehwag",
                "Anil",
                "Sourav",
                "Sunil",
                "Laxman"
                );
		
		names.stream().filter(n->n.length() > 5).forEach(System.out::println);
	}
}
