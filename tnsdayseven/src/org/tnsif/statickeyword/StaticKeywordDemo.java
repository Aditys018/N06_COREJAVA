package org.tnsif.statickeyword;
class Employee{
	
	private int empID;
	private String name;
	private static String companyName="TNSIF";
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	
	void display() {
		
		System.out.println("EMPLOYEE ID" +this.getEmpID()  +"EMPLOYEE NAME" +this.getName()+ "" + "companyName" +"" );
	}
	
}

public class StaticKeywordDemo {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpID(1);
		e.setName("Aditi");
		e.setCompanyName("MICROSOFT");
		e.display();

		
		Employee e1=new Employee();
		e1.setEmpID(2);
		e1.setName("Aditya");
		e1.setCompanyName("MICROSOFT");
		e1.display();

	}

}
