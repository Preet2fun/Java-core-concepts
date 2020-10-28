package chapter6;

public class overLoadMethod {

	public static String getmonth(int month) {

		switch (month) {
		case 1:
			return "JAN";
		case 2:
			return "FEB";
		case 3:
			return "MAR";
		case 4:
			return "APR";
		case 5:
			return "MAY";

		default:
			return "Wrong Input";
		}

	}
	
	public static int getmonth(String month) {
		switch (month) {
		case "JAN": return 1;
		case "FAB": return 2;
		case "MAR": return 3;
		case "APR": return 4;
		case "MAY": return 5;

		default:
			return -1;
		}
		
	}

}
