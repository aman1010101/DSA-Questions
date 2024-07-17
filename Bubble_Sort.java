package com;

public class Bubble_Sort {
	public static void Bubblesort(int[] arr) {
		int n= arr.length;
		// iteration loop
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1); j++) {
				if(arr[j]>arr[j+1]) {
					//swapping
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {4,5,9,6,3,14};
		print(arr);
		System.out.println();
		System.out.println("-------------------------------------------------");
		// will we call our bubble sort method to sort this array
		Bubblesort(arr);
		print(arr);
		
		
	}

}
