package zadaci_15_02_2016;

public class Zadatak1 {

	public static int bin2Dec(String binary) throws NumberFormatException {
		// binary numbers are only 1s and 0s
		// if string is not binary number throw NumberFormatException
		for (char ch : binary.toCharArray()) {
			if (ch != '1' && ch != '0')
				throw new NumberFormatException(binary + " is not a binary number.");
		}
		
		int power = 0; // index of 1 or 0 in binary number from right to left
		int decimal = 0; // decimal result
		// if number is binary convert it to decimal
		for (int i = binary.length() - 1; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		}
		return decimal; // return decimal result
	}

	public static void main(String[] args) {
		// this will print result in decimal format
		try {
			System.out.println(bin2Dec("0111"));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		// this will throw exception
		try {
			System.out.println(bin2Dec("1411h"));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
