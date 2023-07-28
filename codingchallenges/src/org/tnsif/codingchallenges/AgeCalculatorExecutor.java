/*Ask a user for their birthYear encoded as two digits(like"03") and for the current year also encoded as two digits(like"23")
 * write a program to find user's current age in years*/

package org.tnsif.codingchallenges;

import java.util.Scanner;



public class AgeCalculatorExecutor {
	
	void ageCalculator(int BirthYear, int CurrentYear) {
		if (CurrentYear>BirthYear)
			System.out.println(CurrentYear-BirthYear);
		else
		System.out.println((100-BirthYear)+CurrentYear);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the birth year and current Year: ");
		int BirthYear=s.nextInt();
		int CurrentYear=s.nextInt();
		s.close();

	}

}
