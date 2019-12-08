package banan.library.algorithms.sorting;

import banan.library.interfaces.SortingAlgorithms;

/**

Bubble sort, also referred to as sinking sort, 
is a simple sorting algorithm that works by repeatedly 
stepping through the list to be sorted, comparing each 
pair of adjacent items and swapping them if they are in 
the wrong order. The pass through the list is repeated
until no swaps are needed, which indicates that the list 
is sorted. The algorithm gets its name from the way smaller
elements "bubble" to the top of the list. Because it only 
uses comparisons to operate on elements, it is a comparison 
sort. Although the algorithm is simple, most of the other 
sorting algorithms are more efficient for large lists.

@author banan
 */

public class BubbleSort implements SortingAlgorithms {

	// logic to sort the elements
    public int[] do_sort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }         
        }
        
        return array;
    }
  
    private void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    
}
