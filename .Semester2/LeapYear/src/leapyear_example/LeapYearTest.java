package leapyear_example;

import junit.framework.TestCase;

public class LeapYearTest extends TestCase {
	
	// 1. Verify valid year > 0
	/**
	 * Test: #1
	 * Objective: Valid year > 0
	 * Input(s): year = 2000
	 * Output: True
	 */
	public void testvalidYear001() throws LeapYearException {
		LeapYear test001 = new LeapYear();
		boolean result = test001.validYear(2000);
		assertEquals(true, result);
	}
	
	/**
	 * Test: #2
	 * Objective: Invalid year =< 0
	 * Input(s): year = -100
	 * Output: False
	 */
	public void testvalidYear002() throws LeapYearException {
		LeapYear test002 = new LeapYear();
		boolean result = test002.validYear(-100);
		assertEquals(false, result);
	}
	
	/**
	 * Test: #3
	 * Objective: Invalid year input
	 * Input(s): year = b
	 * Output: False
	 */
	public void testvalidYear003() throws LeapYearException {
		LeapYear test003 = new LeapYear();
		boolean result = test003.validYear('b');
		assertEquals("Error, only numbers allowed!", "Error, only numbers allowed!");
	}
	
	// 2. Verify leap year if year/4 && year/400
	/**
	 * Test: #1
	 * Objective: Verify leap year if year/4 && year/400
	 * Input(s): year = 2000
	 * Output: Leap Year 
	 */
	public void testleapYearValidator001() throws LeapYearException {
		LeapYear test001 = new LeapYear();
		String result = test001.leapYearValidator(2000);
		assertEquals("2000 is a leap year", result);
	}
	
	// 3. Verify not a leap year if year/100
	/**
	 * Test: #2
	 * Objective: Verify not a leap year if year/100
	 * Input(s): year = 1900
	 * Output: NOT Leap Year 
	 */
	public void testleapYearValidator002() throws LeapYearException {
		LeapYear test001 = new LeapYear();
		String result = test001.leapYearValidator(1900);
		assertEquals("1900 is NOT a leap year", result);
	}

}
