package sixthwork;

public class CircleFromSimpleGeometricObject {
	extends SimpleGeometricObject
	private double radius;
	public CircleFromSimpleGeometricObject() {
	}
	public CircleFromSimpleGeometricObject(double radius) {
		this. radius = radius;
	}
	public CircleFromSimpleGeometricObject(double radius,
			String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this. radius = radius;
	}
	public double getAreaO {
		return radius * radius * Math . PI;
	}
	public double getDiameter() {
		return 2 * radius;
	}
	public double getPerimeter() {
		return 2 * radius * Math . PI;
	}
	public void printCirclef ) {
		System.out.println("The circle is created " + getDateCreated() +
	 " and the radius is " + radius);
	}
}
