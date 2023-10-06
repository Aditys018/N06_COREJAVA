package org.tnsif.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue <Integer> queue= new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(80);
		queue.add(97);
		queue.add(103);
		System.out.println("Element to be emoved first: " + queue.peek());
		System.out.println(queue.remove()+ "REMOVED");
		System.out.println("-------------------------------------------");
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
	}

}
