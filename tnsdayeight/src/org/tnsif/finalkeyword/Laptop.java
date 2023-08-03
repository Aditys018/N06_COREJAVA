package org.tnsif.finalkeyword;
//program to demonstrate on final method
//parent class


public class Laptop {
	final String processor="Intel I5";
	//final method
	/*we can,t override final method*/
	//parent class
	
	final void display()
	{
		System.out.println(processor);
	}
}
