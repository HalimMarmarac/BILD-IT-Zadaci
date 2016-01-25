package zadaci_25_01_2016;

import java.text.*;
import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {
		// format u kome zelimo da se datum i vrijeme ispisuje
		DateFormat dateFormat = new SimpleDateFormat("dd" + ". " + "MMMM" + ", " + "yyyy HH:mm:ss");
		// kreiranje datuma pomocu metode System.currentTimeMillis()
		// metoda se moze i izostaviti
		Date d = new Date(System.currentTimeMillis());
		// pretvoranje formata datuma i vremena u string
		String s = dateFormat.format(d).toString();
		// zamjena engl naziva mjeseci sa bosanskim
		s = s.replace("January", "januar");
		s = s.replace("February", "februar");
		s = s.replace("March", "mart");
		s = s.replace("April", "april");
		s = s.replace("May", "maj");
		s = s.replace("June", "juni");
		s = s.replace("July", "juli");
		s = s.replace("August", "august");
		s = s.replace("September", "septembar");
		s = s.replace("October", "oktobar");
		s = s.replace("November", "novembar");
		s = s.replace("December", "decembar");
		// ispis trenutnog datuma i vremena u datom formatu
		System.out.print("Trenutni datum i vrijeme: " + s);
	}
}
