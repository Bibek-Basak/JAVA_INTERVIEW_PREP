package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatchMultiplePredicates {

	public static void main(String[] args) {
		List<Employee> students = Arrays.asList(
                new Employee(1, "Viraj", 17),
                new Employee(2, "Krishnanand", 18),
                new Employee(3, "Rishi", 16),
                new Employee(4, "Suresh", 23),
                new Employee(5, "Aditya", 21)
                );
		
		Stream<Employee> filtered = students.stream().filter(stud -> stud.getName().startsWith("K"));
		Stream<Employee> filter = students.stream().filter(stud -> stud.getAge()>22);
		
		boolean boolP4 = students.stream().anyMatch(
                stud -> (stud.getName().startsWith("V") && stud.getAge() < 18));
		System.out.println(boolP4);
	}
}
