package zadaci_09_02_2016;

import zadaci_09_02_2016.MyString2;

public class Zadatak2 {

	public static void main(String[] args) {
		// MyString2 testing methods
		MyString2 s = new MyString2("Testing...");
		System.out.println(s.toChars());
		System.out.println(s.substring(4));
		System.out.println(s.compare("Testing"));
		System.out.println("Value of false changed to uppercase = " + (MyString2.valueOf(false).toUpperCase().toString()));
		System.out.println("Value of true = " + (MyString2.valueOf(true).toString()));

	}
}
