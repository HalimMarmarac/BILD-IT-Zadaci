package zadaci_09_02_2016;

public class MyString2 {

	char[] chars;
	// constructor with char array 
	public MyString2(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}
	// constructor with string
	public MyString2(String s) {
		this(s.toCharArray());
	}
	// compares to strings by length
	public int compare(String s) {
		int limit = Math.min(s.length(), length());
		char[] chArray = s.toCharArray();
		int i = 0;
		while (i < limit) {
			char ch1 = charAt(i);
			char ch2 = chArray[i];
			if (ch1 != ch2) {
				return ch1 - ch2;
			}
			i++;
		}
		return length() - s.length();
	}
	// returns char at inputed index
	public char charAt(int index) {
		return chars[index];
	}
	// returns length of string
	public int length() {
		return chars.length;
	}
	// substring from inputed index to end of string
	public MyString2 substring(int begin) {
		char[] s = new char[chars.length - begin];
		for (int i = begin; i < chars.length; i++) {
			s[i - begin] = chars[i];
		}
		return new MyString2(s);
	}
	// converts string to all upper case
	public MyString2 toUpperCase() {
		char[] temp = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z') {
				temp[i] = (char) (chars[i] - 32);
			} else {
				temp[i] = chars[i];
			}
		}
		return new MyString2(temp);
	}
	// returns char array
	public char[] toChars() {
		return chars;
	}

	public String toString() {
		return new String(chars);
	}

	public static MyString2 valueOf(boolean b) {
		return new MyString2((b) ? "true" : "false");
	}

}
