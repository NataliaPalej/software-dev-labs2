package week9.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CodePractice {

	public static void main(String[] args) {
		// Q1
		//exceptions1();
		// Q2
		//set();
		// Q3
		//map();
		// Q4
		listOfFruits();
	}
	
	public static void set() {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		System.out.println(set);
		set.add("F");
		set.remove("C");
		System.out.println(set);
		System.out.println("Contains \"E\": " + set.contains("E"));
		set.removeAll(set);
		System.out.println("Is empty: " + set.isEmpty());
	}
	
	public static void map() {
		// TreeMap or LinkedHashMap sorts automatically
		Map<String, Integer> map = new TreeMap<>();
		map.put("Ford", 2019);
		map.put("Audi", 2015);
		map.put("Polo", 2023);
		map.put("Beetle", 2012);
		System.out.println(map);
		System.out.println("Contains \"Ford\": " + map.containsKey("Ford"));
		System.out.println("Contains \"2023\": " + map.containsValue(2023));
		map.remove("Polo");
		System.out.println(map);
	}
	
	public static void exceptions1() {
		try {
			exceptions2();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
	}
	
	public static void exceptions2() throws IOException {
		throw new IOException();
	}
	
	public static void listOfFruits() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Elderberry");
		list.add("Fig");
		list.add("Damson");
		System.out.println(list);
		// Instead of hard coding the index, use collections API to sort the list
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Size: " + list.size());
		System.out.println("Contains \"Pear\": " + list.contains("Pear"));
		list.remove("Elderberry");
		System.out.println(list);
		System.out.println("Is empty: " + list.isEmpty());
		// Replace index of "Fig" with Cherry
		list.set(list.indexOf("Fig"), "Cherry");
		System.out.println(list);
		
		
	}

}
