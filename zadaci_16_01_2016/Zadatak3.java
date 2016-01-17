package zadaci_16_01_2016;

import java.io.*;
import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {

		// kreiranje/proslijedjivanje vaseg file-a programu
		File f = new File("C:\\Users\\roll_\\Documents\\test.txt");

		try {
			System.out.println("File je ucitan...\n");
			
			// brojanje linija u fileu
			FileInputStream fstream = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			long cntLine = 0;	// brojac linija
			while ((strLine = br.readLine()) != null) {
				strLine = br.readLine();
				cntLine++;
			}
			
			// brojanje rijeci u fajlu
			long cntWord = 0; // brojac rijeci
			BufferedReader bf = new BufferedReader(new FileReader(f));
			String line;
			try {
				while ((line = bf.readLine()) != null) {
					StringTokenizer words = new StringTokenizer(line);
					while (words.hasMoreTokens()) {
						cntWord++;
						words.nextToken();
					}
				}
				cntWord -= cntLine - 1; // broj rijeci umanjujemo za broj prelazaka u novi red \n

			// brojanje karaktera u fajlu
			long cntChar = 0; // brojac karaktera
			Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(f), "US-ASCII"));
			    int ch;
			    while ((ch = r.read()) != -1) {
			      int chr = (char) ch;
			      // brojac broji sve karaktere osim razmaka (space)
			      if ((int)chr > 32 && (int)chr < 256) {
			    	  cntChar++;
			      }
			    }

			r.close();
			
			// ispis rezultata
			System.out.println("# Linija = " + cntLine + "\n# Rijeci = " + cntWord + "\n# Karakteri = " + cntChar);
				
			} catch (FileNotFoundException e) {
			} finally {
				bf.close();
				br.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Nema file-a!");
		}
	}

}