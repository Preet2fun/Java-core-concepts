package chapter9;


import java.util.Arrays;
import java.util.Random;

public class SearchArray {

	private static final int NUMBER = 10;
	private static final int MAX_NUMBER = 100;

	public static void main(String[] args) {

		int[] ticket = generateNumber();
		Arrays.sort(ticket);
		for (int i=0; i<NUMBER;i++) {
			System.out.print(ticket[i] + " | ");
		}

	}

	public static int[] generateNumber() {
		int[] ticket = new int[NUMBER];
		Random random = new Random();
		int random_number;
		for (int i = 0; i < NUMBER; i++) {

			do {
				random_number = random.nextInt(MAX_NUMBER) + 1;
			} while (search(ticket, random_number));

			ticket[i] = random_number;

		}
		return ticket;

	}
	
	public static boolean search(int[] ticket, int random_number) {
		for (int value : ticket) {
			if (value == random_number) {
				return true;
			}}
		return false;
	}

}
