package zadaci_24_02_2016;

public class Zadatak3 {

	// return max element in array
	public static <E extends Comparable<E>> E max(E[] list) {

		E max = list[0]; // max set to first element in array
		// finding max element in array
		for (int i = 1; i < list.length; i++) {
			E element = list[i];
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// new array of integers
		Integer[] list = new Integer[12];
		// filling the array
		for (int i = 0; i < list.length; i++) {
			list[i] = i * 3;
		}
		// printing the array
		System.out.println("Array***");
		for (int i : list) {
			System.out.print(i + " ");
		}
		// printing max element in array
		System.out.println("\nMax = " + max(list));
	}

}
