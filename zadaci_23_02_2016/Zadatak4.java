package zadaci_23_02_2016;

import java.util.*;

public class Zadatak4 {
	// returns sum of digits of an integer
	public static long sumDigits(long n) {
		
        if (n == 0)
            return n;

        return n % 10 + sumDigits(n / 10);
    }
	
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        long n = 0;
		boolean q = true; // for while loop
		while (q) {
			try {
				// input integer
				System.out.print("Enter an integer: ");
				n = in.nextLong();
				q = !q;
				// integers only
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		// print result
        System.out.println("Sum of digits = " + sumDigits(n));

        in.close();
    }

}
