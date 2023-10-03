package org.tnsif.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class UserDefindeListDemo {

	public static void main(String[] args) {
		ArrayList<Student>studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1,"ADITI",92));
		studentList.add(new Student(2,"AIENSTEIN",83));
		studentList.add(new Student(3,"NEWTON",75));
		studentList.add(new Student(4,"JETHALAL",90));
		studentList.add(new Student(5,"BHIDE",63));
		
		
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println("AFTER SORTING " +studentList );

	}

}
