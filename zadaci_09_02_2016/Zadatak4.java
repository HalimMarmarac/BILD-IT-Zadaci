package zadaci_09_02_2016;

import zadaci_09_02_2016.SplitString;

public class Zadatak4 {

	public static void main(String[] args) {
		// testing split from SplitString class
		String[] temp1 = SplitString.split("Today#is#Tuesday", "#");
		for (String s : temp1) {
			System.out.print(s + ", ");
		}

		System.out.println();
		String[] temp2 = SplitString.split("a?b?gf#e", "[?#]");
		for (String s : temp2) {
			System.out.print(s + ", ");
		}
	}

}
