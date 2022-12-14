package week2;
import java.util.Scanner;

public class Lab2 {
/**
* @param args
*/
	public static void main(String[] args) {
		/**Scanner in = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int x = in.nextInt();
		System.out.println("Enter second value: ");
		int y = in.nextInt();**/
				
		logicalOps(8, 9);
		logicalOps(-8, -9);
		logicalOps(0, 1);
		logicalOps(1, -9);
		System.out.println();
		simpleMaths(2, 3);
		System.out.println();
		System.out.println(modulus(12, 4));
		System.out.println(modulus(11, 3));
		System.out.println();
		incrDecr();
		
	}
	public static void logicalOps(int x, int y) {
		if (x > 0 && y > 0) {
			System.out.println("Both numbers are positive (" + x + ", " + y + ").");
			}
		else if (x < 0 && y < 0) {
			System.out.println("Both numbers are negative (" + x + ", " + y + ").");
			}
		else if (x == 0 || y == 0) {
			System.out.println("One of the numbers is 0 (" + x + ", " + y + ").");
			}
		else if (x < 0 || y < 0) {
			System.out.println("One of the numbers is negative (" + x + ", " + y + ").");
			}
		}
	
	public static void simpleMaths(int x, int y){
		int sum = x + y;
		int multi = x*y;
		int sub = x-y;
		int division = x/y;
		System.out.println("The sum of " + x + " and "+ y + " is " + sum+"\nThe multiplication of " + x + " and "+ y + " is " + multi +"\nThe difference of " + x + " and " + y + " is " + sub + "\nThe division of " + x + " and " + y + " is " + division);
		}
	
	public static boolean modulus(int x, int y){
		if (x % y == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void incrDecr(){
		int x=0, w=0, y=0, z=0; 
		x=4;
		System.out.println(++x); //pre-increment returns incremented value of x
		System.out.println(x++); //post-increment returns value of x and then increments it
		System.out.println(x);	//incremented value of x after post-increment
		System.out.println(--x); //returns 5 as it pre-decrements the value
		System.out.println(x--); //returns 5 as it decrements value after the statement is executed
		System.out.println(x); //returns 4 to reflect decrement from previous statement

		w=20;
		x=10;
		y=-5;
		z=0;
		System.out.println( w == x && y != z  ); 	//1st condition false to returns false
		System.out.println( w == x || y != z  ); 	//returns true as 2nd condition is true
		System.out.println( ! ( w == (x + z) )  );	//returns true as 20 != 10
	}

}
