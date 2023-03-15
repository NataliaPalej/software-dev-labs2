package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSetPractice {
	
	public static void main(String[] args) {
		//factoryMethods();
		listOfNames();
		
	}
	
	
	public static void factoryMethods() {
		String[] myArray = {"A", "B", "C"};
		for (String x : myArray) {
			System.out.println("myArray: " + x);
		}
		
		// Create ref type List of String, assign asList to the array created above
		List<String> asList = Arrays.asList(myArray);
		System.out.println("asList: " + asList);
		
		
		try {
			asList.add("D");
			System.out.println("asList with D: " + asList);
		} catch (Exception e) {
			System.out.println("Can't add to list, error: " + e);
		}
		
		System.out.println("listOf asList: " + List.of(asList));
		System.out.println("listOf myArray: " + List.of(myArray));
		System.out.println("listCopyOf asList: " + List.copyOf(asList));
	}
	
	public static void listOfNames() {
		List<String> myList = new ArrayList<>();
		myList.add("Amy");
		myList.add("Betty");
		myList.add("Doris");
		myList.add("Enda");
		myList.add("Feena");
		//System.out.println(myList);
		myList.add("Connor");
		//System.out.println(myList);
		Collections.sort(myList);
		//System.out.println(myList);
		//System.out.println("myList size: " + myList.size());
		//System.out.println("myList.contains Mary" + myList.contains("Mary"));
		myList.remove("Betty");
		//System.out.println(myList);
		//System.out.println("isEmpty: " + myList.isEmpty());
		myList.set(4, "Doris");
		System.out.println(myList);	
		
		//for (String i : myList) {
		//	i = i + " Bloggs";
		//	System.out.println(i);
		//}
		
		// Using the API, add a surname “Bloggs” to each Name
		myList.replaceAll(i -> i + " Bloggs");
		System.out.println(myList);
		System.out.println("Position 3: " + myList.get(2));
		myList.set(4, "Andrea");
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
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
