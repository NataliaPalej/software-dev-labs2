package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSetPractice {
	
	public static void main(String[] args) {
		factoryMethods();
	}
	
	public static void factoryMethods() {
		String[] myArray = {"A", "B", "C"};
		for (String x : myArray) {
			System.out.println("myArray: " + x);
		}
		
		// Create ref type List of String, assign asList to the array created above
		List<String> asList = Arrays.asList(myArray);
		System.out.println("asList: " + asList);
		
		
	}
	
	public static void listOfNames() {
		
	}
	
	public static void stacks() {
		
	}
	
	public static void linkedLists() {
		
	}
	
	public static void treesets() {
		
	}
	
	public static void hashSet() {
		
	}

}
