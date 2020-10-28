package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderFormatExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf1.format(cl.getTime()));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK));
		
		
	}

}
