package javaBasic_to_oops;

class Studen {
String name;
int age;

public void printinfo(String name) {
	System.out.println(name);
}
public void printinfo(String name,int age) {
	System.out.println(name);
	System.out.println(age);
}
public void printinfo(int age) {
	System.out.println(age);
}
		
public void printinfo() {
	System.out.println(age);
	System.out.println(name);
}
}

public class Oops_Compile_time_polymorphism{
	
public static void main(String args[]) {
	 
	Studen s1= new Studen();
	
	s1.name="mayank";
	s1.age=18;
	
	s1.printinfo(s1.age);
	s1.printinfo(s1.name);
	s1.printinfo(s1.name,s1.age);
	s1.printinfo();
	
	
	 }
}
