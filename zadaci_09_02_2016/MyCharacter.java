package zadaci_09_02_2016;

/*
 * Zadatak3
 * MyCharacter class
 */

public class MyCharacter {

    private char ch;
    // constructor for MyCharacter object
    public MyCharacter(char ch) {
        this.ch = ch;
    }
    // checking if character is digit
    public static boolean isDigit(char ch) {
        return ch <= '9' && ch >= '0';
    }
    // checking if character is lower case
    public static boolean isLowerCase(char ch) {
        return (ch <= 'z' && ch >= 'a');
    }
    // checking if character is upper case
    public static boolean isUpperCase(char ch) {
        return (ch <= 'Z' && ch >= 'A');
    }
    // checking if character is letter
    public static boolean isLetter(char ch) {
        return (ch <= 'z' && ch >= 'a') ||
                (ch <= 'Z' && ch >= 'A');
    }
    // if char is letter or digit
    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }
    // convert character to upper case
    public static char toUpperCase(char ch) {
        if (isLowerCase(ch)) {
            return (char) (ch - 'a' + 'A');
        } else {
            return ch;
        }
    }
    // convert character to lower case
    public static char toLowerCase(char ch) {
        if (isUpperCase(ch)) {
            return (char) (ch - 'A' + 'a');
        } else {
            return ch;
        }
    }

    public boolean isDigit() {
        return isDigit(ch);
    }

    public boolean isLetter() {
        return isLetter(ch);
    }

    public char getChar() {
        return ch;
    }
    // compares wo char objects
    public int compareTo(MyCharacter ch) {
        return this.ch - ch.getChar();
    }

    public boolean equals(MyCharacter ch) {
        return this.ch == ch.getChar();
    }

}
