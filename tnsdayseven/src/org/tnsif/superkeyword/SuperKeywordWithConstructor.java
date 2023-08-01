package org.tnsif.superkeyword;
class Google{
	
	String CEO;
	public Google(String CEO) {
		
		System.out.println("DEFAULT CONSTRUCTOR:" + CEO);
	}
	
	
}
class Gmail extends Google{
	
	String userId;
	 public Gmail(String CEO, String userId) {
		 
		 super(CEO);
		 this.userId= userId;
		 System.out.println(userId);
	 }
	public void displayGmail() {
		
		
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		
		Gmail g= new Gmail("SUNDAR PICHAI", "avds@gmail.com");
		g.displayGmail();

	}

}
