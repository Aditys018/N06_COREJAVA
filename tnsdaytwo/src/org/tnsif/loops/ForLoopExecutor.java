package org.tnsif.loops;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1 ; i<=n ;i++)
		{
			for(int j=1 ;j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		s.close();
	}

}
