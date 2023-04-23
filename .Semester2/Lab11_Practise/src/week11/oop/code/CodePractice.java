package week11.oop.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CodePractice {

	public static void main(String[] args) {
		
		// Q1
		//try { 
		//	exceptions1();
		//} catch (IOException e) {
		//	System.out.println("ERROR!");
		//	e.printStackTrace();
		//}
		
		// Q2
		//map();
		
		// Q3
		//listOfAnimals();
		
		// Q4
		set();
	}
	
	public static void exceptions1() throws IOException {
		exceptions2();
	}
	
	public static void exceptions2() throws IOException {
		throw new IOException();
	}
	
	public static void map() {
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
		System.out.println(map+"\n");
		
		// Get keys
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		
		// Empty line
		System.out.println();
		
		// Get values
		for (int value : map.values()) {
			System.out.println(value);
		}
	}
	
	public static void listOfAnimals() {
		List <String> list = new ArrayList<>();
		list.add("Ape");
		list.add("Bee");
		list.add("Cat");
		list.add("Elephant");
		list.add("Fox");
		list.add("Dog");
		
		// Sort the list alphabetically using collections
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Size of the list: " + list.size());
		System.out.println("Contains \"Panda\": " + list.contains("Panda"));
		list.remove("Elephant");
		System.out.println(list);
		System.out.println("List empty: " + list.isEmpty());
		// Replace Fox with Cat 
		list.set(list.indexOf("Fox"), "Cat");
		System.out.println(list);
	}
	
	public static void set() {
		
	}
	
	public static void generics() {
		
	}

}
