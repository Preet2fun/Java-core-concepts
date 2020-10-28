package chapter12;

import java.util.Map;
import java.util.Map.Entry;

public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> FirstAttempt = TestResults.getOriginalGrades();
		Map<String, Integer> SecondAttempt = TestResults.getMakeUpGrades();
		
		FirstAttempt.forEach((k,v) -> System.out.println("Key : " + k + " Value : " + v));
		System.out.println("*******************************************");
		SecondAttempt.forEach((k,v) -> System.out.println("Key : " + k + " Value : " + v));
		System.out.println("*******************************************");
		
		for (Entry<String, Integer> student : SecondAttempt.entrySet()) {
			
			Integer fisrtvalue = FirstAttempt.get(student.getKey());
			Integer Secondvalue = SecondAttempt.get(student.getKey());
			
			if (Secondvalue > fisrtvalue) {
				FirstAttempt.put(student.getKey(), Secondvalue);
			}
			
		}
		
		FirstAttempt.forEach((k,v) -> System.out.println("Key : " + k + " Value : " + v));
		

	}

}
