package zadaci_24_01_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int j = 0;
		int prethodniPrime = 1;
		int cnt = 0; // brojac
		System.out.println("ISPIS TWIN PRIME BROJEVA <10K:");
		// prolazimo kroz brojeve do 10K
		for (int i = 1; i < 10000; i++) {
			// provjeravamo da li je broj i prime ili ne
			for (j = 2; j < i; j++) {
			   if (i % j == 0) {
			   break; // ukoliko je prime prekidamo unutrasnju for petlju
			   }
			}
			if (i == j) {
				// ukoliko je razlika izmedju prethodnog prime broja i trenutnog =2
			   if ((i - prethodniPrime) == 2) {
				   // ispisi par twin prime brojeva
				   System.out.print("("+(i-2)+","+i+")");
				   cnt++; // inkrement brojaca
				   // ukoliko je 10 parova u liniji predji u novi red
				   if (cnt % 10 == 0) {
					   System.out.println();
				   }
			   }
			   // trenutni prime broj postaje prethodni za naredni broj koji ispitujemo
			   prethodniPrime = i;
			}
		}
	}
}
