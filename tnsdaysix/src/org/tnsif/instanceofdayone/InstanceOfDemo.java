/*if parent class and child class variable name are same in such case use super.variableName
 *  to access that variable of parent class inside the child class */

package org.tnsif.instanceofdayone;
class RBI 
{
	protected String ifscCode;
}
class SBI extends RBI
{
	public SBI () {
		super.ifscCode ="RBI0NGPA01";
		 String ifscCode="SBIN0002161";
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
	}
	
}
//program to demonstrate instance of operator

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
	}

}
