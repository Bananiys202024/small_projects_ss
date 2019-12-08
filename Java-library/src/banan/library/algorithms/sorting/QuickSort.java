package banan.library.algorithms.sorting;

/**
 * 
 * Quicksort or partition-exchange sort, 
 * is a fast sorting algorithm, which is 
 * using divide and conquer algorithm. Quicksort
 * first divides a large list into two smaller
 * sub-lists: the low elements and the high 
 * elements. Quicksort can then recursively sort the sub-lists.
 *
 * 
 * @author banan
 *
 */

public class QuickSort {

	    private int array[];
	    private int length;
	 
	    public int[] do_sort(int[] inputArr) {
	         
	        if (inputArr == null || inputArr.length == 0) {
	            return inputArr;
	        }
	        array = inputArr;
	        length = inputArr.length;
	        sort(0, length - 1);
	        
	        return array;
	    }
	 
	    private void sort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            /**
	             * In each iteration, we will identify a number from left side which 
	             * is greater then the pivot value, and also we will identify a number 
	             * from right side which is less then the pivot value. Once the search 
	             * is done, then we exchange both numbers.
	             */
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            sort(lowerIndex, j);
	        if (i < higherIndex)
	        	sort(i, higherIndex);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    
}
