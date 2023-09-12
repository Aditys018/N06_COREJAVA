package org.tnsif.threading;

public class ChildThreadTwo extends Thread {
	public void run() {
		System.out.println("is 5 prime number? " + ThreadingOperations.isPrime(8));
}
}