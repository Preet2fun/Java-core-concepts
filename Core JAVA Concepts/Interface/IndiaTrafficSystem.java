package Interface;

// A class can implement more then one interfaces

public class IndiaTrafficSystem implements centralTraffic, continentTraffic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		centralTraffic a = new IndiaTrafficSystem();
		IndiaTrafficSystem  b = new IndiaTrafficSystem();
		continentTraffic c = new IndiaTrafficSystem();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		b.trainSignal();
		c.walkSignal();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("impleneted greenGo method");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("impleneted redStop method");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("impleneted flashYellow method");
	}

	@Override
	public void walkSignal() {
		// TODO Auto-generated method stub
		System.out.println("implemented walksignal");
		
	}
	
	public void trainSignal() {
		System.out.println("implement trainSignal");
	}

}
