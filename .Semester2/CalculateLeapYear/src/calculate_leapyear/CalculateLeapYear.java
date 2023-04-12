package calculate_leapyear;

public class CalculateLeapYear {
		
	/**
	 * USER STORY:
	 * As a teacher I want to teach my students how to know if the year is leap or not
	 * 
	 * ACCEPTANCE CRITERIA:
	 * 1) Verify valid year > 0 
	 * 2) Verify if year/4 and year/400 it is a leap year
	 * 3) Verify if year/100 it is not a leap year 
	 * 4) Verify invalid values are handled and rejected
	 * @throws CalculateLeapYearException 
	 */
	
	public boolean validYear(int year) throws CalculateLeapYearException {
		boolean result = false;
		if (year > 0) {
			result = true;
		}
		else if (year < 0) {
			throw new CalculateLeapYearException("Year must be a positive number");
		}
		else {
			throw new CalculateLeapYearException("Year must be a number");
		}
		return result;
	}
	
	public String getLeapYear(int year) {
		String result = " ";
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			result = year + " is a leap year";
		}
		else {
			result = year + " is NOT a leap year";
		}
		return result;
	}

}
