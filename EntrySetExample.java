package streamAPI;

import java.util.Map;
import java.util.TreeMap;

public class EntrySetExample {

	public static void main(String[] args) {
		Map<String, String> ceoCompany = new TreeMap<>();
 
        ceoCompany.put("Sundar Pichai", "Google");
        ceoCompany.put("Satya Nadella", "Microsoft");
        ceoCompany.put("Marissa Mayer", "Yahoo");
        ceoCompany.put("Jeff Bezos", "Amazon");
        ceoCompany.put("Mark Zuckerberg", "Facebook");
 
        ceoCompany.entrySet().forEach(System.out::println);
	}
}
