package org.tnsif.multilevelinheritance;
//Parent class
public class OrganizationExecutor {
	
	private int empId;
	private String empName;
	private String organizationName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	@Override
	public String toString() {
		return "OrganizationExecutor [empId=" + empId + ", empName=" + empName + ", organizationName="
				+ organizationName + "]";
	}
	public OrganizationExecutor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrganizationExecutor(int empId, String empName, String organizationName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.organizationName = organizationName;
	}
	
	
}
