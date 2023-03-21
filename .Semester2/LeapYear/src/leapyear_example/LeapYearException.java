package leapyear_example;

public class LeapYearException extends Exception {
	String message;
	
	public LeapYearException(String e) {
		message = e;
	}
	
	public String getMessage() {
		return message;
	}
}
