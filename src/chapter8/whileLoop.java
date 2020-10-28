package chapter8;

import java.util.Scanner;

public class whileLoop {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		
		while (number <= 10) {
			System.out.println("Your number id not in range !!! it should be grater then 10");
			System.out.println("Please enter number : ");
			number = scanner.nextInt();
		}
		
		scanner.close();
		
		
	}
	

}
