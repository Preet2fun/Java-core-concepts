package string;

public class StringConcepts {
	
	protected int f = 5;
	private String name = "data";
	protected int z = 10;
	public void getdata() {
		System.out.println("demo of access modifier");
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		// String is a one of the pre build class in JAVA
		// we can define string with two types as mention below
		
		String a = "pratik";
		String b = new String("pratik");
		String f = "pratik";
		System.out.println("String literal way : " + a);
		System.out.println("By creating object of String : " + b);
		
		// string class every time create new objcet in memory even contain is same for both objects where as in literal if contains is same 
		// it won't create new object just it will point to already created objcet
		// equals(method) oprtaor work on contains of object where as == operator will work one reference of that objcet.
		
		System.out.println(a.equals(f)); //true
		System.out.println(a==f); //true
		System.out.println(a.equals(b)); // true
		System.out.println(a==b); //false
		
		
		//int is not a class , it is only refernce we create and assign it. 
		int c =5;
		System.out.println(c);
		
		// In java , String objects are immutable so we can not perform different option like insert , remove and reverse on string object.
		// we can use StringBuffer or StringBuilder class to perform all above operation.
		// stringBuffer class is thread safe where as StringBuilder is not a threadsafe 
		
		a.concat("patel");
		System.out.println(a); //string is immutabe as we concated patel to variable "a" still we have value pratik instaed of pratikpatel
		
		StringBuffer sb = new StringBuffer("pratik");
		System.out.println(sb.append("Patel")); //pratikpatel
		System.out.println(sb.delete(6, 8)); // pratiktel
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 5, "Zalak"));
		
		
	}

}
