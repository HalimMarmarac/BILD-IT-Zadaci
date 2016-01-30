package zadaci_30_01_2016;

import java.text.*;
import java.util.*;

public class Zadatak4 {

	public static void time() {

		// format u kome zelimo da se datum i vrijeme ispisuje
		DateFormat dateFormat = new SimpleDateFormat("dd. MMMM yyyy. HH:mm:ss");
		// cita datum i vrijeme sa masine
		Date d = new Date();
		// pretvoranje formata datuma i vremena u string
		String s = dateFormat.format(d).toString();
		
		// ispis trenutnog datuma i vremena u datom formatu
		System.out.print("Trenutni datum i vrijeme: " + s);
	}

	public static void main(String[] args) {
		// pozovemo metodu za prikaz trenutnog vremena i datuma
		time();
	}

}
