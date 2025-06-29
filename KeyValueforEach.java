package streamAPI;

import java.util.HashMap;
import java.util.Map;

public class KeyValueforEach {

	public static void main(String[] args) {
		Map<Integer, String> rankCompany = new HashMap<>();
        rankCompany.put(1, "Google");
        rankCompany.put(2, "Microsoft");
        rankCompany.put(3, "Yahoo");
        rankCompany.put(4, "Oracle");
        rankCompany.put(5, "Facebook");
 
        rankCompany.forEach(
                (key, value) -> System.out.println("Rank : " + key + "\tCompany : " + value)
                );
	}
}
