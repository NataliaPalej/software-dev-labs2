package week8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsPractice {
	
	public static void main(String[] args) {
		//mapTreeMap();
		mapHashMap();
	}
	
	public static void mapTreeMap() {
		// TreeMap sorts the key:values
		Map<String, Integer> map = new TreeMap<>();
		map.put("Ford", 2019);
		map.put("Audi", 2015);
		map.put("Polo", 2023);
		map.put("Beetle", 2012);
		System.out.println(map);
		System.out.println("containsKey \"Ford\": " + map.containsKey("Ford"));
		System.out.println("containsValue \"2023\": " + map.containsValue(2023));
		map.remove("Polo");
		System.out.println(map);
		map.replace("Audi", 2016);
		System.out.println(map);
		
		int count = 0;
		int keySize = map.keySet().size();
		for(String key : map.keySet()) {
			System.out.print(key);
			if (count < keySize - 1) {
				System.out.print(", ");
			}
			count++;
		}
		
		System.out.println();
		count=0;
		int valSize = map.values().size();
		for(int value : map.values()) {
			System.out.print(value);
			if (count < valSize - 1) {
				System.out.print(", ");
			}
			count++;
		}
	}
	
	public static void mapHashMap() {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Ford", 2019);
		hashMap.put("Audi", 2015);
		hashMap.put("Polo", 2023);
		hashMap.put("Beetle", 2012);
		System.out.println(hashMap);
		System.out.println("containsKey: " + hashMap.containsKey("Ford"));
		System.out.println("containsValue: " + hashMap.containsValue(2023));
		hashMap.remove("Polo");
		System.out.println(hashMap);
		hashMap.replace("Audi", 2016);
		System.out.println(hashMap);
	}
	
	public static void exceptions1() {
		
	}
	
	public static void exceptions2() {
		
	}
	
	public static void listOfFruits() {
		
	}

}
