package org.tnsif.finalkeyword;
public class FinalVariable{
	
	
	/*final variable must be initialized during declaration*/
	final float SALARY=67890F;
	void print(){
		/*we can't change the value of final variable*/
		System.out.println("Salary is:" +SALARY);
	}
}


