package week10.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CodePractice {

	public static void main(String[] args) {
		// Q1
		//try {
		//	ex1();
		//} catch (IOException e) {
		//	System.out.println("Error: " + e);
		//}
		
		// Q2
		//generics();
		
		// Q3
		//map();
		
		// Q4
		//listOfAnimals();
		
		// Q5
		//set();
	}
	
	public static void generics() {
		SomeGenericClass<String> genS = new SomeGenericClass<String>();
		SomeGenericClass<Integer> genI = new SomeGenericClass<Integer>();
		
		genS.add("Holiday");
		System.out.println(genS.get());
		System.out.println();
		genI.add(12);
		System.out.println(genI.get());
		
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
		map.replace("Audi", 2016);
		System.out.println(map);
		
		System.out.println();
		System.out.println("Output keys:");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println();
		System.out.println("Output values: ");
		for (int value : map.values()) {
			System.out.println(value);
		}
	}
	
	public static void listOfAnimals() {
		List<String> list = new ArrayList<>();
		list.add("Ape");
		list.add("Bee");
		list.add("Cat");
		list.add("Dog");
		list.add("Elephant");
		list.add("Fox");
		
		System.out.println(list);
		System.out.println("Size: " + list.size());
		System.out.println("Contains \"Panda\": " + list.contains("Panda"));
		list.remove("Elephant");
		System.out.println(list);
		System.out.println("Is empty: " + list.isEmpty());
		list.set(list.indexOf("Fox"), "Cat");
		System.out.println(list);
	}
	
	public static void ex1() throws IOException {
		throw new IOException();
	}
	
	public static void set() {
		Set<String> set = new TreeSet();
		set.add("10");
		set.add("20");
		set.add("30");
		set.add("40");
		
		System.out.println(set);
		set.add("60");
		System.out.println(set);
		set.remove("30");
		System.out.println(set);
		System.out.println("Contains \"50\": " + set.contains("50"));
		set.removeAll(set);
		System.out.println("Is empty: " + set.isEmpty());
	}
}
