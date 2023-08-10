package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredential {
		Scanner s =new Scanner(System.in);
		String userid=s.nextLine();
		String password =s.nextLine();
		
		try {
		if (userid.equals("adityssh.in@gmail.com") && password.equals("PassADT"))
		{
			System.out.println("=====================CREDENTIALS ARE MATCHED!!=========================");
		}
		
		else
		{
			throw new LoginCredential("====================Invalid Credentials=======================");
		}
		
	}
	
	catch(LoginCredential e)
	{
		System.out.println("EXCEPTION HANDLED " + e );
	}

}
}
