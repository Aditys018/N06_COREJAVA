package org.tnsif.thiskeyworddemo;
class Team
{
	int size;
	Team(){
		//calling to parameterized constructor
		this(7);
		System.out.println("DEFAULT CONSTRUCTOR:");
	}
	Team (int size)
	{
		System.out.println("PARAMETERIZED CONSTRUCTOR" +size);
	}
}

public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		
		Team t=new Team();

	}

}
