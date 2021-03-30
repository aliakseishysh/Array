package by.alekseyshysh.array.action.impl;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArrayChangeElements;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.validator.ArrayValidator;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class ArrayChangeElementsByConditionActionImpl implements ArrayChangeElements {
	
	public void changeAllByConditionWithStream(IntPredicate predicate, IntArray intArray, int changeTo) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or filed elements equals null");
		}
		int[] elements = intArray.getElements();
		elements = IntStream.of(elements)
	 						.map(element -> predicate.test(element) ? changeTo : element)
	 						.toArray();
		intArray.setElements(elements);
	}
	
	public void changeAllByCondition(IntPredicate predicate, IntArray intArray, int changeTo) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or filed elements equals null");
		}
		int[] elements = intArray.getElements();
		for (int i = 0; i < elements.length; i++) {
			if (predicate.test(elements[i])) {
				elements[i] = changeTo;
			}
		}
		intArray.setElements(elements);		
	}
	
}















