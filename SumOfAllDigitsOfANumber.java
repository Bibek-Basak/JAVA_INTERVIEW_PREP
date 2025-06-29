package additionalProgramming;

public class SumOfAllDigitsOfANumber {

	public static void main(String[] args) {
		int q1 = 6745;
		int sum = 0;
		int rem = 0;
		while(q1 > 0) {
			rem = q1 % 10;
			sum = sum + rem;
			q1 = q1 / 10;
		}
		System.out.println(sum);
		
		int q2 = 8193;
		int add = String.valueOf(q2).chars().map(c -> c - '0').sum();
		System.out.println(add);
	}
}
