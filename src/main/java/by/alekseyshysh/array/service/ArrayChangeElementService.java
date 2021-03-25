package by.alekseyshysh.array.service;

import by.alekseyshysh.array.entity.IntArray;

/**
 * 
 * @author AlekseyShysh
 *
 */
public abstract class ArrayChangeElementService {
	
	// TODO PART 1 : or i need to swap 2 elements or change all values?
	public static boolean setElement(IntArray intArray, int index, int number) {
		int[] elements = intArray.getElements();
		int elementsLength = elements.length;
		boolean result = index >= 0 & index < elementsLength ? true : false; 
		if (result == true) {
			intArray.setElement(index, number);
		}
		return result;
	}
	
	// TODO PART 3 : Implement method setElementWithStream(IntArray intArray, int index, int number)
	public static boolean setElementWithStream(IntArray intArray, int index, int number) {
		return false;
	}
	
}
