package Pattern_Question;

import java.util.Scanner;

public class Inverted_half_pyramid_180_degree {
//  -----> column
//       *   
//     * *
//   * * *    
// * * * * 
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int row;
		
		
		System.out.print("enter row number in pattern: ");
		row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
				}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				}
			System.out.println();
			}
			
 
		}
}
