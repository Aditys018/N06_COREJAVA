//runnable is a functional interface(interface having only one abstract method)
//functional interface can be instantiated using lambda expression which is a arrow function
//every thread have a same priority i.e. 5
		
		
package org.tnsif.threading;

public class RunnableDemo {

	public static void main(String[] args)throws InterruptedException {
		
		//first way of using implementable class (old way/traditional way)
		Runnable impl=(Runnable) new RunnableImpl();
		Thread threadOne = new Thread(impl, "ChildThread1");
		
		
		//second way = anonymous class
		
		Runnable obj = new Runnable() {
			@Override
			public void run() {
				char ch = 'A';
				for(int i=1;i<=26;i++,ch++)
					System.out.println(Thread.currentThread().getName()+" : " +ch);
				try {
					Thread.sleep(400);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread threadTwo=new Thread(obj, "ChildThread");
		
		Runnable objOne=()->
		{
			for(int i=1000;i<=1050;i++)
			{
				System.out.println(Thread.currentThread().getName() + " : " + i);
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread threadThree=new Thread(objOne, "ChildThread3");
		
		Thread threadOne1 = null;
		threadOne1.start();
		threadTwo.start();
		threadThree.start();
		
		Thread.sleep(1200);
		System.out.println("-----------------------------");
		
	}

}
