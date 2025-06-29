package combinedProgramming;

public class Person {

	String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
