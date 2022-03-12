package Recursion_Beg_Adv;
//check if array is sorted using recursion(only strictly increasing).
public class Q5_Check_array_Sorted {
	public static boolean check_sort(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
		}
		int j=i+1;
		
		if(arr[i]<arr[j]) {
			return check_sort(arr,i+1);
		
		}else {
			return false;
		}
		
	}
	
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5};
	System.out.println(check_sort(arr,0));
}
	
}
