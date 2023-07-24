package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song number:");
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Faded");
			break;
		case 2:
			System.out.println("Different World");
			break;
		case 3:
			System.out.println("Tsunami");
			break;
			
		default :
			System.out.println("Invalid song number");
		}
		s.close();

	}

}
