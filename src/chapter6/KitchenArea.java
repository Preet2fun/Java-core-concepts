package chapter6;

import java.util.Scanner;

public class KitchenArea {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		KitchenArea room = new KitchenArea();
		AreaCalculator bathroom = room.getRoom();
		AreaCalculator bedroom1 = room.getRoom();

		System.out.println(bathroom);
		System.out.println(bedroom1);

		double finalArea = room.areacalc(bathroom, bedroom1);
		System.out.println("Total area would be : " + finalArea);

		room.scanner.close();

	}

	public AreaCalculator getRoom() {

		System.out.println("Please enter width : ");
		double width = scanner.nextDouble();

		System.out.println("Please enter length : ");
		double length = scanner.nextDouble();

		AreaCalculator plot = new AreaCalculator(width, length);
		return plot;
		// we have return object plot which has tow value stored for width and length

	}

	public double areacalc(AreaCalculator room1, AreaCalculator room2) {
		
		return room1.area()+room2.area();
		
	}
	
	
}
