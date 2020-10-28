package Interface;

public abstract class example_abstract {

	//Any method which is without any implementation or body are called abstrect method
	// all methods in interface are abstrect method only
	//if any method is there in class is abstact then that class is called abstrct class
	//Unlike interfaces, abstract class can have methods with implementaion as well. so with abstract class only partial abstraction is achived
	
	public void engine() {
		System.out.println("engine implementation");
	}
	//you can not use private access modifier for any method ...public and private only allowed 
	public void saftyGuide() {
		System.out.println("safty measure implementation");
	}
	
	public abstract void color();
	
	
}
