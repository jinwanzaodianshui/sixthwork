package sixthwork;

public class TestArrayList {
	public static void main (String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add C"London");
		cityList.add ("Denver");
		cityList.add ("Paris");
		cityList.add ("Miami");
		cityList.add ("Seoul");
		cityList.add ("Tokyo");
		System.out.println("List size? " + cityList.s1ze());
		System.out.println("Is Miami in the list? " +
				cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? "
				+ cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " +
				cityList.isEmpty());
		cityList.add(2, "Xian");
		c1tyList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		for (int i = cityList.sizeO - 1£»i >= 0; i--)
			System.out.print(cityList.get(i) + " ");
		System.out.println();
		ArrayList<CircleFromSimpleCeometricObject> list
		= new ArrayListoO;
		list,add(new CircleFromSimpleCeoinetric0bject(2));
		list.add(new CircleFromSimpleCeometric0bject(3));
		System.out.println("The area of the circle? " +
				list.get(0).getArea());
	}
	}
}
