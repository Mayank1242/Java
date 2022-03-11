package myjava1;

import java.util.*;
public class array {
	
	
public static void printarr(int arr[],int n,int ele) {
	for(int j=0;j<4;j++) {
		if(arr[j]==ele) {
		System.out.println("aray is "+ arr[j] +" At "+ (j+1) +" Position.");
         }
	}	
	 {
   	 System.out.println("Invalid number!");
    }
}
public static void main(String agrs[]) {
	Scanner sc=new Scanner(System.in);
      int[] marks= new int[4];
      System.out.println("Enter your array here:");
    for(int i=0;i<4;i++) {
	
	 marks[i]=sc.nextInt();
     }
//    System.out.println(marks[0]);
    //print
    System.out.println("Enter the elemtn for search");
    int n=sc.nextInt();
    printarr(marks,4,n);
    

}


}
