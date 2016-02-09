package zadaci_09_02_2016;

import zadaci_09_02_2016.MyStringBuilder1;

public class Zadatak5 {

	public static void main(String[] args) {
		// testing StringBuilder1 methods
		MyStringBuilder1 s = new MyStringBuilder1("StringBuilder test");
		System.out.println(s.toString());
		s = s.append(1);
		System.out.println(s);
		s = s.append(new MyStringBuilder1(" today."));
		System.out.println(s);
		System.out.println("lowercase -> " + s.toLowerCase());
		System.out.println("substring 0 13: " + s.substring(0, 13));
		System.out.println("length = " + s.length());
		System.out.println("char at 6: " + s.charAt(6));
	}

}
