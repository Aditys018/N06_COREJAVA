/*Darshan is very much interested in gardening and hence he plants more trees in his garden he plants 
 * trees in a rectangular fashion with the order of rows and columns and numbers the trees in row wise order. 
 * He planted a Mango tree in the first row first column and last column so, given the tree(t) number and row 
 * and column number(n) your task is to find out weather the given tree is a Mango tree or not 
 * 
 * n value=5 and t value=11*/


package org.tnsif.codingchallenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n, int t){
		if(t%n==0 || t%n==1 || t<=n)
			System.out.println("Mango tree!");
		else
			System.out.println("Not a mango tree!");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("ENTER A VALUE OF n AND t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		s.close();
		
		

	}

}
