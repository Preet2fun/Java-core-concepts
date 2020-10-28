package overloading;

public class Functional_overloading extends ParentClass {
	
	// In fuctional overloading we can have multiple method with same name, but
	// they should have either different number of argument or argument data type should be different.
	
	// In functional overriding we have same method in parent class as well as in current class. both method having same name, signature and 
	// argument but local class method has higher priority then parent class.
	
	public void getFootballClub() {
		System.out.println("I am Real Madrid");
	}
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functional_overloading fo = new Functional_overloading();
		fo.getData(2);
		fo.getData("Pratik");
		fo.getData(3, 4);
		fo.getFootballClub(); // overriding orignal parent class method
		
		
		
	}

}
