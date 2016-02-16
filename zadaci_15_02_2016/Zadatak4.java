package zadaci_15_02_2016;

import java.io.*;
import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) throws IOException {
		// create new file
		File f = new File("test.txt");
		if (!f.exists()) {
			System.out.println("File " + f + "doesn't exist.");
			// if you didn't created this file in Zadatak3 remove comment lines to create file
			/*
			try {
				System.out.println("Writing text to file...");
				PrintWriter out = new PrintWriter(f);
				String S = "The PC has improved the world in just about every area you can think of. \n"
						+ "Amazing developments in communications, collaboration and efficiencies. \n"
						+ "New kinds of entertainment and social media. Access to information and the \n"
						+ "ability to give a voice people who would never have been heard. \n(Bill Gates)";
				System.out.print(S); // print what is written to file
				out.println("The PC has improved the world in just about every area you can think of. "
						+ "Amazing developments in communications, collaboration and efficiencies. "
						+ "New kinds of entertainment and social media. Access to information and the "
						+ "ability to give a voice people who would never have been heard.");
				out.println("(Bill Gates)");
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			} */
		}
		// initializing counters
		int characters = 0;
		int words = 0;
		int lines = 0;
		// reading file and counting
		try {
			Scanner in = new Scanner(f);
			while (in.hasNext()) {
				String s = in.nextLine();
				lines++;
				characters += s.length();
				String[] split = s.split(" ");
				for (String word : split) {
					words++;
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// printing results
		System.out.println("Characters: " + characters);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);

	}

}
