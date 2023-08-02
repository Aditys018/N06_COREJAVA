//Method overloading

package org.tnsif.polymorphism;
  class galaxy{
	  static String ShowSubPlanet(String str1, String str2)
	  {
		  return str1+ " is a part of " +str2;
	  }
	  static String ShowSubPlanet(String str1, String str2, String str3)
	  {
		return str1+ " is a part of  " +str2 + " Also a part of " +str3 ;
		  
	  }
  }
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println(galaxy.ShowSubPlanet("EARTH", "SOLAR SYSTEM"));
		System.out.println(galaxy.ShowSubPlanet("Earth", "SOLAR SYSTEM","GALAXY"));
	
		
	}

}
