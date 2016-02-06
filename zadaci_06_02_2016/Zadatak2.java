package zadaci_06_02_2016;

import zadaci_06_02_2016.MyInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		// new integers objects
		MyInteger num1 = new MyInteger(7);
		MyInteger num2 = new MyInteger(7);
		// checking if it's odd, even and prime
		System.out.printf("Number 1 = %d   isPrime: %b  isOdd: %b  isEven %b\n", num1.getValue(), num1.isPrime(),
				num1.isOdd(), num1.isEven());
		System.out.printf("Number 2 = %d   isPrime: %b  isOdd: %b  isEven %b\n", num2.getValue(), num2.isPrime(),
				num2.isOdd(), num2.isEven());
		// checking if the integers are equal
		System.out.printf("Num 1 == Num 2: %b\n", num1.equals(num2));
		// converting string to integer
		System.out.printf("Parse int 525 string value == %d\n", MyInteger.parseInt("525"));
		// converting char array to integer
		System.out.printf("Parse int 777 char array value == %d\n", MyInteger.parseInt("777".toCharArray()));

	}

}
