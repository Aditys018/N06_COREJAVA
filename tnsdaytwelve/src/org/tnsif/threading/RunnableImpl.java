package org.tnsif.threading;

public class RunnableImpl {

	public class Runnableimpl implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+"Hello");
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}

		}

	}
}