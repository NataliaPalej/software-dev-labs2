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
		logicalOps(0, 0);
		logicalOps(1, -9);
		System.out.println();
		simpleMaths(2, 3);
		}
	public static void logicalOps(int x, int y) {
		if (x > 0 && y > 0) {
			System.out.println("Both numbers are positive.");
			}
		else if (x < 0 && y < 0) {
			System.out.println("Both numbers are negative.");
			}
		else if (x == 0 || y == 00) {
			System.out.println("One of the numbers is 0");
			}
		else if (x < 0 || y < 0) {
			System.out.println("One of the numbers is negative.");
			}
		}
	
	public static void simpleMaths(int x, int y){
		int sum = x + y;
		int multi = x*y;
		int sub = x-y;
		int division = x/y;
		System.out.println("The sum of " + x + " and "+ y + " is " + sum+"\nThe multiplication of: " + x + " and "+ y + " is " + multi +"\nThe difference of " + x + " and " + y + " is " + sub + "\nThe division of " + x + " and " + y + " is " + division);
		}
	
	//public 

}
