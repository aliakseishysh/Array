package by.alekseyshysh.array.action.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArraySort;
import by.alekseyshysh.array.action.util.InsertionSort;
import by.alekseyshysh.array.action.util.QuickSort;
import by.alekseyshysh.array.action.util.ShellSort;
import by.alekseyshysh.array.action.util.impl.InsertionSortImpl;
import by.alekseyshysh.array.action.util.impl.QuickSortImpl;
import by.alekseyshysh.array.action.util.impl.ShellSortImpl;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.validator.ArrayValidator;

public class ArraySortActionImpl implements ArraySort {

	private static ArrayCheck arrayCheck = new ArrayCheck();
	
	public IntArray quickSort(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		QuickSort quickSort = new QuickSortImpl();
		elements = quickSort.quickSort(elements, 0, elements.length - 1);
		intArray.setElements(elements);
		return intArray;
	}

	public IntArray shellSort(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		ShellSort shellSort = new ShellSortImpl();
		elements = shellSort.shellSort(elements);
		intArray.setElements(elements);
		return intArray;
	}

	public IntArray insertionSort(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		InsertionSort insertionSort = new InsertionSortImpl();
		elements = insertionSort.insertionSortImperative(elements);
		intArray.setElements(elements);
		return intArray;
	}

	public IntArray sortWithIntStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		elements = IntStream.of(elements).sorted().toArray();
		intArray.setElements(elements);
		return intArray;
	}
}
