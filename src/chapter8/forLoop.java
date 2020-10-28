package chapter8;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {

		System.out.println("Please enetr any string : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		boolean foundChar = false;
		scanner.close();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'A' || name.charAt(i) == 'a') {

				foundChar = true;
				break;

			}
		}
		if (foundChar) {
			System.out.println("Character found in string");
		} else {
			System.out.println("character not found in string");
		}

	}

}
