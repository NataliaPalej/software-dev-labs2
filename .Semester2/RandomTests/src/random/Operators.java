package random;

import java.util.Scanner;

public class Operators {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		int x = in.nextInt();
		System.out.println("Enter second number: ");
		int y = in.nextInt();
		logicalOps(x, y);
		simpleMaths(x, y);
		modulus(x, y);
		incrDecr();
	}
	
	public static void logicalOps(int x, int y) {
		if (x > 0 && y > 0) {
			System.out.println("Both " + x + " and " + y + " are positive.");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Both " + x + " and " + y + " are negative.");
		}
		else if (x ==0 || y == 0) {
			System.out.println("One of the numbers is zero ["+x+", "+y+"]");
		}
		else if (x < 0 || y < 0) {
			System.out.println("One of the numbers is negative ["+x+", "+y+"]");
		}
	}
	
	public static void simpleMaths(int x, int y) {
		int sum, difference, division;
		sum = x+y;
		difference = x-y;
		division = x/y;
		System.out.println(x + "+" + y + "=" + sum);
		System.out.println(x + "-" + y + "=" + difference);
		System.out.println(x + "/" + y + "=" + division);
	}
	
	public static boolean modulus(int x, int y) {
		boolean result = false;
		if (x % y == 0) {
			result = true;
			System.out.println(x + " modulus " + y + ": " + result);
		}
		else {
			result = false;
			System.out.println(x + " modulus " + y + ": " + result);
		}
		return result;
		
	}
	
	public static void incrDecr() {
		int x=0, w=0, y=0, z=0;
		x=4;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		
		w=20;
		x=10;
		y=-5;
		z=0;
		
		System.out.println(w == x && y != z);
		System.out.println(w == x || y != z);
		System.out.println(!(w == (x+z)));
	}

}
