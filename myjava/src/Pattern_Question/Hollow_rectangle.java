package Pattern_Question;

import java.util.Scanner;

public class Hollow_rectangle {
//  -----> column
//  * * * * *  
//  *       *
//  *       * 
//  * * * * * 
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int row;
		int colm;
		
		System.out.print("enter row number in pattern: ");
		row=sc.nextInt();
		System.out.print("\nenter coloum numbers in pattern: ");
		colm=sc.nextInt();
		
		for(int i=1;i<=colm;i++) {
			for(int j=1;j<=row;j++) {
				if(i==1 || j==1 || i==colm || j==row ) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
