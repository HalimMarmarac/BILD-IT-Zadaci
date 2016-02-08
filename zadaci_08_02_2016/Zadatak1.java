package zadaci_08_02_2016;

import java.math.BigDecimal;

public class Zadatak1 {

	public static void main(String[] args) {

		String numString = "" + 1;
		// creating a 50 digit decimal number
		for (int i = 0; i < 49; i++) {

			numString += "0";
		}
		// big decimal object for saving 50 decimal number
		BigDecimal hugeNum = new BigDecimal(numString);
		int hugeNumCount = 0; // counting to 10
		while (hugeNumCount < 10) {
			// if remainder of dividing by 5 or 6 is 0 print number
			if (hugeNum.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)
					|| hugeNum.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
				
				hugeNumCount++;
				System.out.println(hugeNumCount + ".  " + hugeNum);
			}
			hugeNum = hugeNum.add(BigDecimal.ONE);
		}
	}

}
