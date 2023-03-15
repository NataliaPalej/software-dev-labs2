package week7;

import java.io.IOException;

public class ExceptionsPractice {

	public static void main(String[] args) {
		
		try {
			a();
		} catch (IOException e) {
			System.out.println("a() exception cought: " + e);
		}
		
		b1();
		
		try {
			c1();
		} catch (IOException e) {
			System.out.println("c1() exception cought: " + e);
		}
		
		// Q5
		//d1();
		try {
			testMethodD("OK");
		} catch (ClassNotFoundException | NoSuchMethodException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("testMethodD exception cought: " + e);
		}
		
		// Q6
		try {
			Y1();
		}
		catch (Exception e) {
			System.out.println("Y1(): " + e);
		}
		
	}
	
	public static void a() throws IOException {
		throw new IOException();
	}
	
	public static void b1() {
		try {
			b2();
		} catch (IOException e) {
			System.out.println("b1() exception cought: " + e);
		}
	}
	
	public static void b2() throws IOException{
		System.out.println("b2()");
		}
	
	public static void c1() throws IOException {
		c2();
	}
	
	public static void c2() throws IOException {
		System.out.println("c2()");
	}
	
	public static void d1() {
		//d2();
	}
	
	// Exception is snot caught in any method in the application
	public static void d2() throws ClassNotFoundException{
		System.out.println("d2()");
	}
	
	public static void testMethodD(String x) throws ClassNotFoundException, NoSuchMethodException, IOException {
		try {
			System.out.println("testMethod D: " + x);
		}
		catch (Exception e) {
			System.out.println("Runtime Exception: " + e);
		}
	}
	
	public static void Y1() {
		Y2();
	}
	public static void Y2() {
		Y3();	
	}
	public static void Y3() {
		Y4();
	}
	public static void Y4() {
		throw new RuntimeException();
	}
}
