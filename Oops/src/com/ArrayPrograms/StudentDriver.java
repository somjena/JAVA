package com.ArrayPrograms;
class Student{
	String name;
	int age ;
	String id;
	public Student(String name,int age,String id) {
		this.name=name;
		this.age = age;
		this.id=id;
	}
	public String toString() {
		return "name = "+name+", age = "+age+" ,id = ,"+id;
	}
}
public class StudentDriver {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("Soumitra Jena", 22, "Som123");
        students[1] = new Student("Amit Sharma", 21, "Amit456");
        students[2] = new Student("Ravi Kumar", 23, "Ravi789");
        students[3] = new Student("Anita Desai", 20, "Anita101");
        students[4] = new Student("Priya Singh", 22, "Priya202");
        students[5] = new Student("Rahul Mehta", 21, "Rahul303");
        students[6] = new Student("Neha Agarwal", 23, "Neha404");
        students[7] = new Student("Vikram Patel", 20, "Vikram505");
        students[8] = new Student("Sakshi Gupta", 22, "Sakshi606");
        students[9] = new Student("Rajesh Khanna", 21, "Rajesh707");
        
        
        for(Student details:students) {
        	System.out.println(details);
        }
		

	}

}
