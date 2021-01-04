package sixthwork;

public class PolymorphismDemo {
	public static void main(String[] args){
		displayObject(new CircleFromSimpleCeometricObject
				(1, "red¡±£¬false));
	    displayObject(new RectangleFromSimpleCeometricObject
	    		(1, 1,"black", true));
	}
	public static void displayObject(SimpleCeometricObjectobject){
		System out.println("Created on " + object.getDateCreated() +
				". Color is " + object.getColor());
	}
}
