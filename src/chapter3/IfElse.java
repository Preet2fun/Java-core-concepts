package chapter3;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pay = 1000;
		int Bonus = 250;
		int sales_completed = 10;

		System.out.println("Please enter sales completed this year : ");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();

		if (sales > sales_completed) {

			pay = pay + Bonus;
			System.out.println(" Congratulations !! your total pay is $" + pay);

		} else {
			System.out.println("Your pay is $" + pay);
		}

	}

}
