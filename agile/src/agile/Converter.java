package agile;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		//set exchange rate and print 
		double xRate = 0.89;
		System.out.println("Exchange rate: €" + xRate);
		
		//get USD amount from user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter USD amount: $");
		
		//validate the values and print result
		try {
			double usdAmt = in.nextDouble();
			if (validateUSD(usdAmt) == true && validateRate(xRate) == true) {
				conversion(usdAmt, xRate);
				System.out.println("Converted amount: €"+conversion(usdAmt, xRate));
				}
			else {
				System.out.println("Error, USD amount must be between $100 and $1000");
				}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		in.close();
	}

	public static boolean validateUSD(double USD) {
		if (USD <= 1000 && USD >= 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validateRate(double xRate) {
		if (xRate >= 0.01) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double conversion(double USD, double xRate) {
		//double roundOff = Math.round(a*100.0)/100.0;
		double euro = USD*xRate;
		euro = Math.round(euro*100.0)/100.0;
		return euro;
	}

}
