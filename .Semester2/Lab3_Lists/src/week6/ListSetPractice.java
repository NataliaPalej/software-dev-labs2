package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ListSetPractice {
	
	public static void main(String[] args) {
		//factoryMethods();
		//listOfNames();
		stacks();
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
		Stack<String> myStack = new Stack<>();
		myStack.push("Andrea");
		myStack.push("Barbara");
		myStack.push("Caroline");
		System.out.println(myStack);
		// peek() returns the top element of the stack without removing it from the stack
		System.out.println("myStack peek: " + myStack.peek());
		// pop() removes the top element from the stack
		System.out.println("myStack pop: " + myStack.pop());
		System.out.println(myStack);
		
		try {
			//myStack.push(14);
		} catch (Exception e) {
			System.out.println("Error: cannot add int arguments to the stack of type String");
		}
	}
	
	public static void linkedLists() {
		
	}
	
	public static void treesets() {
		
	}
	
	public static void hashSet() {
		
	}

}
