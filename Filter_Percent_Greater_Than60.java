package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Percent_Greater_Than60 {

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
		
		studentList.stream().map(s -> s.getPercentage()).filter(s -> s > 60).collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
