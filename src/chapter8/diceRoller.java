package chapter8;

import java.util.Random;

public class diceRoller {

	public static void main(String[] args) {

		int attempt = 5;
		int sum = 0;

		for (int i = 0; i < attempt; i++) {
			System.out.println("Please throe dice..");
			Random rand = new Random();
			int number = rand.nextInt(6) + 1;
			sum = sum + number;

			if (sum == 20) {
				System.out.println("You won...");
				break;
			}else if (sum > 20) {
				System.out.println("You loose...");
			} 
			
			else {
				System.out.println("You are thorwn " + number + " and You still required " + (20 - sum) + " to win");
			}

		}
	}

}
