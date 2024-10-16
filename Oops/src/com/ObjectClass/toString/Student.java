package com.ObjectClass.toString;

 class StudentDetails {
	String name ;
	int id;
	int age;
	long mobile;
	
	public StudentDetails(String name, int id, int age, long mobile) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Name :- "+name+"\n"+"id :- "+id+"\n"+"Age :- "+age+"\n"+"Mobile :- "+mobile;
	}
	
	

}
class Student{
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails("Som", 1, 22, 6371326214L);
		System.out.println(s1);
	}
}
