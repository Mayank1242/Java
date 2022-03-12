package javaBasic_to_oops;

public class Sorting_algo {

	
/////Bubble sort Function
public static void Bubblesort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

////Selection Sort
public static void SelectionSort(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		int Smallest=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[Smallest]>arr[j]) {
				Smallest=j;
			}
		}
		int temp=arr[Smallest];
		arr[Smallest]=arr[i];
		arr[i]=temp;
	}
}

//Insertion Sort
public static void Insertion_sort(int arr[]) {
	for(int i=1;i<arr.length;i++) {
		int current=arr[i];
		int j=i-1;
		while(j>=0 && current<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}   
		arr[j+1]=current;
	}
}

//Array printing function
public static void printarr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}

//Main function
public static void main(String args[]) {
		int arr[]= {10,11,23,1,3,2};
		System.out.print(" Before sorting:");
		printarr(arr);
//		Bubblesort(arr);
//		System.out.print(" After Bubble sorting:");
//		printarr(arr);
//		SelectionSort(arr);
//		System.out.print(" After Selection sorting:");
//		printarr(arr);
		Insertion_sort(arr);
		System.out.print(" After Inserion sorting:");
		printarr(arr);
	}
	
	
	
}
