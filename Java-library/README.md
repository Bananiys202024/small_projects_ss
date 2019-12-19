# Java-library
It's source code of java library for using different java algorithms
<h3>Example of use</h3>
  
     MergeSort merge_sort = new MergeSort();
     int[] returned_array = merge_sort.do_sort(initial_array);
     
You can find all available classes for sorting in package "banan.library.algorithms.sorting"<br>
For display int[] array instead "[I@33909752" you should use 

     java.util.Arrays.toString(returned_array);

For using this java-library you need to export this project from IDE as jar.

<h3>Performance of algorithms of sorting of arrays</h3>
All algorithms sort array from 200 elements
<br>
 **Selection sort** . Dependency from input data: O(n^2) <br>
Bubble sort. Dependency from input data:    average & worse case: O(n^2); better case O(n)<br>
Insertion sort. Dependency from input data: average case: O(n^2); better case: O(n)<br>
Quick sort. Dependency from input data: Better case: O(n×2log2n); Worse case: O(n^2); Average value: O(n×log2n)<br>
Comb sort. Dependency from input data: in any case: O(n×log2n); in worse case: O(n^2)<br>
Grandmother sort. Dependency from input data: in any case: O(n);<br>
Timsort sort. Dependency from input data: in the better case: O(n); in commmmon case: O(nlog n);<br>
Tree sort. Balanced red-black. Dependency from input data: in any case: O(nlog n);<br>
Heapsort: O(log n)<br>

Conclusion: For sorting unsorted array from 200 elmenets the best use quick sort<br>
