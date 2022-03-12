package Pattern_Question;
import java.util.*;
public class Solid_Rectangle {
//  -----> column
//  * * * * *  
//  * * * * *
//  * * * * * 
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
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
