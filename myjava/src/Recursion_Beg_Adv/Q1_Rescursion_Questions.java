package Recursion_Beg_Adv;

public class Q1_Rescursion_Questions {
//Print Natural number using recursion 5 4 3 2 1 
//  public static int printnumber(int n){
//	  if(n==0) {
//		  return 0;
//	  }
//	  System.out.println(n);
//	  return printnumber(n-1);
//  }
//  
////////////////////////////////////////////////////////////////////////////	
//  Print Natural number using recursion 1 2 3 4 5
//  public static int printnumberre(int n){
//	  if(n==6) {
//		  return 0;
//	  }
//	  System.out.println(n);
//	  return printnumberre(n+1);
//  }
  
//////////////////////////////////////////////////////////////////////
//Print sum of n natural numbers
//public static void printsum(int i,int n,int sum){
//	  if(i==n) {
//		  sum+=i;
//		  System.out.println(sum);
//
//		  return;
//	  }
//	  
//	  sum+=i;
//	   printsum(i+1,n,sum);
//	   
//	   
// }

////////////////////////////////////////////////////////////////////////
// Factorial of number
//public static int factorial(int n){
//	if(n==1 || n==0) {
////		System.out.print("1");
//		return 1;
//	}
//	
//	
////	int fact=n*n-1;
//	int fct=n * factorial(n-1);
//	
//
//	return fct;	   
//		   
//	 }
/////////////////////////////////////////////////////////////////////////////////
//Print fibonacci series of a number
public static void fibonacci(int a,int b,int n){
	if(n==0) {
		return;
	}
	
	int c=a+b;
	System.out.println(c);
	fibonacci(b,c,n-1);		   
			   
}
public static void main(String args[]) {
//		  System.out.println("From 5 to 1");
//		  printnumber(5);
//		
//		  //from 1 to 5
//		  System.out.println("From 1 to 5");
//          printnumberre(1);
        
 //       Print sum of n naturak numbers
//        printsum(1,4,0);
	
	//Factorial series
//	System.out.print(factorial(3));
	
	int a=0;
	int b=1;
	System.out.println("0");
//	System.out.println(factorial(3));

	int n=5;
	fibonacci(a,b,n-2);
	

	
	
	
	
	}	
}
