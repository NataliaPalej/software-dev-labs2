package week3;
import java.util.Scanner;

public class Lab3 {
	
	public static void main(String[] args) {
	//preAndPostDifference();
	//System.out.println();
	//booleanLogicShortCircutOps();
	//System.out.println();
	//booleanBitwiseOps();
	//compareStrings();
	//admitToFilm(16, 8);
	//admitToFilm(8, 16);
	ternaryOperator();

	}
	
	public static void preAndPostDifference() {
		int x = 5;
		int y = 10;
		System.out.println("The value of x is " + x); //returns 5
		System.out.println("The value of ++x is " + ++x); //returns 6
		System.out.println("The value of x++ is " + x++); //returns 6
		System.out.println("The value of x is " + x); //returns 7 as its postincrement from previous statement
		System.out.println();
		System.out.println("The value of y is " + y); //returns 10
		System.out.println("The value of ++y is " + --y); //returns 9
		System.out.println("The value of y++ is " + y--); //returns 9
		System.out.println("The value of y is " + y); //returns 8
	}
	
	public static void booleanLogicShortCircutOps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		if (num1 < 0 && num2++ < 0){ 
			System.out.println("Output of num2: " + num2);
			}
		else if (num1 > 0 && num2++ > 0)   {
			System.out.println("Output of num2: " + num2);}
		else if (num1 == 0 || num2++ == 0) {
			System.out.println("Output of num2: " + num2);
			}
		else if (num1 < 0 || num2++ < 0) {
			System.out.println("Output of num2: " + num2);
			}		
	}
	
	public static void booleanBitwiseOps(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		
		if (num1 < 0 & num2++ < 0){ 
			System.out.println("Output of num2: " + num2);
			}
		else if (num1 > 0 & num2++ > 0)   {
			System.out.println("Output of num2: " + num2);}
		else if (num1 == 0 | num2++ == 0) {
			System.out.println("Output of num2: " + num2);
			}
		else if (num1 < 0 | num2++ < 0) {
			System.out.println("Output of num2: " + num2);
			}
	}
	
	public static void compareStrings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1: ");
		String s1 = sc.next();
		System.out.println("Enter s2: ");
		String s2 = sc.next();
		//String s1 = "Mary";
		//String s2 = "Mary";
		boolean c = (s1==s2);
		System.out.println("Using == returns " + c);
		System.out.println("Using equals() returns " + s1.equals(s2));
		
		String name1 = "Sean";
		String name2 = "Sean";
		boolean b = (name1 == name2);
		System.out.println("Using == returns " + b); //true
		
		String name3 = "John";
		String name4 = new String("John");
		boolean a = (name3 == name4);
		System.out.println("Using == returns " + a);
	}
	
	public static boolean admitToFilm(int x, int y) {
		if (x > y) {
			System.out.println("Not old enough!");;
		}
		else {
			System.out.println("You're old enough!");
		}
		return true;
	}
	
	public static void ternaryOperator(){
		boolean isHappy = true;

		String mood = isHappy ? "I am happy": "I am not happy";
		System.out.println(mood);
	
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter value x: ");
//		int x = sc.nextInt();
//		System.out.println("Enter value y: ");
//		int y = sc.nextInt();
//		int minVal;
//		
//		if (x < y) {
//			return x;
//		}
//		else {
//			return y;
//		}
		
	}
	
	public static void switchVowelOrConsonant() {
		
	}
	
	

}

