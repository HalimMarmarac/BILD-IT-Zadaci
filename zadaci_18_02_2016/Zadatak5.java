package zadaci_18_02_2016;

import zadaci_18_02_2016.MyStack;

public class Zadatak5 {

	public static void main(String[] args) {
		// creating stack with 5 nums
		MyStack stack1 = new MyStack();
		for (int i = 0; i < 5; i++) {
			stack1.push(i);
		}
		// creating second stack (duplicate/clone of first one)
		MyStack stack2 = (MyStack) stack1.clone();

		// display size of stacks and stacks
		System.out.println("stack1 size = " + stack1.getSize());
		System.out.println("stack2 size = " + stack2.getSize());
		System.out.println("stack1: " + stack1);
		System.out.println("(Cloned stack) stack2: " + stack2);
	}

}
