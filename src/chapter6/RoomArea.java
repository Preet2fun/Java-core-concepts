package chapter6;


public class RoomArea {
	
	
	public static void main(String[] arg) {
		
		AreaCalculator room1 = new AreaCalculator();
		
		System.out.println(room1.getLength());
		System.out.println(room1.getWidth());
		
		room1.setLength(10);
		room1.setWidth(5);
		
		System.out.println(room1.getLength());
		System.out.println(room1.getWidth());
		
		
		double areaLength = room1.area();
		System.out.println(areaLength);
		
		
		
	}

}
