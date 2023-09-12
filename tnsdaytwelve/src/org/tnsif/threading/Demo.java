package org.tnsif.threading;

public class Demo {

	public static void main(String[] args) {
		System.out.println("In main " + Thread.currentThread());
//		System.out.println("Factorial of 4 " + ThreadingOperations.Getfactorial(4));
//		System.out.println("is 5 prime number? " + ThreadingOperations);
		
		ChildThreadOne t1= new ChildThreadOne();
		t1.start();
		
		ChildThreadTwo t2= new ChildThreadTwo();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("------------------------------------------------------------------");
	}

}
