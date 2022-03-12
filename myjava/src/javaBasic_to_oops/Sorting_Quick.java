package javaBasic_to_oops;

public class Sorting_Quick {

	
	
public static void printarr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}


//Quick sort

public static int partition(int arr[],int low,int high) {
	int pivot=arr[high];
	int i=low-1;  ///give space pivuiot smallest elemet
	for(int j=low;j<high;j++) {
		if(arr[j]<pivot) {
			i++;
			//swap
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
	i++;
	int temp=arr[i];
	arr[i]=pivot;
	arr[high]=temp;
	
	return i;
}
public static void quicksort(int arr[],int low,int high) {
if(low<high) {
	int pivotindex=partition(arr,low,high);
	
	quicksort(arr,low,pivotindex-1);
	quicksort(arr,pivotindex+1,high);
	
	
	
}


}

public static void main(String args[]) {
	
	int arr[]= {10,11,23,1,3,2};
	int n=arr.length;
	System.out.print(" Before sorting:");
	printarr(arr);
	quicksort(arr,0,n-1);
	System.out.print(" After merge sort:");
	printarr(arr);
	
	








}
	
}
