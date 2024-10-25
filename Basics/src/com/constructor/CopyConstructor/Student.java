package com.constructor.CopyConstructor;

 class StudentDriver {
	String name;
	int age;
	String country;
	StudentDriver(String name,int age,String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public StudentDriver(StudentDriver s) {
		this.name=s.name;
		this.age=s.age;
		this.country=s.country;
	}
	@Override
	public String toString() {
		return "name= " + name +"\n"+ "age=" + age +"\n"+ "country=" + country ;
	}
	

}
class Student{
	public static void main(String[] args) {
		StudentDriver s1 = new StudentDriver("Som",22,"India");
		StudentDriver s2= new StudentDriver(s1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
