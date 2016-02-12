package zadaci_12_02_2016;

import zadaci_12_02_2016.Loan;

public class Zadatak5 {

	public static void main(String[] args) {
		// try to create ne loan and throw IllegalArgumentException
		try {
			Loan loan = new Loan(54, 0, -10);
		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException: " + ex.getMessage());
		}
	}

}
