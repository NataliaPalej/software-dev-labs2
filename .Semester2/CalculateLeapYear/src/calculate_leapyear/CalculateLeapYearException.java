package calculate_leapyear;

public class CalculateLeapYearException extends Exception {
	
	String message;
	
	public CalculateLeapYearException(String e) {
		this.message = e;
	}
	
	public String getMessage() {
		return message;
	}

}
