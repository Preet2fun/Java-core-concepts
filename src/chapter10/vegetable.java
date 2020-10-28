package chapter10;

public class vegetable extends food {

	private String Type;
	private String name;
	
	public vegetable() {
		super("Pratik");
		System.out.println("This is deafult constructor of vegetable class (Sub class)");
		
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double ractangular() {
		System.out.println("This method resturn square property");
		return 50.50;
	}
	
	
}
