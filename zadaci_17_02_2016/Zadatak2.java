package zadaci_17_02_2016;

import java.io.*;
import java.util.*;

public class Zadatak2 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// input filename
        System.out.print("Enter file name (without extension): ");
        String filename = in.next();
        // file to read 
        File file = new File("src\\zadaci_17_02_2016\\" + filename + ".txt");
        // if file doesn't exist
        if (!file.exists()) {
            System.out.println(file + " doesn't exist");
            System.exit(1);
        }
        String buffer = null; // to put line into
        int[] letterCount = new int[26]; // english alfabet letters count
        // read file and count letters
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                buffer = input.nextLine();
                for (char ch : buffer.toCharArray()) {
                    ch = Character.toUpperCase(ch);
                    if (Character.isLetter(ch)) {
                        letterCount[ch - 'A']++;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        // printing results
        for (int i = 0; i < letterCount.length; i++) {
            System.out.println((char)(i + 'A') + " occurrence = " + letterCount[i]);
        }
        in.close();
    }

}
