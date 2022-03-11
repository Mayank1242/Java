package myjava1;

import java.util.*;
public class Hlo_word {
	public static void factorial(int n) {
		int fact=1;
		if(n<0) {
			System.out.println("Invalid");
			return;
		}
		for(int i=n;i>=1;i--) {
			fact=fact*i;
			System.out.println(fact);
		}
	}
	public static void main(String[] args) {
            
		factorial(0);
//            for(int i=0;i<5;i++) {
//            	for(int j=i;j<5;j++) {
//            		if(i==j) {
//            		System.out.println("* ");
//            		}
//            	}
//            }
		
//		Scanner var=new Scanner(System.in);
//		int va= var.nextInt();
//		
//		System.out.println(va);
//		int a=10;
//		int b=a+va;
//		
//		System.out.println(b);
//		
//		int var;
		
//		Scanner v= new Scanner(System.in);
//		
//		var=v.nextInt();
//		
//		if(var==1) {
//			System.out.println("Helooo broo");
//		}else if(var==2) {
//			System.out.println("Helooo vaiiii");
//		}
//		else {
//			System.out.println("Hiiii!!");
//		}
		
		
		
//		int n;
//		Scanner a= new Scanner(System.in);
//		int var=a.nextInt();
//		
//		for(int i=1;i<=10;i++) {
////			System.out.println(i);
//			n=var*i;
//			System.out.println(n);
//		}
		
	
//		for(int i=0;i<4;i++) {     //row
//			for(int j=0;j<4;j++) {   //coloum
//				
//					System.out.print("* ");
//				
//			}
//			System.out.println("* ");
//		}
		
	}
}
