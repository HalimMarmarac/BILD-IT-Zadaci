package zadaci_19_02_2016;

import zadaci_19_02_2016.Octagon;

public class Zadatak3 {

	public static void main(String[] args) {
		// create oc1 and print area and perimeter
		Octagon oc1 = new Octagon(5);
		System.out.println("oc1 area = " + oc1.getArea());
		System.out.println("oc1 perimeter = " + oc1.getPerimeter());
		// oc2 is clone of oc1
		Octagon oc2 = (Octagon) oc1.clone();
		// if true objects are the same
		System.out.println("oc1 compareTo oc2: " + (oc1.compareTo(oc2) == 0));
		System.out.println("oc2 area = " + oc2.getArea());
		System.out.println("oc2 perimeter = " + oc2.getPerimeter());
	}

}
