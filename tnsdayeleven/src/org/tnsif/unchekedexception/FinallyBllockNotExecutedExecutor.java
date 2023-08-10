package org.tnsif.unchekedexception;

public class FinallyBllockNotExecutedExecutor {

	
		static void display(int arr[])
		{
			try {
				System.out.println(arr[3]);
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e);
			}
			
			finally {
				
				System.out.println(" FINALLY BLOCK IS EXECUTED ");
			}
			System.out.println("ANY STATEMENT OUT OF THE BLOCK IS ALWAYS " + "EXECUTED");
		}
		

	
	public static void main1 (String[] args){
		int arr[] = {76,89,52};
		display (arr);	
	}


}
