package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Departments_From_Students {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
                new Student("Vanita", 62, "Arts"),
                new Student("Rajesh", 55, "Commerce"),
                new Student("Naresh", 73, "Science"),
                new Student("Shiva", 64, "Arts"),
                new Student("Dinesh", 72, "Science"),
                new Student("Suresh", 50, "Commerce"),
                new Student("Radhika", 61, "Science")
                );
		
		studentList.stream().map(s -> s.getDepartment()).distinct().collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
