//program to demonstrate on array using runtime input values and to find largest element in an array


package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of array elements: ");
		int n=s.nextInt();
		//array declaration
		int arr[]= new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.print(arr [i] +  " ");
			
		}
		int max=arr[0];
		for (int i=0; i<n; i++)
		{
			if (arr [i]>max)
			{
				max = arr [i];
			}
		}
		System.out.println("LARGEST ELEMRENT IS:" + max);
		Arrays.sort(arr);
		System.out.println("Sorted elements are: ");
		for(int i:arr)
		{
			
			System.out.println(i + " ");
		}
		
	}

}
