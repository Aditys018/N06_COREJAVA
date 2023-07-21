//PROGRAM TO DEMONSTRATE BITWISE OPERATORS

//in bitwise& if if ip1=1 ip2=1 then OP=1 others are zero
//in bitwise | if ip1=1 ip2=0 then OP=1 others are zero
//in bitwise ^ if ip1=0 ip2=1 then OP=1 others are zero
//if x=13 and y=9


//A left shift b shortcut formula
//a<<b= a*2^b
//Right Shift
//a>>b= a/2^b
package org.tnsif.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int x=72 , y=12;
		System.out.println(x&y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println(72>>39);
		System.out.println(72<<39);

	}

}
