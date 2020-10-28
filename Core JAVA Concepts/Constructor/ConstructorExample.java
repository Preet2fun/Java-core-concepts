package Constructor;

public class ConstructorExample {

	// constructor is block of code which is automitacally called when we create object of that perticular class
	// constructor doesnt have return type like void , String etc and it must have same name like class name
	// if we don't define any constructor then compiler will automiticall call default constructor 
	
	//below is default constructor
	public ConstructorExample() {
		System.out.println("I am in constructor..");
	}
	
	//belwo are the parameterized constructor
	public ConstructorExample(int a, int b) {
		System.out.println("I am in parameterized constructor with value : " + a + " and " + b );
	}
	
	public ConstructorExample(String a) {
		System.out.println("My name is " + a);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorExample ce = new ConstructorExample();
		ConstructorExample pce = new ConstructorExample(4,5);
		ConstructorExample pce1 = new ConstructorExample("pratik");
	}

}
