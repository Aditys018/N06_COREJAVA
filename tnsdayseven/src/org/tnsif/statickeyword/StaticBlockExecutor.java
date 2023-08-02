//program to demonstrate on static block

package org.tnsif.statickeyword;
public class StaticBlockExecutor {

	String str;
	static float Salary;
	
	static{
		
		Salary=4567890.09f;
	}
	static void print()
	{
	System.out.println(Salary);
	}
	
	public static void main(String[] args) {
		print();
		/*main function is static and hence it call static block method by default*/
	}

}
