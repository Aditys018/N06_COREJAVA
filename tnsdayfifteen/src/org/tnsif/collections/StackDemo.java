package org.tnsif.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack <Integer> st = new Stack<Integer>();
		st.add(10);
		st.add(80);
		st.add(97);
		st.add(103);
		st.add(204);
		st.add(404);
		
		System.out.println("SIZE OF THE STACK: " + st.size());
		System.out.println("ELEMENT TO BA REMOVED FIRST: " + st.peek());
		System.out.println("----------------------------------------");
		

		

	}

}
