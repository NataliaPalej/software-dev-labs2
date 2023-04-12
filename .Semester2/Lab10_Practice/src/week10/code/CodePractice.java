package week10.code;

import java.io.IOException;

public class CodePractice {

	public static void main(String[] args) {
		// Q1
		//try {
		//	ex1();
		//} catch (IOException e) {
		//	System.out.println("Error: " + e);
		//}
		
		// Q2
		generics();
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
		
	}
	
	public static void listOfAnimals() {
		
	}
	
	public static void ex1() throws IOException {
		throw new IOException();
	}
	
	public static void set() {
		
	}

}
