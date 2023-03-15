package week8;

import java.util.Map;
import java.util.TreeMap;

public class UsingMaps {
	
	public static void main(String[] args) {
		
		//demoTreeMapFunctions();
        
	}
	
	public static void demoTreeMapFunctions() {

	//Declare a Map reference implemented by HashMap. 
			//The map should be generically typed for keys of type String and values of type Integer. 
		    // Tree map sort the map based on the Key values
			Map<String, Integer> map = new TreeMap<>();
			// Insert into the map
			map.put("John", 18);
			map.put("Mary", 21);
			map.put("Chris", 33);
			map.put("Amy", 30);
			// Output the map
			System.out.println(map);
			//Check if the key exists
//			System.out.println("John: " +map.containsKey("John"));
//			System.out.println("Mary: " +map.containsKey("Mary"));
//			System.out.println("Chris: " +map.containsKey("Chris"));
//			System.out.println("Mike: " +map.containsKey("Mike"));
			//TODO
			//Add in check for Amy
			
			
			//Check if the value exists
//			System.out.println("18: "+map.containsValue(18));
//			System.out.println("21: "+map.containsValue(21));
//			System.out.println("33: "+map.containsValue(33));
//			System.out.println("12: "+map.containsValue(12));
			
			//TODO
			//Add in check for 30
			
			// Enhanced for loop to print the keys
//			System.out.println("The keys are ====================");
//			for(String name:map.keySet()) {
//				System.out.println(name);
//			}
			
			// Enhanced for loop to print the values
//			System.out.println("The values are ====================");
//			for(Integer value:map.values()) {
//				System.out.println(value);
//			}
			
			
			// Output the map size
//			System.out.println("The map size is ====================");
//			System.out.println(map.size());
			
			// Remove a map using the key
//	        map.remove("John");
	        
	        
			// Replace a value for a particular key
//	        map.replace("Mary", 22);
	        
	        //TODO
	        // Output the key
	        // Output the values
	        // Output the map
	}
}
