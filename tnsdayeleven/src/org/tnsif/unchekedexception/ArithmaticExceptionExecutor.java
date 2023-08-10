package org.tnsif.unchekedexception;

import java.util.Scanner;

public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contains with exception code
		try {
		System.out.println(x/y);
		}
		//catch block is used to handle that exception
		catch (Exception e)
		{
			System.out.println("EXCEPTION HANDLED: " + e);
		}
	}

}
