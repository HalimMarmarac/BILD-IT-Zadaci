package zadaci_06_02_2016;

import zadaci_06_02_2016.Time; // import Time class

public class Zadatak1 {

	public static void main(String[] args) {
		// new time object with no-arg constructor
		Time time1 = new Time();
		System.out.println(time1.hour + ":" + time1.minute + ":" + time1.second);
		// new time object with elapsed time constructor
		Time time2 = new Time(555550000);
		System.out.println(time2.hour + ":" + time2.minute + ":" + time2.second);

	}

}
