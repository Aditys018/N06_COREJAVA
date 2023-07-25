//ACCESS SPECIFIERS:
//PUBLIC:OPEN TO ALL
//PRIVATE:NOT OPEN TO ALL
//PROTECTED: EVERYONE CAN ACCESS BUT IT IS PROTECTED
//DEFAULT:INSIDE SAME PACKAGE


//PROGRAM TO DEMONSTRATE ON CLASS AND OBJECTS
package org.tnsif.classandobject;
//CALSS DECLARATION
public class Employee {
	//DEFAULT DATA MEMBERS
	int empId;
	String empName;
	float salary;
	String department;
	
	
	//METHOD DECLARATION AND DEFINITION
	void display() {
		System.out.println("Emp ID:" +empId +" "+ "Emp Name:" +empName + " "  +"Salary:" + salary+ " "+"Department:" +department);
	}
	
}
