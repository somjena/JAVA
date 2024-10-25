package com.constructor.CopyConstructor;
import java.util.*;
class Employee{
	String name;
	int empid;
	int deptno;
public Employee(String name,int empid,int deptno){
		this.name=name;
		this.empid=empid;
		this.deptno=deptno;
	}
Employee(Employee e){
	this.name=e.name;
	this.empid=e.empid;
	this.deptno=e.deptno;
}
}
public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1= new Employee("Soumitra Jena",2253,20);
		Employee e2=e1;
		System.out.println("Employee name - "+e1.name);
		System.out.println("Employee id - "+e1.empid);
		System.out.println("Employee deptno - "+e1.deptno);
		
		System.out.println("*******************************");
		System.out.println("Employee name - "+e2.name);
		System.out.println("Employee id - "+e2.empid);
		System.out.println("Employee deptno - "+e2.deptno);

	}

}
