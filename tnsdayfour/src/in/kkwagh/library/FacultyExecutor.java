//Program to demonstrate on access specifier
//driver class

package in.kkwagh.library;
import in.bkc.met.edu.library.Library;
public class FacultyExecutor {

	public static void main(String[] args) {
	Library l=new Library();
	l.libraryName="Bhujbal Knowledge city" ; 
	l.displayPublic();
	
	
	
	//userId and displayPrivate () method is private so, we can't access into another package or class 
	//only we can access inside the same class
	//l.userId=1234566L;
	//l.displayPrivate();
	
	/* bookName and displayDefault () method is default 
	 we can't access into another package only we can access it within the same package*/
	//l.bookName;
	//displayDefault();
	
}
}
