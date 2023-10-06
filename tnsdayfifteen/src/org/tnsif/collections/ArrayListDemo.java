//program to demonstrate homogeneous list

package org.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ArrayListDemo {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList <Integer>();
		System.out.println("SIZE: " + intList.size());
		System.out.println("is 50 present?" + intList);
		intList.add(10);
		intList.add(40);
		intList.add(80);
		intList.add(30);
		intList.add(1);
		
		//intList.add("Hello"); gives compile time error as it will only sort homogeneous list
		
		System.out.println(intList);
		intList.add(2,19);
		System.out.println(intList);
		
		Collections.sort(intList);
		
		intList.size();
		System.out.println("SIZE: " + intList.size());
		System.out.println("40 is present at which position? " + intList.indexOf(40));
		System.out.println("400 is present at which position? " + intList.indexOf(400));
		
		System.out.println("ELEMENT AT 4 POSITION IS REMOVED" );
		
//		intList.remove(40);
//		System.out.println(intList);    IndexOutofbound exception
		
		intList.remove("Remove 1: " + intList.indexOf(7));
		
		Iterator<Integer> it= intList.iterator();
		while(it.hasNext()) {
			int no = it.next();
			System.out.println(no+"is " + (no %2 ==0 ? "EVEN" : "ODD"));
		}
	
		
		Collections.sort(intList);
		System.out.println("____________AFTER SORTING________________");
		System.out.println(intList);
		
		Collections.reverse(intList);
		System.out.println("____________AFTER REVERSING_______________");
		System.out.println(intList);
		
		intList.clear();
		System.out.println("IS LIST EMPTY? " + intList.isEmpty());
		
		
		
		
		
	} 

}
