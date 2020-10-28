package chapter3;

import java.util.Scanner;

public class SwitchCase {
	
	
	
	public static void main (String args[]) {

		System.out.println("Please enter you grade :");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();

		switch (grade) {
		case "A":
			System.out.println("Excellent Work !!!");
			break;
		case "B":
			System.out.println("Good work !!!");
			break;
		case "c":
			System.out.println("You need to improve !!!");
			break;
		default:
			System.out.println("You are not quilified  !!!");
			break;
		}

	}

}
