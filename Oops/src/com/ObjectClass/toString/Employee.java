package com.ObjectClass.toString;
class EmployeeData{
	String name;
	int age;
	String empid;
	int deptno;
	public EmployeeData(String name, int age, String empid, int deptno) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.deptno = deptno;
	}
	public String toString() {
		return "Employee_name:-"+name+"\n"+"Emp_age:-"+age+"\n"+"Emp_id:-"+empid+"\n"+"Dept_no:-"+deptno;
		
	}
	
	
}
public class Employee {

	public static void main(String[] args) {
		EmployeeData d1 =  new EmployeeData("Soumitra", 22, "Som02Acc", 20);
		System.out.println(d1);
		

	}

}
