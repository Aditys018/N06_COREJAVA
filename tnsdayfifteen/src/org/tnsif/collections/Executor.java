/*Arraylist supresses raw data */
package org.tnsif.collections;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executor {

	@SuppressWarnings({ "unused", "unchecked" }) 
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List listOne = new ArrayList();
		listOne.add(10);
		listOne.add("Hello");
		listOne.add(false);
		listOne.add(new Date());
		System.out.println(listOne);
		
		Collections.sort(listOne); //as we cannot compare heterogeneous list it will throw an exception ClassCastException
		}

}
