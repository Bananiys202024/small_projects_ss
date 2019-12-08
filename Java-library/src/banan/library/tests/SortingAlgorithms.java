package banan.library.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import banan.library.algorithms.sorting.BubbleSort;
import banan.library.algorithms.sorting.InsertionSort;
import banan.library.algorithms.sorting.MergeSort;
import banan.library.algorithms.sorting.QuickSort;
import banan.library.algorithms.sorting.SelectionSort;


public class SortingAlgorithms {

        final int[] initial_array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	final int[] expect_bubble_sort = {0, 1, 2, 4, 6, 9, 12, 23, 34};
	
	@Test
	public void do_bubble_sort()
	{
		BubbleSort bubble_sort = new BubbleSort();
		int[] executed_sort = bubble_sort.do_sort(this.initial_array);
		assertArrayEquals(expect_bubble_sort, executed_sort);
	}
	

	@Test
	public void do_insertation_sort()
	{
		InsertionSort insertion_sort = new InsertionSort();
		int[] executed_sort =  insertion_sort.do_sort(this.initial_array);
		assertArrayEquals(expect_bubble_sort, executed_sort);
	}
	
	@Test
	public void do_merge_sort()
	{
		MergeSort merge_sort = new MergeSort();
		int[] executed_sort = merge_sort.do_sort(this.initial_array);
		assertArrayEquals(expect_bubble_sort, executed_sort);
	}
	
	@Test
	public void do_quick_sort()
	{
		QuickSort quick_sort = new QuickSort();
		int[] executed_sort = quick_sort.do_sort(this.initial_array);
		assertArrayEquals(expect_bubble_sort, executed_sort);
	}
	
	@Test
	public void do_selection_sort()
	{
		SelectionSort selection_sort = new SelectionSort();
		int[] executed_sort = selection_sort.do_sort(this.initial_array);
		assertArrayEquals(expect_bubble_sort, executed_sort);
	}
	
	
}
