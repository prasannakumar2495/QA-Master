package lists;

import java.util.HashMap;

public class PracticeHashMap {
	
	private static void method1() {
		HashMap<String, String> pk = new HashMap<>();
		pk.put("prasanna", "first name");
		pk.put("kumar","last name");
		pk.put("anisetti", "surname");
		pk.putIfAbsent("prasanna", "first name");
		for (String i : pk.keySet()) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		method1();
	}
}
