package org.tnsif.linkedlist;

public class Student implements Comparable <Student>{
	private int RollNo;
	private String Name;
	private float percentage;
	public int getRollNo() {
		return RollNo;            
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public Student(int rollNo, String name, float percentage) {
		super();
		RollNo = rollNo;
		Name = name;
		this.percentage = percentage;
	}
	
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return 0;
		return o.RollNo-RollNo;
	}
	
	
	

}
