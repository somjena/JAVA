package com.Predefined_InterFace;

public class Employee implements Comparable{
	String name;
	int age;
	int id;
	double sal;
	
	public Employee(String name,int age,int id,double sal) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.sal=sal;
	}
	
	public String toString() {
		return "EmpName :- "+name+"\n"+"Age :- "+age+"\n"+"Empid:-"+id+"\n"+"Emp_sal"+sal;
	}

	@Override
	public int compareTo(Object o) {
		Employee e =(Employee)o;
		return age-e.age;
		
	}

}
