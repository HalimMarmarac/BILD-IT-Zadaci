package zadaci_20_02_2016;

import java.util.*;
import zadaci_20_02_2016.BigRational;

public class Zadatak5 {
	
	 public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);
	        // input decimal number
	        System.out.print("Enter a decimal number: ");
	        						// replace ',' with '.'
	        String s = in.next().replace(',', '.');
	        // print result
	        System.out.println("The fractional number is " + new BigRational(s));
	        
	        in.close();
	    }

}
