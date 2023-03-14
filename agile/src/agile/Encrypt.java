package agile;
import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try{
			System.out.print("Enter 4-digit number: ");
			int digits = in.nextInt();
			
			if(validInput(digits)){
				digits = addSeven(digits);
				System.out.println(digits);
			}
			else{
				System.out.println("Invalid Input");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		in.close();
	}
	
	public static boolean validInput(int digits){
		boolean result = false;
		if (digits < 4 || digits > 0) {
			result = true;
			return result;
		}
		else {
			return result;
		}
	}
	
	public static int swapDigits(int digits){
		while (digits > 0) {
			System.out.println(digits%10);
			digits = digits/10;
		}
		return digits;
	}
	
	public static int addSeven(int digits){
		int num = 0;
		int newDigit = 0;
		while (digits > 0){
			num += (digits % 10);
			digits = (digits / 10)+7) + " ";
		}
		return num;
	}

}