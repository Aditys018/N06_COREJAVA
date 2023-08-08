//perform to demonstrate on single dimensional array using compile time input
package org.tnsif.singledimensionalarray;

public class ArraysUsingCompileTime {

	public static void main(String[] args) {
		int arr[]= {56,23,67,99,56,56,87,76};
		System.out.println(arr[5]);
		System.out.println("Array elements are: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[5]);

	}

}
