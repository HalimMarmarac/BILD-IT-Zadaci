package zadaci_15_02_2016;

public class Zadatak2 {
	// throws new OutOfMemoryError
	public void OutOfMemoryError() {
		throw new OutOfMemoryError();
	}

	public static void main(String[] args) {
		// this will throw OutOfMemoryError
		try {
			int[] temp = new int[9999999];
			temp = new int[temp.length * 1000000000];
		} catch (OutOfMemoryError e) {
			System.out.println("Operation couldn't finish cause... " + e.getMessage());
		}
	}

}
