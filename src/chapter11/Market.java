package chapter11;

public class Market {
	
	public static void main(String[] args) {
	Fruit appy = new Apple();
	
	appy.makeJuice();
	((Apple) appy).removeSeeds();
	System.out.println(appy instanceof Apple);
	
	
	Fruit test1 = new Fruit();
	Fruit test2 = new Apple();
	Fruit test3 = new Banana();
	Apple test4 = new Apple();
	Banana test5 = new Banana();
	
	squeeze(test1);
	squeeze(test2);
	squeeze(test3);
	squeeze(test4);
	squeeze(test5);
	
	
	
	}

	public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
        System.out.println(fruit instanceof Fruit);
    }
	
}
