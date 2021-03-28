package by.alekseyshysh.array.action.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArraySortInterface;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.utils.InsertionSortInterface;
import by.alekseyshysh.array.utils.QuickSortInterface;
import by.alekseyshysh.array.utils.ShellSortInterface;
import by.alekseyshysh.array.utils.impl.InsertionSort;
import by.alekseyshysh.array.utils.impl.QuickSort;
import by.alekseyshysh.array.utils.impl.ShellSort;

public class ArraySortAction implements ArraySortInterface {
	
	public IntArray quickSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		QuickSortInterface quickSort = new QuickSort();
		elements = quickSort.quickSort(elements, 0, elements.length - 1);
		intArray.setElements(elements);
		return intArray;
	}
	public IntArray shellSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		ShellSortInterface shellSort = new ShellSort();
		elements = shellSort.shellSort(elements);
		intArray.setElements(elements);
		return intArray;
	}
	public IntArray insertionSort(IntArray intArray) {
		int[] elements = intArray.getElements();
		InsertionSortInterface insertionSort = new InsertionSort();
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
