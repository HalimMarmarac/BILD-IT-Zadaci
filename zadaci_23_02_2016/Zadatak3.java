package zadaci_23_02_2016;

import java.util.*;

public class Zadatak3 {
	// returns count of specific (entered) character
	public static int count(String s, char ch) {
		int n = (ch == s.charAt(0)) ? 1 : 0;
		if (s.length() == 1)
			return n;
		else
			return n + count(s.substring(1), ch);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// input string and character to count
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		System.out.print("Enter character to count: ");
		char ch = in.next().charAt(0);
		// print result
		System.out.println("Count '" + ch + "' = " + count(s, ch));

		in.close();
	}

}
