package chapter8;

import java.util.Scanner;

public class doWhile {
	
	
	public static void main(String[] args) {
		
		double salary = 0;
		double days = 0;
		boolean again;
		
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.println("Please enetr number of hour : ");
			days = scanner.nextDouble();
			
			System.out.println("please enter hourly slary : ");
			salary = scanner.nextDouble();
			
			System.out.println("Salary is : " + days*salary);
			
			System.out.println("would you like to calculate again : ");
			again = scanner.nextBoolean(); 
			
			
		} while (again);
		
		scanner.close();
		
	}

}
