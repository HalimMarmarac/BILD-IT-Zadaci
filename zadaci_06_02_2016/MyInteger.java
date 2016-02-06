package zadaci_06_02_2016;

/*
 * Zadatak2
 * MyInteger class.
 */

public class MyInteger {

    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    // checking if number is even
    public boolean isEven() {
        return value % 2 == 0;
    }
    // checking if number is odd
    public boolean isOdd() {
        return !isEven();
    }
    // checking if number is prime
    public boolean isPrime() {
    	 if((value > 2) && ((value & 1) == 0))
  	       return false;
  	    for(int i = 3; i * i <= value; i += 2)
  	        if (value % i == 0) {
  	            return false;
  	        }
  	    return true;
  	}

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        double range = Math.sqrt(value);

        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
    // checking is specified value is even
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }
    // checking is specified value is odd
    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }
    // checking is specified value is prime
    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }
    
    public boolean equals(int value) {
        return this.value == value;
    }
    // checking is specified values are equal
    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    // converts an array of numeric characters to int value
    public static int parseInt(char[] value) {
        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {

            valueDouble += Math.pow(10, toPower--) * (aValue - '0');
        }

        return (int)valueDouble;
    }
    // converts string number to char array and then we use pareseInt(char[]) to convert is to int
    public static int parseInt(String value) {
        return MyInteger.parseInt(value.toCharArray());
    }

}
