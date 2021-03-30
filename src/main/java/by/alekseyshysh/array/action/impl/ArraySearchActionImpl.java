package by.alekseyshysh.array.action.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArraySearch;
import by.alekseyshysh.array.entity.IntArray;

/**
 * This class for finding elements in an array
 * @author AlekseyShysh
 * 
 */
public class ArraySearchActionImpl implements ArraySearch {
	
	/**
	 * Returns a maximum element of intArray with IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return maxElement maximum element of intArray.getElements()
	 */
	public int searchMaxElementWithStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		int maxElement = IntStream.of(elements).max().getAsInt();
		return maxElement;
	}
	
	/**
	 * Returns a maximum element of intArray without IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return maxElement maximum element of intArray.getElements()
	 */
	public int searchMaxElement(IntArray intArray) {
		int[] elements = intArray.getElements();
		int maxElement = elements[0];
		for (int element: elements) {
			if (element > maxElement) {
				maxElement = element;
			}
		}
		return maxElement;
	}
	
	/**
	 * Returns a minimum element of intArray with IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return minElement minimum element of intArray.getElements()
	 */
	public int searchMinElementWithStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		int minElement = IntStream.of(elements)
								  .min()
								  .getAsInt();
		return minElement; 
	}
	
	/**
	 * Returns a minimum element of intArray without IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return minElement minimum element of intArray.getElements()
	 */
	public int searchMinElement(IntArray intArray) {
		int[] elements = intArray.getElements();
		int minElement = elements[0];
		for (int element: elements) {
			if (element < minElement) {
				minElement = element;
			}
		}
		return minElement;
	}	
}
