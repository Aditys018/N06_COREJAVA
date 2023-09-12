package org.tnsif.threading;

public class ChildThreadOne extends Thread {
	public void run() {
		System.out.println("Factorial of 5 is " + ThreadingOperations.getFactorial(8));
	}

}
