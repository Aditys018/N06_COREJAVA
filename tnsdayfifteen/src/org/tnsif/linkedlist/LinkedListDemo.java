package org.tnsif.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer> numberList= new LinkedList<Integer>();
	numberList.add(10);
	numberList.add(12);
	numberList.add(18);
	numberList.add(100);
	numberList.add(132);
	numberList.add(90);
	
	System.out.println(numberList);
	numberList.addFirst(50);
	numberList.addLast(500);
	
	System.out.println(numberList);
	
	System.out.println("FIRST ELEMENT: " + numberList.getFirst());
	System.out.println("LAST ELEMENT: " + numberList.getLast());
	
	numberList.removeFirst();
	numberList.removeLast();
	
	System.out.println(numberList);
	
	
	//iterator 
	//it iterates only in forward directions and we can remove current element
	
	Iterator<Integer> it= numberList.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		//it.remove();
	}
	
	System.out.println(numberList);
	
	
	
	ListIterator<Integer> listIt= numberList.listIterator();
	while(listIt.hasNext())//forward direction
	{
		System.out.println(listIt.next());
	}
	
	
	System.out.println("------------------------------------");
	while(listIt.hasPrevious()) //backward direction
	{
		System.out.println(listIt.hasPrevious());
	}
	
	System.out.println("------------------------------------");
	
	listIt= numberList.listIterator(listIt.previous());
	
	
	
	}
	
	

}
