package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccType("Saving Account");
		h.setAccountNo(345678902345L);
		h.setAtmCardNo(4567893456789L);
		h.setPinNo(12213456);
		
		
		
		//below line will call to toString() method
		System.out.println(h);
		System.out.println("Account No is: " +h.getAccountNo());
		

	}

}
