package Pattern_Question;

import java.util.Scanner;

public class Inverted_half_pyramid {
//  -----> column
//  * * * *  
//  * * *
//  * *     
//  * 
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int row;
		
		
		System.out.print("enter row number in pattern: ");
		row=sc.nextInt();
		
		for(int i=row;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
				}
			System.out.println();
			}
			
 
		}
}
