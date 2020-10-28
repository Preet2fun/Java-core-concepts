package Constructor;

public class StaticVar {
     // There are three kine of variables in JAVA, 1) Static or class variable 2) instance variable 3) local variable
	// static or class level variables are shared by all object created for that perticular class and compiler will assign 
	// only one time memory in heap eventhogh all variables are using it
	// instance variable value assignment get vary for different objects.
	
	String name; // instance variable
	String area;
	static String city = "Bangluru" ;
	int b = 5;
	static int a = 0; //static or class variable
	
	
	public StaticVar(String name, String area) {
		int c = 10; // local variable
		this.name = name;
		this.area = area;
		a++;
		b++;
		//System.out.println(c);
	}
	
	public void getData() {
		System.out.println(name + " " + area);
		System.out.println(a);
		System.out.println(b);
		
	}
	
	// static method can directly accessable through class name without creating object of it.
	// static method only accepts static variable
	public static void stringData() {
		System.out.println(city);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("pratik", "vadodara");
		//System.out.println(obj.a);
		obj.getData();
		StaticVar obj1 = new StaticVar("Zalak", "Ahmedabad");
		//System.out.println(obj1.a);
		obj1.getData();
		
		System.out.println(StaticVar.a);
		StaticVar.stringData();
		
		
		
		
	}

}
