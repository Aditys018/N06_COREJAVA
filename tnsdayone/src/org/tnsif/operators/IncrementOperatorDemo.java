//*****************PROGRAM TO DEMONSTRATE ON INCREMENT AND DECREMENT OPERATORS****************


//PREINCREMENT= ++X
// x==3
//++x
//z=x
//hence z=4
//POSTINCREMENT =X++
//x=3
//x++ //3
//z=x
//z=4
package org.tnsif.operators;

public class IncrementOperatorDemo {

	public static void main(String[] args) {
		int x=23,y=6;
		int res1=x++ + ++y; //23 + 7
		System.out.println(res1); //30
		System.out.println(x); //24
		System.out.println(y); //7
		
		int res2=x-- +--y;
		System.out.println(res2); //24 + 6 =30
		System.out.println(x); 
		System.out.println(y);
		

	}

}
