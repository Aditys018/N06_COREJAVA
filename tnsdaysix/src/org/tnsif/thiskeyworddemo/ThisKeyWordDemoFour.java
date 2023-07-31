package org.tnsif.thiskeyworddemo;
class Director{
	String name;
	void print()
	{
		this.name="SUNIL DATT";
		display (name);
	}
	void display (String name)
	{
		System.out.println("DIRECTOR NAME IS:" +name);
	}
}
public class ThisKeyWordDemoFour {

	public static void main(String[] args) {
		Director d=new Director();
		d.print();
		

	}

}
