//Syntax= (expression) ? True:False;
//example = (num %2 ==0)? "Even" : "odd" ;

package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result =(num%2 ==0) ? "Even" :"Odd";
		System.out.println("Result is: " +result);
		s.close();

	}

}
