package week10.code;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

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
		map();
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
		
	}
	
	public static void ex1() throws IOException {
		throw new IOException();
	}
	
	public static void set() {
		
	}

}
