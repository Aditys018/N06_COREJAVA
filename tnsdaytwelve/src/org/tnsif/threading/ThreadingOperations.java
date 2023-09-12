package org.tnsif.threading;

public class ThreadingOperations {

	
		public static int getFactorial (int no)
		{
			int fact=1;
			for (int i=1;i<=no;i++)
				fact=fact*i;
			return fact;
		}
		public static boolean isPrime(int no) {
			boolean flag=true;
			for(int i=2;i<no/2;i++)
			{
				if (no % i==0)
				{
					flag=false;
					break;
				}
			}
			System.out.println("In isprime method(): " + Thread.currentThread());
			return flag;
		}

	}


