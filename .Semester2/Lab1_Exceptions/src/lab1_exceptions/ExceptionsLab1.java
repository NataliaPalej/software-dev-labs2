package lab1_exceptions;

import java.io.IOException;

public class ExceptionsLab1 {

	public static void main(String[] args) throws Exception {
		
		String a = testMethodA();
		System.out.println(a);
		
		System.out.println();
		
		String b = testMethodB();
		System.out.println(b);
		
		System.out.println();
		
		String c = testMethodC();
		System.out.println(c);
		
		System.out.println();
		
		String d = testMethodD();
		System.out.println(d);
		
		System.out.println();
		
		String e = testMethodE();
		System.out.println(e);
		
		System.out.println();
		
		testMethodF();

	}


public static String testMethodA(){
	try{
		return "Method A";
	}
	catch (Exception e){
		return "Catch Exception: " + e;
	}
	finally{
		return "OK from finally";
	}
}

public static String testMethodB(){
	try{
		return "Method B";
	}
	catch (Exception e){
		return "Exception: " + e;
	}
	finally{
		 System.out.println("Finally section");
	}
}

public static String testMethodC(){
	try{
		return "Method C";
	}
	catch (Exception e){
		return "Exception: " + e;
	}
	finally {
		return "Finally";
	}
}


public static String testMethodD(){
	try{
		return "Method D";
	}
	/**
	catch (IOException e){
		e.printStackTrace();
	}
	catch (NoSuchMethodException e){
		e.printStackTrace();
	}
	catch (ClassNotFoundException e){
		e.printStackTrace();
	}
	**/
	catch (Exception e){
		return "Exception: " + e;
	}
	finally{
		return "Finally";
	}
}

public static String testMethodE(){
	try{
		System.out.println("Method E");
		String[] name = {"John", "Peter"};
		return name[55];
		//System.out.println("OK");
	}
	catch (Exception e){
		return "Exception: " + e;
	}
	finally{
		System.out.println("Ok from finally");
	}
	
}

public static void testMethodF() throws Exception{
	try{
		System.out.println("Method F");
	}
	catch (Exception e){
		System.out.println("Exception");
	}
	finally{
		System.out.println("Finally");
	}
}
}