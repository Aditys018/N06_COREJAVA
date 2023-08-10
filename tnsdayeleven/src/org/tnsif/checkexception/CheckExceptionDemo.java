
package org.tnsif.checkexception;

import java.io.FileInputStream;

public class CheckExceptionDemo {

	public static void main(String[] args) {
		try {
			
		
		FileInputStream f=new FileInputStream("C:\\Users\\dell\\Favorites\\Downloads");
		System.out.println("FILE EXISTS");
		
		}
		catch(Exception c)
		{
			System.out.println("EXCEPTION HANDLED: " + c );
		}

	}

}
