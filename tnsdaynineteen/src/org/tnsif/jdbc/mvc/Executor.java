package org.tnsif.jdbc.mvc;

import java.util.List;

public class Executor {

	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		List<Student> studList;
		try {
			studList=service.getAllStudents();
			
		}catch {
			
		}
		
	}

}
