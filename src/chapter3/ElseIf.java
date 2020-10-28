package chapter3;

import java.util.Scanner;

public class ElseIf {

	public static void main(String args[]) {

		System.out.println("Please enter your marks : ");
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		scanner.close();

		if (marks < 60) {
			System.out.println("You are fail !!!");
		} else if (marks <= 70) {
			System.out.println("You got C garde !!!");
		} else if (marks <= 80) {
			System.out.println("You got B grade !!!");
		} else if (marks <= 95) {
			System.out.println("You got A grade !!!");
		}

	}

}
