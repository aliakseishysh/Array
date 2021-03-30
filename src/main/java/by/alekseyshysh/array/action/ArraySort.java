package by.alekseyshysh.array.action;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.utils.Constant;

public interface ArraySort extends Constant {

	public IntArray quickSort(IntArray intArray) throws ArrayException;

	public IntArray shellSort(IntArray intArray) throws ArrayException;

	public IntArray insertionSort(IntArray intArray) throws ArrayException;

	public IntArray sortWithIntStream(IntArray intArray) throws ArrayException;
}
