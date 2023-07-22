//Program to demonstrate on userInput

//Scanner class
//for different kind of variables we can use scanner class like this=
//int num=s.nextInt();
//float percentage=s.nextfloat();
//char c=s.next().charAt(0);
//use of scanner class= to receive user input and parse them into primitive
//data types such as int, double or default String
package org.tnsif.tnsdayone;

import java.util.Scanner;

public class UserinputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter a string:");
		String str1=s.nextLine();
		System.out.println("String is: "+str1);
		s.close();		
	}

}
