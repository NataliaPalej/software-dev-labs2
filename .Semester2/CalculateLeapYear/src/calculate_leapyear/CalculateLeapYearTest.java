package calculate_leapyear;

import junit.framework.TestCase;

public class CalculateLeapYearTest extends TestCase {
	
	/*
	 * Test: #1
	 * Objective: Verify valid year > 0 
	 * Input(s): 2000
	 * Output: true
	 */
	public void testvalidYear001() {
		CalculateLeapYear test001 = new CalculateLeapYear();
		boolean result;
		try {
			result = test001.validYear(2000);
			assertEquals(true, result);
		} catch (CalculateLeapYearException e) {
			fail("Exception NOT excepted");
		}
	}
	
	/*
	 * Test: #2
	 * Objective: Verify invalid year < 0 
	 * Input(s): -100
	 * Output: Year must be a positive number
	 */
	public void testvalidYear002() throws CalculateLeapYearException {
		CalculateLeapYear test002 = new CalculateLeapYear();;
		try {
			boolean result = test002.validYear(-100);
		} catch (CalculateLeapYearException e) {
			assertEquals("Year must be a positive number", e.getMessage());
		}
	}
	
	/*
	 * Test: #3
	 * Objective: Verify invalid values are handled and rejected 
	 * Input(s): b
	 * Output: "Year must be a number"
	 */
	public void testvalidYear003() throws CalculateLeapYearException {
		CalculateLeapYear test003 = new CalculateLeapYear();;
		try {
			boolean result = test003.validYear('b');
		} catch (CalculateLeapYearException e) {
			assertEquals("Year must be a number", e.getMessage());
		}
	}
	
	/*
	 * Test: #1
	 * Objective: Verify if year/4 it is a leap year
	 * Input(s): 1980
	 * Output: 1980 is a leap year
	 */
	public void testcalgetLeapYear001() {
		CalculateLeapYear test001 = new CalculateLeapYear();
		String result = test001.getLeapYear(1980);
		assertEquals("1980 is a leap year", result);
	}
	
	/*
	 * Test: #2
	 * Objective: Verify if year/400 it is a leap year
	 * Input(s): 2000
	 * Output: 2000 is a leap year
	 */
	public void testcalgetLeapYear002() {
		CalculateLeapYear test002 = new CalculateLeapYear();
		String result = test002.getLeapYear(2000);
		assertEquals("2000 is a leap year", result);
	}
	
	/*
	 * Test: #3
	 * Objective: Verify if year/100 it is NOT a leap year
	 * Input(s): 1900
	 * Output: 1900 is NOT a leap year
	 */
	public void testcalgetLeapYear003() {
		CalculateLeapYear test003 = new CalculateLeapYear();
		String result = test003.getLeapYear(1900);
		assertEquals("1900 is NOT a leap year", result);
	}
	

}
