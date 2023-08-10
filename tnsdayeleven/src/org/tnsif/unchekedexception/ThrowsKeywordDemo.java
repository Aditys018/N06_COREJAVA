package org.tnsif.unchekedexception;

public class ThrowsKeywordDemo {
	static void isEligible (int age, int weight)
	{
		if (age>18 && weight>50)
		{
			System.out.println("PERSON IS ELIGIBLE TO DONATE THE BLOOD ");
		}
		else {
			throw new ArithmeticException("CRITERIA IS NOT SATISFIED");
		}
	}
	public static void main(String[] args) {
		try {
		isEligible(19,30);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
