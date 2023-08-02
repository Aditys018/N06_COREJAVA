package org.tnsif.polymorphism;

public class MethodOverridingExecutor {

static class ChiefMinister
{
	static void corruption (String str1 , float amount1) {
		
		System.out.println(str1 + "AMOUNT OF CORRUPTION" + amount1);
	}
}
static class MLA extends ChiefMinister{
	
	static void corruption (String str2 , float amount2 )
	{
		System.out.println(str2 + "");
	}
}

	public static void main(String[] args) {
		

	}

}
