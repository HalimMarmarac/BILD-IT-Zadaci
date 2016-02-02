package zadaci_02_02_2016;

public class Zadatak1 {

	public static void main(String[] args) {

		int[] randomNumbers = new int[100]; // array for 100 random digits
		int[] occurrence = new int[10]; // array counter
		// generate random numbers 0-9
		for (int i = 0; i < randomNumbers.length; i++) {
			int num = (int) (Math.random() * 10);
			randomNumbers[i] = num;
			occurrence[num]++;
		}
		// printing random numbers
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.print(randomNumbers[i] + " ");
			if ((i + 1) % 20 == 0) // 20 in line
				System.out.println();
		}
		System.out.println();
		// printing occurrence of all random generated digits
		for (int i = 0; i < occurrence.length; i++) {
			System.out.println("#" + i + " >> " + occurrence[i] + " times.");
		}
	}

}