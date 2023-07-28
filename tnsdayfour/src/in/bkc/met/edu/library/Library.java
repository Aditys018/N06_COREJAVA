//Program to demonstrate on access specifier

package in.bkc.met.edu.library;

public class Library {
	//different access specifier
	
	public String libraryName;
	private long userId;
	String bookName;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name:" + libraryName);
	}
	//private method
	@SuppressWarnings("unused")
	private void displayPrivate()
	{
		System.out.println("User Id: " +userId);
	}
	//default Method 
	void displayDefault()
	{
		System.out.println("Book Name is:" +bookName);
	}
	
	
}
