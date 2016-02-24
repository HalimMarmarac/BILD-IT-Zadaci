package zadaci_24_02_2016;

public class Zadatak2 {

	// returns value if it's in the array or -1 if key is not in the list
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		// check if key is in the array
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// new array
		Integer[] list = new Integer[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		// printing the array
		System.out.println("Array***");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		// search in array for specific key
		int key1 = 1;
		int key2 = 7;
		int key3 = 77;
		System.out.println("Broj " + key1 + " u nizu? -> " + ((linearSearch(list, key1) >= 0) ? "DA" : "NE"));
		System.out.println("Broj " + key2 + " u nizu? -> " + ((linearSearch(list, key2) >= 0) ? "DA" : "NE"));
		System.out.println("Broj " + key3 + " u nizu? -> " + ((linearSearch(list, key3) >= 0) ? "DA" : "NE"));
	}

}
