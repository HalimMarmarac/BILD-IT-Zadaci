package zadaci_23_02_2016;

import java.util.*;

public class Zadatak2 {
	// output characters in string reverse
	private static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        System.out.print(value.substring(value.length() - 1));
        reverseDisplay(value.substring(0, value.length()-1));
    }
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// input some string
		System.out.print("Enter a string: ");
        String s = in.nextLine();
		// print result
		System.out.print("Reverse: ");
		reverseDisplay(s);
		
		in.close();
	}

}
