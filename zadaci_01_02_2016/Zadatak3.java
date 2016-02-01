package zadaci_01_02_2016;

import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // za unos od korisnika

		short num = 0;
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos broja od korisnika
			try {
				System.out.println("Unesite broj (tip short [–32,768 do 32,767]): ");
				num = in.nextShort();
				
				q = false;

				// ukoliko korisnik unese broj koji nije short
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!");
				in.nextLine();
			}
		}
		// pretvorimo broj u string binarni broj
		String bin = Integer.toBinaryString(num);
		// za kreiranje stringa sa svih 16 pozicija
		StringBuilder sb = new StringBuilder();
		// upisujemo sve 0 do prve jedinice gdje pocinje binarni broj datog short broja
		for (int i = 0; i < (16 - bin.length()); i++) {
			sb.append("0");
		}
		// dodamo sam binarni oblik unesenog short broja na vec upisane nule
		sb.append(bin);
		// ispisujemo svih 16 bita unesenog broja
		System.out.println("\n# " + sb.toString());
		
		in.close();
	}

}
