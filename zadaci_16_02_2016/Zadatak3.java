package zadaci_16_02_2016;

import java.io.*;
import java.net.*;
import java.util.*;

public class Zadatak3 {
	// removing empty strings from array
	private static String[] removeEmptyStrings(String[] words) {

		ArrayList<String> modifiedWords = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != 0) {
				modifiedWords.add(words[i]);
			}
		}
		return modifiedWords.toArray(new String[modifiedWords.size()]);
	}

	public static void main(String[] args) {
		// try connecting to file
		URL url = null;
		try {
			url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		} catch (MalformedURLException e) {
			System.out.println("Invalid url: " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		// reading file from web and saving words to string
		String s = "";
		try (Scanner in = new Scanner(url.openStream())) {
			while (in.hasNext()) {
				s += in.nextLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// creating array of words (words are separated with ' ' ',' or '.')
		String[] words = s.split("[ ,.]", 0);
		words = removeEmptyStrings(words); // remove empty string form array
		// print number of words in text
		System.out.println("Total word count = " + words.length);

	}

}
