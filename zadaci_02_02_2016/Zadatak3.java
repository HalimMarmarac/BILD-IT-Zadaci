package zadaci_02_02_2016;

import java.util.*;

public class Zadatak3 {
	
	public static boolean isConsecutiveFour(int[] values) {
		
        int sequence = 0; // sequence of number
        int last = values[0]; // last num in sequence set to first num in array
        // searching for consecutive fours
        for (int i = 1; i < values.length; i++) {
        	// if next number in array is same as last increment sequence
            if (values[i] == last) {
                sequence++;
                // if next number in array isn't same as last set sequence to 1
            } else {
                sequence = 1;
                last = values[i]; // counting sequence starts over from this point
            }
            // if sequence is 4 thet return true
            if (sequence == 4) return true;

        }
        return false;
    }

	public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int size = 0; // for size of array
        // getting num from user
        System.out.print("Enter the number of values: ");
        try {
			size = in.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!\nIntegers only!\nEnter the number of values: ");
			in.nextLine();
		}
    
        int[] values = new int[size];
        // getting nums from user
        System.out.print("Enter the values:\n");
        for (int i = 0; i < size; i++) {
        	try {
        		values[i] = in.nextInt();
        	} catch (InputMismatchException e) {
    			System.out.println("Wrong input!\nIntegers only!: ");
    			in.nextLine();
    			i--;
    		}
        }
        // printing results
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
        
        in.close();
    } 
}
