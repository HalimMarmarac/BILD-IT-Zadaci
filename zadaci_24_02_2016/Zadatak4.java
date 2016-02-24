package zadaci_24_02_2016;

public class Zadatak4 {
	
	// return max element in 2d array
	public static <E extends Comparable<E>> E max(E[][] list) {

		E max = list[0][0]; // max set to first element in array
		// finding max element in array
		for (E[] elements : list) {
			for (E element : elements) {
				if (element.compareTo(max) > 0) {
					max = element;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// new 2d array of integers
		Integer[][] list = new Integer[5][5];
		// filling the array
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = i + j;
			}
		}
		// printing the array
		System.out.println("2D array***");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		// print max element
		System.out.println("\nMax = " + max(list));
	}

}
