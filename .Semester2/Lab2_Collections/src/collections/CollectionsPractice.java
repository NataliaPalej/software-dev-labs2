package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {
	
	public static void main(String[] args) {
		/**
		try {
			listOfNames();
		} catch (IOException e) {
			e.printStackTrace();
		}
		**/
		listOfFruits();
	}
	
	public static void nonGenericList() {
		
	}
	
	public static void listOfNames() throws IOException {
		List<String> myList = new ArrayList<>();
		myList.add("Amy");
		myList.add("Betty");
		myList.add("Doris");
		myList.add("Enda");
		myList.add("Fenna");
		myList.add("Conor");
		// Sort the list in order
		Collections.sort(myList);
		System.out.println("List items: " + myList);
		System.out.println("List size: " + myList.size());
		// Using the API, output whether the list contains “Mary”. This should output false. 
		System.out.println("Doest the list contain Mary? " + myList.contains("Mary"));
		// Using the API, delete “Betty” from the list
		myList.remove("Betty");
		System.out.println(myList);
		// Using the API, output if the list is empty or not. This should output false. 
		System.out.println("Is the list empty? " + myList.isEmpty());
		myList.set(4, "Doris");
		System.out.println(myList);
	}
	
	public static void listOfFruits() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Elderberry");
		list.add("Fig");
		//Using the API i.e. do not hardcode the index, insert “Damson” in its correct position alphabetically
		list.add("Damson");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("List size: " + list.size());
		System.out.println("Contains Pear? " + list.contains("Pear"));
		list.remove("Elderberry");
		System.out.println(list);
		System.out.println("Is empty? " + list.isEmpty());
		list.set(4, "Cherry");
		System.out.println(list);
		
		
	}

}