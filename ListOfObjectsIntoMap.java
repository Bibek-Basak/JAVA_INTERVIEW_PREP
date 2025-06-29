package combinedProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ListOfObjectsIntoMap {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Alice", 28),  // Duplicate name
	            new Person("Charlie", 35)
	        );
		
		Map<String, Integer> sortedMap = people.stream()
        .collect(Collectors.toMap(
            Person::getName,              
            Person::getAge,               
            (age1, age2) -> age2,         
            TreeMap::new             
        ));
		
		System.out.println(sortedMap);
	}
}
