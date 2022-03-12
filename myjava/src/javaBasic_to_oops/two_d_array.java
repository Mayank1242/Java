package javaBasic_to_oops;

import java.util.*;

public class two_d_array {
  
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int coloum;
		int row;
		System.out.println("Enter your Array row , colum size:");
		coloum=sc.nextInt();
		row=sc.nextInt();
		
		int[][] twodarray=new int[row][coloum];
        
		System.out.println("Enter your Array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				twodarray[i][j]=sc.nextInt();
			}
		}
		
		//For printing the 2d array
		System.out.println(" Array is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				System.out.print(twodarray[i][j]+ " ");		
			}	
			System.out.println();
		}
		
		//searching in 2d array
		int n;
		System.out.println("enter the element you waant to search:");
		n=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				if(twodarray[i][j]==n) {
				System.out.print("your array at ["+ i  +"," +j +"]" +"index");
				}
			}
			
		}
	
		
	}
}