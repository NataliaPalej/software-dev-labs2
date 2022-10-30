package exercises;

import java.util.Scanner;

public class ForExercises {

	public static void main(String[] args) {
		//calling forAverage method
		//forAverage();
		//System.out.println();
		forSequence();
		
	}
	
	
	public static void forAverage() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = in.nextInt();
		int sum = 0;
		double avr = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter number: ");
			int n = in.nextInt();
			sum = n + sum;
		}
		
		avr = (sum/num);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avr);
	}
	
	public static void forSequence() {
		int num = 0;
		String result = "";
		
		for (int i = 1; i <= 10; i++) {
			if (i < 10) {
				num = (int) Math.pow(i, 2);
				result += num + ", ";
			}
			if (i == 10) {
				num = (int) Math.pow(i, 2);
				result = result + num;
			}			
			//System.out.print(num + ", ");
		}
		System.out.println(result);
		
	}
	
	public static void forHeaderTesting() {
		
	}
	
	public static void forSmallestLargest() {
		
	}
	
	public static void forHistogram() {
		
	}
	
	public static void forSumEvenNumbers() {
		
	}
	
	public static void twelveDaysOfChristmas() {
		
	}

}
