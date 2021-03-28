package by.alekseyshysh.array.action;

import by.alekseyshysh.array.entity.IntArray;

public interface ArraySortInterface {

	public IntArray quickSort(IntArray intArray);
	
	public IntArray shellSort(IntArray intArray);
	
	public IntArray insertionSort(IntArray intArray);
	
	public IntArray sortWithIntStream(IntArray intArray);
}
