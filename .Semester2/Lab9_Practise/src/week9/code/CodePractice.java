package week9.code;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
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
		map();
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
		
	}

}
