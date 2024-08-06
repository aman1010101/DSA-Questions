package com;

public class InsertionSort {
	/*Method to implement InsertionSort concept*/
	public static void insertionsort(int[] array) {
		for(int i=1; i<array.length;i++) {
			int current=array[i];
			int previous = i-1;// Assuming This Is an Sorted Array!
			while(previous>=0 && array[previous]>current) {
				/*Shifting Element from rigth to left*/
				array[previous+1] =array[previous];
				previous--;
				
			}
			//inserting element to its correct position!
			array[previous+1]= current;
		}
	}
	/*Method to print array*/
	public static void printarray(int[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int array[]= {4,8,54,4,9};
		System.out.println("Printing array before calling the Insertion Sort method ");
		
		/*calling printarray method*/
		printarray(array);
		System.out.println("Printing array after calling the Insertion Sort method ");
		/* Calling the insertionsort method*/
		insertionsort(array);
		printarray(array);
		
		

	}

}
