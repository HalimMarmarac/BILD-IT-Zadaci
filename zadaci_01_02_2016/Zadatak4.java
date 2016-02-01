package zadaci_01_02_2016;

public class Zadatak4 {
	
	public static String format(int number, int width) {
		// pretvorimo broj u string
		String n = Integer.toString(number);
		// za pravljenje stringa u datoj duzini
		StringBuilder sb = new StringBuilder();
		// ukoliko je width manja od duzine broja ispisujemo samo broj
		if (n.length() >= width) {
			sb.append(n);
		}
		// dodajemo onoliko nula koliko je potrebno da duzinu broja + broj nula dobijemo width
		else {
			for (int i = 0; i < (width - n.length()); i++) {
				sb.append("0");
			}
			sb.append(n); // na nule dodamo broj
		}
		
		return sb.toString(); // vraca broj
	}

	public static void main(String[] args) {
		// ispis
		System.out.println(format(34, 4));

	}

}
