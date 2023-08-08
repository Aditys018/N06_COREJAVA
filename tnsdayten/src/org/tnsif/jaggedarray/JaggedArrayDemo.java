package org.tnsif.jaggedarray;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//declaration of jagged array
		int arr [] [] =new int [6] [ ];
		
		arr [0] =new int  [1];
		arr [1] =new int  [2];
		arr [2] =new int  [3];
		arr [3] =new int  [4];
		arr [4] =new int  [5];
		arr [5] =new int  [6];
		
		for(int i=0; i <6; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr [i] [j] =s.nextInt();
			}
		}
		for(int i=0; i <6; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr [i] [j] + "  ");
				
			}
			
			System.out.println( );
		}
		

	}

}
