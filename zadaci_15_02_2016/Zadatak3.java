package zadaci_15_02_2016;

import java.io.*;
import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		// creating file
		File f = new File("test.txt");
		// write text to file
		try {
			System.out.println("Writing text to file...");
			PrintWriter out = new PrintWriter(f);
			String S = "The PC has improved the world in just about every area you can think of. \n"
					+ "Amazing developments in communications, collaboration and efficiencies. \n"
					+ "New kinds of entertainment and social media. Access to information and the \n"
					+ "ability to give a voice people who would never have been heard. (Bill Gates)";
			System.out.print(S); // print what is written to file
			out.println("The PC has improved the world in just about every area you can think of. "
					+ "Amazing developments in communications, collaboration and efficiencies. "
					+ "New kinds of entertainment and social media. Access to information and the "
					+ "ability to give a voice people who would never have been heard. (Bill Gates)");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		// input word to remove from text
		System.out.println("\n\nEnter the word to remove from text: ");
		String word = in.next();
		String s = null;
		System.out.println();
		// read from file and remove inputed word from text
		Scanner in1 = new Scanner(f);
		while (in1.hasNext()) {
			s = in1.nextLine();
			s = s.replaceAll(word, ""); // removing word
			System.out.println(s); // printing text from file with removed inputed word
		}
		// writing text to file without removed word
		PrintWriter out = new PrintWriter(f);
		out.print(s);
		out.close();
		
		in.close();
		in1.close();
		// when removing is done print message
		System.out.println("\nDone!");
	}

}
