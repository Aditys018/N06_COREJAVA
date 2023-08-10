package org.tnsif.unchekedexception;

public class CatchBlockDemo {

	static void print (int arr[]) {
	try {
		System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch (NullPointerException e)
	{
		System.out.println(e);
	}
	catch (Exception e)
	{
		System.out.println("EXCEPTION HANDLED " +e);
	}
}
	public static void main(String[] args) {
		int arr[] = {12,3,14};
		print(arr);

	}

}
