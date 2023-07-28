package org.tnsif.multilevelinheritance;

public class MultipleInheritanceExecutor {

	public static void main(String[] args) {
		TeamMember tm= new TeamMember(18,  "Aditi",  "Microsoft",  "Aroud", 6, 917, "Project_Bahama") {
			
			System.out.println(tm);
	}

}
}
