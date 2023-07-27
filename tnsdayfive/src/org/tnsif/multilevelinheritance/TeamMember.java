package org.tnsif.multilevelinheritance;

public class TeamMember extends ManagerExecutor{
	
	private int BatchName;
	private String TeamNumber;
	private String TeamProject;
	public int getBatchName() {
		return BatchName;
	}
	public void setBatchName(int batchName) {
		BatchName = batchName;
	}
	public String getTeamNumber() {
		return TeamNumber;
	}
	public void setTeamNumber(String teamNumber) {
		TeamNumber = teamNumber;
	}
	public String getTeamProject() {
		return TeamProject;
	}
	public void setTeamProject(String teamProject) {
		TeamProject = teamProject;
	}
	@Override
	public String toString() {
		return "TeamMember [BatchName=" + BatchName + ", TeamNumber=" + TeamNumber + ", TeamProject=" + TeamProject
				+ ", toString()=" + super.toString() + "]";
	}
	
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamMember(int empId, String empName, String organizationName, String ManagerId, String project,int BatchName,String TeamNumber,String TeamProject) {
		super(empId, empName, organizationName, ManagerId, project);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
