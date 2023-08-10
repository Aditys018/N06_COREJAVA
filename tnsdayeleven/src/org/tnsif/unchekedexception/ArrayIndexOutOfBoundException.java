package org.tnsif.unchekedexception;


public class ArrayIndexOutOfBoundException {

	
		static void display (int arr[])
		{
			try {
				System.out.println(arr[3]);
				
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("EXCEPTION HANDLED " + e);
			}
			finally
			{
				System.out.println("FINALLY BLOCK IS ALWAYS EXECUTED ");
			}
			
			System.out.println("ANY STATEMENT OUT OF THE BLOCK IS ALWAYS " + "EXECUTED");
		}
		
		public static void main (String [] args)
		
		{
			int arr[]= {12,3,9};
			display(arr);
			
		}

	}


