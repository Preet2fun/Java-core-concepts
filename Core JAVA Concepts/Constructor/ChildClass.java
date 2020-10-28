package Constructor;

import javax.management.remote.SubjectDelegationPermission;

public class ChildClass extends ParentClass{

	String name = "Zalak";
	int a = 15;
	
	public ChildClass() {
		super(); // this must be in constructor only and it must be in first line
		System.out.println("I am constructor of childclass");
	}
	
	public void getData() {
		
		System.out.println("I am in parent child class");
		super.getData();
	}
	
	public void getstringData() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(super.a);
		System.out.println(super.name);
		
	}
	
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass cc = new ChildClass();
		cc.getstringData();
		cc.getData();
	    
		
	}

}
