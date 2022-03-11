package myjava1;
import java.util.*;
public class bit_manipulation {
	
public static void setbit() {
	int n=5;
	int pos=2;
	int bitMask=1<<pos;
	
	int newnumber=bitMask | n;
	System.out.println(newnumber);
	}
public static void getbit() {
	int n=5;
	int pos=2;
	int bitMask=1<<pos;
	if((bitMask & n)==0) {
		System.out.println("Number is zero");
		
	}else {
		System.out.println("Number is one");
	}
	
}
public static void clearbit() {
	int n=5;
	int pos=2;
	int bitMask=1<<pos;
	int nobitmask=~(bitMask);
	
	int newnumber =  nobitmask & n ;
	System.out.println(newnumber);
	
}
public static void updatebit() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter what type you want to update(0,1):");
	int oper=sc.nextInt();
	int n=5;
	int pos=2;
	int bitMask=1<<pos;
	
	if(oper==1) {
		int newnumber=bitMask | n;
	System.out.println(newnumber);
	}
	else if(oper==0) {
		int nobitmask=~(bitMask);
		
		int newnumber =  nobitmask & n ;
		System.out.println(newnumber);
	}
	else {
		System.out.println("please enter valid updation!!");
	}
}
public static void main(String args[]) {
	System.out.println("After get bit:");
	getbit();
	System.out.println("After set bit:");
	setbit();
	System.out.println("After clear bit:");
	clearbit();
	System.out.println("After update bit:");
	updatebit();
	
	
}
}
