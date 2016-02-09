package zadaci_09_02_2016;

import zadaci_09_02_2016.MyString1;

public class Zadatak1 {
	
	public static void main(String[] args) {
        // MyString1 testing methods
        MyString1 num = MyString1.valueOf(77874542);
        System.out.println(num);
        MyString1 s = new MyString1("ZaDaTaK");
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.equals(new MyString1("ZaDaTaK")));
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(2, 6));
    }

}
