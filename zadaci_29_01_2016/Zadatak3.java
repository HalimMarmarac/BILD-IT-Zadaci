package zadaci_29_01_2016;

import java.text.DecimalFormat;

public class Zadatak3 {

	public static void main(String[] args) {
		// suma/zbir serije
		double sum = 0;
		int i = 1; // neparni brojevi prolaze kroz ovu promjenjivu
		// zadnji neparan broj do 100 je 99
		// posto smo stavili i+2 u petlji idemo do 98 jer 97+2 = 99
		while (i < 98) {
			// ispisujemo seriju
			System.out.println(i + "/" + (i + 2));
			// znak + na sredini otprilike
			if (i < 10) {
				System.out.println(" +");
			} else {
				System.out.println("  +");
			}
			// raèunanje zbira serije
			sum += (double) i / (i + 2);
			// samo neparni brojevi dolaze u obzir
			i += 2;
		}
		// zaokruzivanje rezultata na 2 decimale
		DecimalFormat f = new DecimalFormat("#.##");
		// ispis rezultata zaok na dvije decimale
		System.out.println("= " + f.format(sum));
	}

}
