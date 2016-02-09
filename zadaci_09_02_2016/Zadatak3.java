package zadaci_09_02_2016;

import zadaci_09_02_2016.MyCharacter;

public class Zadatak3 {

	public static void main(String[] args) {
		// MyCharacter class testing methods
		MyCharacter ch = new MyCharacter('X');
		System.out.println("ch = " + ch.getChar());
		System.out.println("Is a letter: " + ch.isLetter());
		System.out.println("Is a digit: " + ch.isDigit());
		System.out.println("X -> " + ch.toLowerCase('X'));
		System.out.println("b -> " + ch.toUpperCase('b'));
		System.out.println("X is upper case -> " + ch.isUpperCase('X'));
	}

}
