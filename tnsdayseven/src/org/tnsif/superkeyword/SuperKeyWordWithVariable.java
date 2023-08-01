package org.tnsif.superkeyword;
class Building{
	int floors=23;
	String name="Ganraj-Astha";
}
class Flat extends Building{
	String name="Aditi Shinde";
	
	void print() {
		//if parent class and child class variabe are same and if you want to access 
		//parent class variable inside child class, use super.variablename
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeyWordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		System.out.println(f.name);
		f.print();

	}

}
