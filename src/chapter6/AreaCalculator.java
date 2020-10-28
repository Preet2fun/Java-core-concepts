package chapter6;

public class AreaCalculator {

	private double length;
	private double width;

	public AreaCalculator() {
		length = 0;
		width = 0;
	}

	public AreaCalculator(double length, double width) {
		this.length = length;
		setWidth(width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public double parimeter() {
		return (2 * length) + (2 * width);
	}
}
