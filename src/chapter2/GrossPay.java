package chapter2;

import java.util.Scanner;

public class GrossPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter number of hour worked : ");
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();

		System.out.println("Please enter the hourly pay rate : ");
		double rate = scanner.nextDouble();
		scanner.close();

		double grossPay = hour * rate;

		System.out.println("Gross pay rate is : " + grossPay);

	}

}
