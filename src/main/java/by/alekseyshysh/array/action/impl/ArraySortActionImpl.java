package by.alekseyshysh.array.action.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArraySort;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.utils.InsertionSort;
import by.alekseyshysh.array.utils.QuickSort;
import by.alekseyshysh.array.utils.ShellSort;
import by.alekseyshysh.array.utils.impl.InsertionSortImpl;
import by.alekseyshysh.array.utils.impl.QuickSortImpl;
import by.alekseyshysh.array.utils.impl.ShellSortImpl;

public class ArraySortActionImpl implements ArraySort {
	
	public IntArray quickSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		QuickSort quickSort = new QuickSortImpl();
		elements = quickSort.quickSort(elements, 0, elements.length - 1);
		intArray.setElements(elements);
		return intArray;
	}
	public IntArray shellSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		ShellSort shellSort = new ShellSortImpl();
		elements = shellSort.shellSort(elements);
		intArray.setElements(elements);
		return intArray;
	}
	public IntArray insertionSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		InsertionSort insertionSort = new InsertionSortImpl();
		elements = insertionSort.insertionSortImperative(elements);
		intArray.setElements(elements);
		return intArray;
	}
	
	public IntArray sortWithIntStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		elements = IntStream.of(elements).sorted().toArray();
		intArray.setElements(elements);
		return intArray;
	}
}
