package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		//we can't create the obj. for abstract class
		CheeseCornSandwich s=new CheeseCornSandwich();
		s.prepare();
		s.showRecipe();
	}

}
