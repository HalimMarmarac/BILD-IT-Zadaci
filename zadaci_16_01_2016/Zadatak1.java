package zadaci_16_01_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int cnt = 0; // brojac prestupnih godina u datom periodu
		// od - do
		for (int i = 101; i <= 2100; i++) {
			// ispitivanje da li je godina prestupna
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				cnt++; // inkrement brojaèa za svaku prestupnu god
				System.out.print(i + " ");
				if (cnt % 10 == 0) System.out.println(); // 10 po liniji
			}
		}
		// ispis brojaèa prestupnih god
		System.out.println("\n\nU periodu od 101. do 2100. god ima " + cnt + " prestupnih godina.");
	}

}
