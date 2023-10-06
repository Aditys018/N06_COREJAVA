package org.tnsif.collections;

import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue= new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(80);
		queue.add(97);
		queue.add(103);
		
		System.out.println("FIRST ELEMENT: " + queue.getFirst());
		System.out.println("LAST ELEMENT: " + queue.getLast());
		System.out.println(queue.remove() + " REMOVED ");
		
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
		}

}
