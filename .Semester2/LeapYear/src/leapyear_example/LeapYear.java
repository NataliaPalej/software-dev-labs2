package leapyear_example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Natalia
 * A year with 366 days is called a leap year. A year is a leap year if 
 * it is divisible by 4 (e.g. 1980). However, since the introduction of 
 * the Gregorian calendar on October 15, 1582, a year is not a leap year 
 * if it is divisible by 100 (e.g. 1900); however, it is a leap year if 
 * it is divisible by 400 (e.g. 2000). Write a method that asks the user 
 * for a year and computes whether that year is a leap year.
 *
 */

/**
 * USER STORIES:
 * As a teacher I want my students to calculate if the year if leap or not
 * 1. Verify valid year > 0
 * 2. Verify leap year if year/4 || year/400
 * 3. Verify not a leap year if year/100
 * 4. Verify invalid inputs are handled 
 *
 */
public class LeapYear {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		try {
			LeapYear x = new LeapYear();
			
			
			System.out.println("Enter a year: ");
			int year = in.nextInt();
			
			if (x.validYear(year) == true) {
				System.out.println(x.leapYearValidator(year));
			}
			else if (x.validYear(year) == false) {
				System.out.println("Error, only positive numbers allowed!");
			}
		}
		catch (InputMismatchException | LeapYearException e) {
			System.out.println("Error, only numbers allowed!");
		}
		in.close();
	}
	
	public boolean validYear(int year) throws LeapYearException {
		if (year < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String leapYearValidator(int year) throws LeapYearException {
		if (year % 4 == 0 || year % 400 == 0) {
			return year + " is a leap year";
		}
		else {
			return year + " is NOT a leap year";
		}
	}
	
	

}
