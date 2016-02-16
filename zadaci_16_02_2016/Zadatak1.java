package zadaci_16_02_2016;

import java.io.*;
import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {
		// file test.java for this test
		File f = new File("src\\zadaci_16_02_2016\\test.java");
		if (!f.exists()) {
			System.out.println(f + " doesn't exist.");
			System.exit(1);
		}
		// string builder object for formating string
		StringBuilder buffer = new StringBuilder();
		// reading from file and changing bracket style
		try {
			Scanner in = new Scanner(f);
			while (in.hasNext()) {
				String s = in.nextLine();

				if (s.contains("{")) {
					buffer.append(" {");
				} else {
					buffer.append("\n" + s);
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// writing new style to file
		try {
			PrintWriter out = new PrintWriter(f);
			out.write(buffer.toString());
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// preview new style in console
		System.out.println(buffer);
	}

}
