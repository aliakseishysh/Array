package by.alekseyshysh.array.action.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArraySort;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.utils.InsertionSort;
import by.alekseyshysh.array.utils.QuickSort;
import by.alekseyshysh.array.utils.ShellSort;
import by.alekseyshysh.array.utils.impl.InsertionSortImpl;
import by.alekseyshysh.array.utils.impl.QuickSortImpl;
import by.alekseyshysh.array.utils.impl.ShellSortImpl;
import by.alekseyshysh.array.validator.ArrayValidator;

public class ArraySortActionImpl implements ArraySort {
	
	public IntArray quickSort(IntArray intArray) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or filed elements equals null");
		}
		int[] elements = intArray.getElements();
		QuickSort quickSort = new QuickSortImpl();
		elements = quickSort.quickSort(elements, 0, elements.length - 1);
		intArray.setElements(elements);
		return intArray;
	}
	public IntArray shellSort(IntArray intArray) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or filed elements equals null");
		}
		int[] elements = intArray.getElements();
		ShellSort shellSort = new ShellSortImpl();
		elements = shellSort.shellSort(elements);
		intArray.setElements(elements);
		return intArray;
	}
	public IntArray insertionSort(IntArray intArray) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or filed elements equals null");
		}
		int[] elements = intArray.getElements();
		InsertionSort insertionSort = new InsertionSortImpl();
		elements = insertionSort.insertionSortImperative(elements);
		intArray.setElements(elements);
		return intArray;
	}
	
	public IntArray sortWithIntStream(IntArray intArray) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or filed elements equals null");
		}
		int[] elements = intArray.getElements();
		elements = IntStream.of(elements).sorted().toArray();
		intArray.setElements(elements);
		return intArray;
	}
}
