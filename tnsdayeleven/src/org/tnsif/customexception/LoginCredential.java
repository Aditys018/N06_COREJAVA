//program to demonstrate custom exception
/*to use custom exception extends an exception class (parent)*/
package org.tnsif.customexception;

public class LoginCredential extends Exception {
	
	private String str;
	
	//generate getters and setters

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "] ";
	}
	
	

}
