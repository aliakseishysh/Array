package by.alekseyshysh.array.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import by.alekseyshysh.array.entity.IntArray;

public abstract class ArraySortService {

//	IntStream.of(intArray.getElements()).sorted();
//	Arrays.sort(intArray.getElements());
//	Arrays.parallelSort(intArray.getElements());
//	Collections.sort(null);
	
	public static IntArray quickSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		elements = QuickSort.quickSort(elements, 0, elements.length - 1);
		intArray.setElements(elements);
		return intArray;
	}
	public static IntArray shellSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		elements = ShellSort.shellSort(elements);
		intArray.setElements(elements);
		return intArray;
	}
	public static IntArray insertionSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		elements = InsertionSort.insertionSortImperative(elements);
		intArray.setElements(elements);
		return intArray;
	}
	
	public static IntArray sortWithIntStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		elements = IntStream.of(elements).sorted().toArray();
		intArray.setElements(elements);
		return intArray;
	}
	
	// TODO a lot of casts. should i change this method or QuickSort.quickSortWithStream
	public static IntArray quickSortWithStream(IntArray intArray) {
		List<Integer> list = intArray.toIntegerList();
		list = QuickSort.quickSortWithStream(list);
		int[] elements = list.stream().mapToInt(element->element).toArray();
		intArray.setElements(elements);
		return intArray;
	}
	// TODO Implement shellSortWithStream method
	public static IntArray shellSortWithStream(IntArray intArray) {
		return intArray;
	}
	// TODO Implement insertionSortWithStream method
	public static IntArray insertionSortWithStream(IntArray intArray) {
		return intArray;
	}
	
}
