package by.alekseyshysh.array.service.impl;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.service.ArrayChangeElements;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class ArrayChangeElementsByConditionServiceImpl implements ArrayChangeElements {

	private static ArrayCheck arrayCheck = new ArrayCheck();
	
	public void changeAllByConditionWithStream(IntPredicate predicate, IntArray intArray, int changeTo)
			throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		elements = IntStream.of(elements).map(element -> predicate.test(element) ? changeTo : element).toArray();
		intArray.setElements(elements);
	}

	public void changeAllByCondition(IntPredicate predicate, IntArray intArray, int changeTo) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		for (int i = 0; i < elements.length; i++) {
			if (predicate.test(elements[i])) {
				elements[i] = changeTo;
			}
		}
		intArray.setElements(elements);
	}

}
