package org.tnsif.hashtabledemo;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// unordered, unsorted map
		Hashtable<String, String> persons = new Hashtable<String, String>();

		persons.put("aniket@gmail.com", "Aniket");
		persons.put("nidhi@gmail.com", "Nidhi");
		persons.put("lisha@gmail.com", "Lisha");
		persons.put("dhruvi@gmail.com", "Dhruvi");
		System.out.println(persons);

		persons.put("lisha@gmail.com", "Lisha Sharma");
		System.out.println(persons);
		// null keys and values not allowed
		// persons.put("abc@gmail.com",null);
		// persons.put(null,"abc");
		// persons.put(null,null);
		System.out.println(persons);
		
		System.out.println(persons.containsKey("lisha@gmail.com"));
		
		System.out.println(persons.containsValue("Lisha"));
		System.out.println("-------------------------------");
		//Retrieve only values
		Enumeration<String> em= persons.elements();
		while(em.hasMoreElements())
			System.out.println(em.nextElement());

		System.out.println("-------------------------------");
		System.out.println(persons.get("lisha@gmail.com"));
		
		System.out.println("-------------------------------");
		Enumeration<String> keys= persons.keys();
		while(keys.hasMoreElements())
		{
			String k=keys.nextElement();
			System.out.println(k+" : "+persons.get(k));
		}
		
		
		System.out.println("-------------------------------");
		Set<Entry<String, String>> dict=persons.entrySet();
		System.out.println(dict);
		Iterator<Entry<String, String>> it=dict.iterator();
		while(it.hasNext())
		{
			Entry<String, String> rec=it.next();
			System.out.println(rec.getKey()+" : "+rec.getValue());
		}
		System.out.println("-------------------------------");
		
	}
}