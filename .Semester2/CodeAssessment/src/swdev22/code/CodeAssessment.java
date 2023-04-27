// Name: Natalia Palej
// Student ID: A00279259
// Course: Software Design with AI for Cloud Computing

package swdev22.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CodeAssessment {

	public static void main(String[] args) {
		System.out.println("Question 1: Exceptions");
		except1();
		
		System.out.println();
		System.out.println("Question 2: Collections - List");
		list();
		
		System.out.println();
		System.out.println("Question 3: Collections - Map");
		map();
	}
	
	public static void except1() {
		try {
			except2();
		} catch (IOException e) {
			System.out.println("IOException thrown from except2()");
		}
	}

	public static void except2() throws IOException {
		throw new IOException("IOException");
	}
	
	public static void list() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("C");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("List size: " + list.size());
		System.out.println("Contains \"Z\": " + list.contains("Z"));
		list.remove("B");
		System.out.println(list);
		System.out.println("Is empty: " + list.isEmpty());
		list.set(list.indexOf("E"), "C");
		System.out.println(list);
	}
	
	public static void map() {
		Map<String, Integer> map = new TreeMap<>();
		map.put("John", 24);
		map.put("Ann", 21);
		map.put("Paul", 35);
		map.put("Barbara", 20);
		
		System.out.println(map);
		System.out.println("Contains key \"John\": " + map.containsKey("John"));
		System.out.println("Contains value \"35\": " + map.containsValue(35));
		map.remove("Paul");
		map.replace("Ann", 22);
		System.out.println(map);
		
		// Print empty line
		System.out.println();
		System.out.println("Keys: ");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		// Print empty line
		System.out.println();
		System.out.println("Values:");
		for (int value : map.values()) {
			System.out.println(value);
		}
	}
}
