package Interface;

public class IndiaAirline extends example_abstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndiaAirline a = new IndiaAirline();
		a.engine();
		a.saftyGuide();
		a.color();
		
		//example_abstract b = new example_abstract();
        // you can not create objcet or intiate abstract class
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Implemented RED color");
		
	}

}
