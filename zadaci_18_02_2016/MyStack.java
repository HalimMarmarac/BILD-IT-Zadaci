package zadaci_18_02_2016;

import java.util.ArrayList;

class MyStack implements Cloneable {
	// list of objects (stack)
	private ArrayList<Object> list = new ArrayList<>();
	// returns true if list is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
	// returns size of the list
	public int getSize() {
		return list.size();
	}
	// peek size of the list
	public Object peek() {
		return list.get(getSize() - 1);
	}
	// pop object from list
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	// push object to list
	public void push(Object o) {
		list.add(o);
	}

	public String toString() {
		return "stack: " + list.toString();
	}
	// returns duplicate of list
	protected Object clone() {
		MyStack myStack = null;
		try {
			myStack = (MyStack) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		myStack.list = new ArrayList<>(list);
		return myStack;
	}

}
