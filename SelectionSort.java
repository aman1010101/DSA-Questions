package com;

public class SelectionSort {
	/*Method that implements Selectionsort concept */
	public static void slectionsort(int array[]) {
		for(int i=0;i<array.length-1; i++) {
			int min_element=i;
			for(int j=i+1;j<array.length; j++) {
				if(array[min_element]>array[j]) {
					min_element=j;
					
				}
			}
			//Swaping
			int temp=array[min_element];
			array[min_element]= array[i];
			array[i]=temp;
			
		}
	}
	/*Method to print array*/
	public static void printarray(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array= {7,2,9,6,45};
		System.out.println("Printing unsorted array before applying selection sort: ");
		/*printarray method to print given array*/
		printarray(array);
		/*Calling selectionsort method to sort array*/
		slectionsort(array);
		System.out.println("Printing sorted array after applying selection sort: ");
		printarray(array);
		
		
		
	}

}
