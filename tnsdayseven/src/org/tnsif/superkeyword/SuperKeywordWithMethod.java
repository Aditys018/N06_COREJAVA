package org.tnsif.superkeyword;
class MET{
	
	String ownerName="Mr.Chagan Bhujbal";
	void displayName() {
		
		System.out.println("Owner is:" + ownerName);
	}
}


class BKC extends MET{
	String ownerName="Miss. Shefali bhujbal";
	void displayName() {
		
		//if parent class and child class method are name are same ,and if you want to access that method inside
		//child class,then use
		//super.methodName();
		super.displayName();
		System.out.println("Owner is:" + ownerName);
	}
	
}


public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
		b.displayName();
	}

}
