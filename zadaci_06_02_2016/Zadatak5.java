package zadaci_06_02_2016;

import zadaci_06_02_2016.StackOfIntegers;

public class Zadatak5 {
	
	// method check if number is prime
	public static boolean isPrime(int n) {
	    if((n > 2) && ((n & 1) == 0))
	       return false;
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) {
	            return false;
	        }
	    return true;
	}

	public static void main(String[] args) {

		System.out.println("Prime numbers under 120 are: ");

		// creating stack of integers (prime numbers)
		// stack works like first in last out
		StackOfIntegers stack = new StackOfIntegers(20);
		// pushing prime numberst to stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		// pop prime numbers from stack and print them
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
