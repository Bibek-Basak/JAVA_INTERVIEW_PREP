package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudentsBasedOnPercentage {

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
		System.out.println(studentList);
		studentList.sort(Comparator.comparing(s1 -> s1.percentage));
		System.out.println(studentList);
		//studentList.stream().sorted((s1,s2) -> (int)s1.percentage.compareTo((int)s2.percentage)).collect(Collectors.toList());
	}
}
