package zadaci_09_02_2016;

/*
 * Zadatak5
 * MyStringBuilder1 class
 */

public class MyStringBuilder1 {

	private char[] buffer; // char array for easier manipulating with strings
	// constructor with char array
	public MyStringBuilder1(char[] chars) {
		buffer = new char[chars.length];
		System.arraycopy(chars, 0, buffer, 0, chars.length);
	}
	// constructor with string argument
	public MyStringBuilder1(String s) {
		this(s.toCharArray());
	}
	// appends an integer to string object
	public MyStringBuilder1 append(int i) {

		String temp = "";
		while (i > 0) {
			temp = i % 10 + temp;
			i /= 10;
		}
		return new MyStringBuilder1(toString() + temp);
	}
	// appends one stringbuilder object to another
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(toString() + s.toString());
	}

	public String toString() {
		return new String(buffer);
	}
	// returns length of sb object (char array)
	public int length() {
		return buffer.length;
	}
	// returns character at inputed index
	public char charAt(int i) {
		return buffer[i];
	}
	// converts string to lower case
	public MyStringBuilder1 toLowerCase() {
		char[] lower = new char[buffer.length];

		for (int i = 0; i < buffer.length; i++) {
			char old = buffer[i];
			if (old >= 'A' && old <= 'Z') {
				lower[i] = (char) (old - 'A' + 'a');
			} else {
				lower[i] = old;
			}
		}
		return new MyStringBuilder1(lower);
	}
	// returns new sb object with chars between two indexes
	public MyStringBuilder1 substring(int begin, int end) {

		char[] temp = new char[end - begin];
		for (int i = begin; i < end; i++) {
			temp[i - begin] = buffer[i];
		}
		return new MyStringBuilder1(temp);
	}

}
