package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxAgeFromAListOfStudents {

	public static void main(String[] args) {
		
		List<Employee> students = Arrays.asList(
                new Employee(1, "Viraj", 17),
                new Employee(2, "Krishnanand", 18),
                new Employee(3, "Rishi", 16),
                new Employee(4, "Suresh", 23),
                new Employee(5, "Aditya", 21)
                );
		
		System.out.println(students.stream().max(Comparator.comparing(Employee :: getAge)).get());
		System.out.println(students.stream().min(Comparator.comparing(Employee :: getAge)).get());
	}
}
