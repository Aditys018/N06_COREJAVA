//program to demonstrate on arrays of objects

package org.tnsif.singledimensionalarray;

public class Custom {
	private int ID;
	private String Name;
	private double Salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Custom(int iD, String name, double salary) {
		super();
		ID = iD;
		Name = name;
		Salary = salary;
	}
	
	
	
	
}
