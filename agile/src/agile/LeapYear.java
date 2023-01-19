package agile;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year to find out if it is a leap year: ");
		
		try {
			int year = in.nextInt();
			if (validYear(year) == true){
				if (leapYear(year) == true){
					System.out.println(year + " is a leap year");
				}
				else if (leapYear(year) == false){
					System.out.println(year + " is NOT a leap year");
				}
			else {
				System.out.println("Error, invalid year");
				}
			}
		}
		catch (Exception e){
				System.out.println("Error: " + e);
			}
	}
	
	
	public static boolean leapYear(int year){
		boolean result = true;
		if (year % 4 == 0) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	public static boolean validYear(int year){
		boolean result = true;
		if (year < 0){
			result = false;
			return result;
		}
		else {
			return result;
		}
	}

}
