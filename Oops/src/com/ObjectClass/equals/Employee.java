package com.ObjectClass.equals;

 class EmployeeDriver {
	String name;
	int age;
	long mobile;
	public EmployeeDriver(String name, int age, long mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Name :- "+name+"\n"+"Age :- "+age+"\n"+"Mobile :- "+mobile;
	}
	public boolean equals(Object o) {
		EmployeeDriver e1 = (EmployeeDriver)o;
		return this.name.equals(e1.name)&&this.age==e1.age&&this.mobile==e1.mobile;
	}
	
	
	

}
class Employee{
	public static void main(String[] args) {
		
		EmployeeDriver e1 = new EmployeeDriver("Som", 24, 6371326214L);
		EmployeeDriver e2 = new EmployeeDriver("Som", 24, 6371326214L);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}
	
	
}
