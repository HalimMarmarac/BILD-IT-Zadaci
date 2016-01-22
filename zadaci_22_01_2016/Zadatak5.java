package zadaci_22_01_2016;

public class Zadatak5 {
	
	public static String convertMillis(long millis) {
		// racunanje sekundi, minuta i sati za dati broj milisekundi
		long second = (millis / 1000) % 60;
		long minute = (millis / (1000 * 60)) % 60;
		long hour = (millis / (1000 * 60 * 60)) % 24;
		// formatiranje stringa u obliku hh:mm:ss
		String time = String.format("%02d:%02d:%02d", hour, minute, second);
		
		return time;// vraca formatiran string
	}

	public static void main(String[] args) {
		// pozivanje metode i ispis vremena u formatu sati:minute:sekunde
		System.out.println(convertMillis(5436632));
	}

}
