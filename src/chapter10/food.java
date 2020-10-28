package chapter10;

public class food {
	
	private String color;
	private String shape;
	private String taste;
	
	public food() {
		System.out.println("This is deafult constructor of food class (Supre class)");
	}
	
	public food(String name) {
		System.out.println("This is 2nd constructor of food class (Supre class)");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public double ractangular() {
		System.out.println("This method resturn rectangular property");
		return 100.100;
	}
	

}
