package banan.library.algorithms.sorting;


/**

 Merge sort is a divide and conquer algorithm.

Steps to implement Merge Sort:

1) Divide the unsorted array into n partitions, 
each partition contains 1 element. Here the one element is considered as sorted.

2) Repeatedly merge partitioned units to produce 
new sublists until there is only 1 sublist remaining. 
This will be the sorted list at the end.

Merge sort is a fast, stable sorting routine with 
guaranteed O(n*log(n)) efficiency. 
When sorting arrays, merge sort requires additional
scratch space proportional to the size of the input array.
Merge sort is relatively simple to code and offers performance
typically only slightly below that of quicksort.

 @author banan
 */

public class MergeSort {

	private int[] array;
    private int[] tempMergArr;
    private int length;
 

     
    public int[] do_sort(int inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new int[length];
        sorting(0, length - 1);
        return array;
    }
 
    private void sorting(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            sorting(lowerIndex, middle);
            // Below step sorts the right side of the array
            sorting(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
