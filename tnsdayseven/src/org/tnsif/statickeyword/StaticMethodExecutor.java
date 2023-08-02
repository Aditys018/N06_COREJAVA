//Program to demonstrate on static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	String str="BKC";
	static float percentage=99.8f;
 //static method
//if any method is outside the main function and if you want to access the  main function then make it static
static void displayScore(int score)
	{
		//we can't use non static variable inside static method
		System.out.println(percentage);
		
		System.out.println("SCORE IS: " +score);
	}
	public static void main(String[] args) {
		displayScore(56);

	}

}
