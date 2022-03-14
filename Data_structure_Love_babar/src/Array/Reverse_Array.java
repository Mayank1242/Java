package Array;

public class Reverse_Array {
public static void printarr(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
public static void reversearr(int arr[],int n) {
	for(int i=n-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
}
public static void main(String args[]) {
	int arr[]= {10,203,23,2};
	int len=arr.length;
	printarr(arr,len);
	System.out.println("After reverse array-:");
	reversearr(arr,len);
	
}
}
