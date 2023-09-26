//program to demonstrate homogeneous list

package org.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList <Integer>();
		System.out.println("SIZE: " + intList.size());
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
