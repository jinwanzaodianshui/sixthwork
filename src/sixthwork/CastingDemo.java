package sixthwork;

public class CastingDemo {
	public static void main(String[] args) {
		Object objectl = new CircleFromSimpleGeometricObject(l);
		Object object2 = new RectangleFromSimpleCeometricObject(1, 1);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if (object instanceof CircleFromSimpleGeometricObject) {
			System.out.println("The circle area is " +
					((CircleFromSimpleCeometricObject)object).getArea());
			System.out.println("The circle diameter is " +
					((CircleFromSimpleGeometricObject)object).getDiameter());
		}
		else if (object instanceof
				RectangleFromSimpleGeometricObject) {
			System.out.pri ntl n ("The rectangle area is " +
					((RectangleFromSimpleCeometricObject)object).getArea())£»
		}
	}
}
