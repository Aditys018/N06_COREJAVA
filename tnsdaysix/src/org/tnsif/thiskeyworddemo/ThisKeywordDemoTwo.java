//when cass var. and constructor are same if you try to access tht var. in another method then you will not get o/p

package org.tnsif.thiskeyworddemo;
class Bank
{
	long accountNo;
	Bank (long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		
		Bank b=new Bank(34567890L);
		b.display();
	}

}
