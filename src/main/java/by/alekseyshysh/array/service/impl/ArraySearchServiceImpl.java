package by.alekseyshysh.array.service.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.service.ArraySearch;

/**
 * This class for finding elements in an array
 * 
 * @author AlekseyShysh
 * 
 */
public class ArraySearchServiceImpl implements ArraySearch {

	private static ArrayCheck arrayCheck = new ArrayCheck();
	
	/**
	 * Returns a maximum element of intArray with IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return maxElement maximum element of intArray.getElements()
	 * @throws ArrayException
	 */
	public int searchMaxElementWithStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int maxElement = IntStream.of(elements).max().getAsInt();
		return maxElement;
	}

	/**
	 * Returns a maximum element of intArray without IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return maxElement maximum element of intArray.getElements()
	 * @throws ArrayException
	 */
	public int searchMaxElement(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int maxElement = elements[0];
		for (int element : elements) {
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
	 * @throws ArrayException
	 */
	public int searchMinElementWithStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int minElement = IntStream.of(elements).min().getAsInt();
		return minElement;
	}

	/**
	 * Returns a minimum element of intArray without IntStream implementation
	 * 
	 * @param intArray instance of IntArray class
	 * @return minElement minimum element of intArray.getElements()
	 * @throws ArrayException
	 */
	public int searchMinElement(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int minElement = elements[0];
		for (int element : elements) {
			if (element < minElement) {
				minElement = element;
			}
		}
		return minElement;
	}
}
