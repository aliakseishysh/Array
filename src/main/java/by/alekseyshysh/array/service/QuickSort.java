package by.alekseyshysh.array.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class QuickSort {
	
	static int[] quickSort(int[] array, int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(array, begin, end);
	        quickSort(array, begin, partitionIndex-1);
	        quickSort(array, partitionIndex+1, end);
	    }
	    return array;
	}
	
	private static int partition(int array[], int begin, int end) {
	    int pivot = array[end];
	    int i = (begin-1);
	    for (int j = begin; j < end; j++) {
	        if (array[j] <= pivot) {
	            i++;
	            int swapTemp = array[i];
	            array[i] = array[j];
	            array[j] = swapTemp;
	        }
	    }
	    int swapTemp = array[i+1];
	    array[i+1] = array[end];
	    array[end] = swapTemp;
	    return i+1;
	}
	
	/* TODO need to understand this code and rewrite by myself with all rules
	 * 
	 */
	private static Function<Integer, Predicate<Integer>> smallerThan = x -> y -> y < x;
    public static List<Integer> quickSortWithStream(List<Integer> list){
        if(list.isEmpty()) {
        	return new ArrayList<>();
        }
        return Stream.concat(Stream.concat(
                quickSortWithStream(list.stream().skip(1).filter(smallerThan.apply(list.get(0)))
                		.collect(Collectors.toList())).stream(), Stream.of(list.get(0))),
                quickSortWithStream(list.stream().skip(1).filter(smallerThan.apply(list.get(0))
                		.negate()).collect(Collectors.toList())).stream()).collect(Collectors.toList());
    }
}
