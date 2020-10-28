package chapter9;

import java.util.Random;

public class ArrayInt {

	private static final int NUMBER = 6;
	private static final int MAX_NUMBER = 99;

	public static void main(String[] args) {
		
		
		int[] ticket = generateNumber();
		displayNumber(ticket);
		
		
	}

	public static int[] generateNumber() {

		int[] ticket = new int[NUMBER];
		Random random = new Random();

		for (int i = 0; i < NUMBER; i++) {

			ticket[i] = random.nextInt(MAX_NUMBER) + 1;

		}

		return ticket;
	}

	public static void displayNumber(int[] ticket) {
		for (int i = 0; i < NUMBER; i++) {
			System.out.print(ticket[i] + " | ");
		}

	}

}
