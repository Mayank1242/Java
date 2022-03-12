package javaBasic_to_oops;

class Pen{
	String colour;
	String type;
	
	public void write() {
		System.out.println(this.colour + " "+ this.type);
	}
}
class Student{
	String Name;
	int age;
	Student(){
		System.out.println("consturctor called");
	}
	Student(String name,int age){
		System.out.println("paramerized consturctor called");
		this.Name=name;
		this.age=age;
	}
	Student(Student s2){
		System.out.println("Copy consturctor called");

		this.Name=s2.Name;
		this.age=s2.age;
	}
	public void write() {
		System.out.println("Student name is " +this.Name + " and age is "+ this.age);
	}
}
public class oops {
 public static void main(String args[]) {
//	 Pen Pen1=new Pen();
//	 Pen1.colour="red ";
//	 Pen1.type="dot";
//	 
//	 Pen1.write();
//	 Pen Pen2=new Pen();
//	 Pen2.colour="blue ";
//	 Pen2.type=" gel";
//	 Pen2.write();
	

	 Student st1=new Student();
	 st1.Name="mayank";
	 st1.age=18;
	 st1.write(); 
	 
/////////////////////////////////////////////////////////////////
//Parameterized constructor
	 Student st3=new Student("rajat",16);
	 st3.write();
//////////////////////////////////////////////////////////////////////
//Copy constructor
	 Student st2=new Student(st1);
	 st2.write();
 }
}
