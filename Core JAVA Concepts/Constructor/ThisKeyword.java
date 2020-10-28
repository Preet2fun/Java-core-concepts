package Constructor;

public class ThisKeyword {

	int a = 2;
	public void getData() {
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);
		// this key word refers to current class object and its scope lies with class level
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword tk = new ThisKeyword();
		tk.getData();
		
		
	}

}
