package org.tnsif.singleinheritance;

public class Student extends Citizen{

	
	private int rollno;
	private String collegeName;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String city, int pincode, String area, long aadharNo , int rollNo, String CollegeName) {
		super(city, pincode, area, aadharNo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + rollno + ", CollegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
