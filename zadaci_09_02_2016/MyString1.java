package zadaci_09_02_2016;

/*
 * Zadatak1
 * MyString1 class
*/

public class MyString1 {

    char[] chars;
    // constructor for MyString object with char array argument
    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }
    // constructor with string argument
    public MyString1(String string) {
		this(string.toCharArray());
	}
    // returns char at inputed index
    public char charAt(int index)  {
        return chars[index];

    }
    // returns length of string (char array)
    public int length() {
        return chars.length;
    }
    // returns substring between two indexes
    public MyString1 substring(int begin, int end) {
        char[] s = new char[end - begin];
        for (int i = begin; i < end; i++) {
            s[i - begin ] = chars[i];
        }
        return new MyString1(s);
    }
    // converts string to all lower case
    public MyString1 toLowerCase() {
        // A = 65
        // a = 97
        char[] lowerCase = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerCase[i] = (char)(chars[i] + 32);
            } else {
                lowerCase[i] = chars[i];
            }
        }
        return new MyString1(lowerCase);
    }
    // check if one string is identical to other
    public boolean equals(MyString1 s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != chars[i]) {
            	return false;
            }
        }
        return true;
    }
    // returns string value of inputed integer
    public static MyString1 valueOf(int i) {
        int length = getCount(i);
        char[] number = new char[length];
        for (int j = length - 1; j >= 0; j--) {
            number[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new MyString1(number);
    }
    // returns number of chars in integer inputed
    private static int getCount(int i) {
        int length = 0;
        while (i > 0) {
            i /= 10;
            length++;
        }
        return length;
    }
    // returns string for printing
    public String toString() {
		return new String(chars);
	}

}
