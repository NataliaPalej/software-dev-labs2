package agile;

import java.util.Scanner;

public class Agile_Rectangle {

	public static void main(String[] args) {
		Rectangle();
		
	}
	
	public static void Rectangle(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vertical length: ");
		int a = sc.nextInt();
		System.out.println("Enter horizontal length: ");
		int b = sc.nextInt();
		
		if (a >= 0 && b >= 0 && a!=b){		
		for (int i = 0; i < a; i++){
			for (int j = 0; j < b; j++){
				System.out.print("* ");
			}
			System.out.println();
			}
		}
		else if (a < 0 || b < 0){
			System.out.println("Length cannot be a negative number!");
		}
		else if (a == b){
			System.out.println("Horizontal and vertical length cannot be the same size.");
		}
	}

}
