import string.StringConcepts;

public class AllAccessModifier extends StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// there are total four access modifer in java 1. public 2. private 3. protected 4. deafult
		// Default - if we don't mention any access modifer then it is Default and it is accessable in current package only.
		// Public -  we can able to access it from any whare irrespective of package or class
		// private - you can not access variable or method outside of class even in same package
		// protected - we can able to access it from current package all class plus in another package subclass where we exetent that class 
		
		
		StringConcepts am = new StringConcepts();
		//System.out.println(am.f); <-- giving error as we define f variable as default an it is in anothet package
		am.getdata(); // <-- able to access as this is define as public in another folder 
		//System.out.println(am.name); <-- giving error as we define name variable as private
		AllAccessModifier aam = new AllAccessModifier();
		
		System.out.println(aam.z);
		
	}

}
