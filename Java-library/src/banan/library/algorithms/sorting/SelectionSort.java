package banan.library.algorithms.sorting;

import banan.library.interfaces.SortingAlgorithms;

/**
 
 The selection sort is a combination of searching and sorting. 
 During each pass, the unsorted element with the smallest 
 (or largest) value is moved to its proper position in the array. 
 The number of times the sort passes through the array 
 is one less than the number of items in the array.
 In the selection sort, the inner loop finds the next 
 smallest (or largest) value and the outer loop places 
 that value into its proper location.
  
  @author banan
 */
public class SelectionSort implements SortingAlgorithms {


		public int[] do_sort(int[] arr){
		
	    for (int i = 0; i < arr.length - 1; i++)
	    {
	        int index = i;
	        for (int j = i + 1; j < arr.length; j++)
	            if (arr[j] < arr[index]) 
	                index = j;
	 
	        int smallerNumber = arr[index];  
	        arr[index] = arr[i];
	        arr[i] = smallerNumber;
	    }
	    return arr;
	}
	
}
