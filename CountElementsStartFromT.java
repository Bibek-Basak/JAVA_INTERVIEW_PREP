package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class CountElementsStartFromT {

	public static void main(String[] args) {
		List<String> companies = new ArrayList<>();
        companies.add("Tata Motor");
        companies.add("Tata Power");
        companies.add("Tata Steel");
        companies.add("Tata Chemicals");
        companies.add("Tata Capital");
        companies.add("Tata Sky");
        companies.add("Titan");
        companies.add("Birla");
        companies.add("Adani");
        companies.add("Reliance");
        companies.add("Mittal");
        
        long count = companies.stream().filter(word -> word.startsWith("T")).count();
        System.out.println(count);
	}
}
