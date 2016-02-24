package zadaci_24_02_2016;

public class Zadatak5 {
	// binary search
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (high - low) / 2 + low;
			if (list[mid].compareTo(key) == 0) {
				return mid;
			}

			if (list[mid].compareTo(key) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// new array of integers
		Integer[] list = new Integer[17];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		// printing the array
		System.out.println("Array***");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		// test binarySearch
		for (int i = 0; i < list.length + 4; i++) {
			System.out.println("Broj " + i + " u nizu? -> " + ((binarySearch(list, i) >= 0) ? "DA" : "NE"));
		}
	}

}
