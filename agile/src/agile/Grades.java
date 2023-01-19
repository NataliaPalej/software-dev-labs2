package agile;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		try{
			System.out.print("Enter exam mark: ");
			int examMark = in.nextInt();
			System.out.print("Enter coursework mark: ");
			int cwMark = in.nextInt();
			if(validCWmark(cwMark) && validExamMark(examMark)){
				int totalMark = totalMark(examMark, cwMark);
				System.out.println("Total marks: " + totalMark);
				String grade = GradeConverter(totalMark);
				System.out.println("Your grade: " + grade);
			}
			else{
				System.out.println("Your grade: FM");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		in.close();
	}
	
	public static boolean validExamMark (int examMark){
		if (examMark >= 0 && examMark <= 75){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validCWmark (int cwMark){
		if (cwMark >= 0 && cwMark <= 25){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int totalMark(int examMark, int cwMark){
		int sum = 0;
		sum = examMark + cwMark;
		return sum;
	}
	
	public static String GradeConverter(int totalMark){
		String grade = " ";
		if (totalMark >= 70 && totalMark <= 100) {
			grade = "A"; 
			} 
		else if (totalMark >= 50 && totalMark < 70) {
			grade = "B";
			} 
		else if (totalMark >= 30 && totalMark < 50) {
			grade = "C";
			} 
		else if (totalMark >= 0 && totalMark < 30) {
			grade = "D"; 
			} 
		else if (totalMark < 0 || totalMark > 100) {
			grade = "FM";
			}
		return grade;
	}

}
