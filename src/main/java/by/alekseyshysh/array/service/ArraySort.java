package by.alekseyshysh.array.service;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public interface ArraySort {

	public IntArray quickSort(IntArray intArray) throws ArrayException;

	public IntArray shellSort(IntArray intArray) throws ArrayException;

	public IntArray insertionSort(IntArray intArray) throws ArrayException;

	public IntArray sortWithIntStream(IntArray intArray) throws ArrayException;
}
