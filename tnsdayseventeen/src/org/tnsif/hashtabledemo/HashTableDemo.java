package org.tnsif.hashtabledemo;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> persons = new Hashtable<String, String>();
		//if we insert the same values here then the current value will be replaced here
		//if we insert a null value here then we will get the nullpointerException
		
		persons.put("adt@gmail.com" , "ADT");
		persons.put("aadi@gmail.com" , "Aadi");
		persons.put("aar@gmail.com" , "Aarti");
		persons.put("aan@gmail.com" , "Aanchal");
		persons.put("arp@gmail.com" , "Arpit");
		
		System.out.println(persons);
		
		persons.put("arp@gmal.com" , "Arpit Sinha");
		System.out.println(persons);
		
//		persons.put( null, "abc"); //exception
//		System.out.println(persons);
//		
		System.out.println(persons.containsKey("arp@gmail.com"));
		System.out.println(persons.containsKey("Arpit"));
		
		Enumeration<String> em= persons.elements();
		while(em.hasMoreElements())
			System.out.println(em.nextElement());
		
		System.out.println("----------------------------------------------");
		System.out.println(persons.get("aar@gmail.com"));
		
		System.out.println("--------------------------------------------------");
		
		Enumeration<String> keys = persons.keys();
		while(keys.hasMoreElements())
		{
			String k = keys.nextElement();
			System.out.println(k+ ":" + persons.get(k));
		}
		
		System.out.println("------------------------------------------------------");
		Set dictionaries= persons.entrySet();
		
		
		
		
	}

}
