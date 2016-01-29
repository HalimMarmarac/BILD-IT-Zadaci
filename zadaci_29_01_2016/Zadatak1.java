package zadaci_29_01_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// nasumièno generisanje broja 1-12 bez random() metode
		int mjesec = 1 + (int)(Math.random() * 12);
		// ime mjeseca (poprima vrijednost stringa u zavisnosti od broja)
		String imeMjeseca = null;
		// za sve sluèajeve nasumièno generisanog broja mjesecu dodjeljujemo ime
		switch (mjesec) {
		case 1:
			imeMjeseca = "Januar";
			break;
		case 2:
			imeMjeseca = "Februar";
			break;
		case 3:
			imeMjeseca = "Mart";
			break;
		case 4:
			imeMjeseca = "April";
			break;
		case 5:
			imeMjeseca = "Maj";
			break;
		case 6:
			imeMjeseca = "Juni";
			break;
		case 7:
			imeMjeseca = "Juli";
			break;
		case 8:
			imeMjeseca = "August";
			break;
		case 9:
			imeMjeseca = "Septembar";
			break;
		case 10:
			imeMjeseca = "Oktobar";
			break;
		case 11:
			imeMjeseca = "Novembar";
			break;
		case 12:
			imeMjeseca = "Decembar";
			break;
		}
		// ispis rezultata
		System.out.println("Generisani broj je " + mjesec + ", mjesec je " + imeMjeseca + ".");
	}
}
