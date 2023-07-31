//program to demonstrate on :
//this keyword is used to refer current instance of the class 

package org.tnsif.thiskeyworddemo;

class Account
{
	long accountNo;
	void stedata (long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}


//driverClass
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a=new Account();
		a.stedata(56789034567890L);
		a.display();
		

	}

}
