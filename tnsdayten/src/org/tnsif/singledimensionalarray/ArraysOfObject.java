package org.tnsif.singledimensionalarray;

public class ArraysOfObject {

	public static void main(String[] args) {
		Custom arr[] = new Custom[3];
		arr [0]=new Custom (101," Albert Eistein " , 4567890.98);
		arr [1]=new Custom (102," Spongebob " , 45656789.98);
		arr [2]=new Custom (103," SHIN CHAN " , 453456789.98);
		
		for (int i=0; i<3; i++)
		{
			System.out.println(arr[i]. getID() + " " + arr[i].getName() + " " + arr[i].getSalary());
		}
		
	}

}
