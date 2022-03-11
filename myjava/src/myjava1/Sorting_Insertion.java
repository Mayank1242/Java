package myjava1;
import java.util.*;
public class Sorting_Insertion {

	
public static void printarr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}

//Insertion sort

public static void conquer(int arr[],int si,int mid,int ei) {
int merged[]=new int[ei-si+1];
int idx1=si;
int idx2=mid+1;
int x=0;    ////index for merged array

while(idx1 <=mid && idx2<=ei) {
	if(arr[idx1]<=arr[idx2]) {
		merged[x++]=arr[idx1++];
		
		
	}else {
		merged[x++]=arr[idx2++];
		
	}
}

while(idx1<=mid) {
	merged[x++]=arr[idx1++];
	
}

while(idx2<=ei) {
	merged[x++]=arr[idx2++];

}

for(int i=0,j=si;i<merged.length;i++,j++) {
	arr[j]=merged[i];
}
}
public static void divide(int arr[],int si,int ei) {
if(si>=ei) {
	return;
}
int mid=si+(ei-si)/2;

divide(arr,si,mid);
divide(arr,mid+1,ei);
conquer(arr,si,mid,ei);
}

public static void main(String args[]) {
	
	int arr[]= {10,11,23,1,3,2};
	int n=arr.length;
	System.out.print(" Before sorting:");
	printarr(arr);
	divide(arr,0,n-1);
	System.out.print(" After merge sort:");
	printarr(arr);
	
	








}
}
