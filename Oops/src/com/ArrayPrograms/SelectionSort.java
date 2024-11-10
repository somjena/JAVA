package com.ArrayPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {9, 5, 4, 7, 6, 2, 3, 8, 9};
		System.out.print("Before Sorting: ");
		for (int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();

		selectionsort(array);
		
		System.out.print("After Sorting: ");
		for (int n : array) {
			System.out.print(n + " ");
		}
	}

	private static void selectionsort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {  // Corrected condition
				if (array[min] > array[j]) {
					min = j;
				}
			}
			// Swap the elements
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
