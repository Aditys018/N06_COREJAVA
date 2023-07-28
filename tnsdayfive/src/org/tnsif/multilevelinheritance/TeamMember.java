package org.tnsif.multilevelinheritance;

public class TeamMember extends ManagerExecutor{
	
	private int BatchName;
	private String TeamName;
	private String TeamProject;
	public int getBatchName() {
		return BatchName;
	}
	public void setBatchName(int batchName) {
		BatchName = batchName;
	}
	public String getTeamNumber() {
		return TeamName;
	}
	public void setTeamNumber(String teamName) {
		TeamName = teamName;
	}
	public String getTeamProject() {
		return TeamProject;
	}
	public void setTeamProject(String teamProject) {
		TeamProject = teamProject;
	}
	@Override
	public String toString() {
		return "TeamMember [BatchName=" + BatchName + ", TeamNumber=" + TeamName + ", TeamProject=" + TeamProject
				+ ", toString()=" + super.toString() + "]";
	}
	
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamMember(int empId, String empName, String organizationName, String ManagerName, String project,int BatchNo,String TeamSubGroups,String TeamProject) {
		super(empId, empName, organizationName, ManagerName, project);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
