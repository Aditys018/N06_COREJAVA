package org.tnsif.multilevelinheritance;

public class ManagerExecutor extends OrganizationExecutor {
	
	private int managerId;
	private String Project;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	}
	@Override
	public String toString() {
		return "ManagerExecutor [managerId=" + managerId + ", Project=" + Project + ", toString()=" + super.toString()
				+ "]";
	}
	public ManagerExecutor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManagerExecutor(int empId, String empName, String organizationName,String ManagerId , String project) {
		super(empId, empName, organizationName);
		this.managerId= managerId;
		this.Project=Project;
	}
	
	
	
	

}
