package org.tnsif.jdbc.mvc;

public interface IsStudentService {
	void addStudent(Student student);
	
	List<Student> getAllStudent;
	
	List<Student> getStudentByPer(float value);
	
	List<Student> getStudentsNameStartsWith(String str);
	
	int deleteAllStudents();
	
	int 

}
