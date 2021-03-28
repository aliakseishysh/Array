package by.alekseyshysh.array.action.impl;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArrayChangeElementsByConditionInterface;
import by.alekseyshysh.array.entity.IntArray;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class ArrayChangeElementsByConditionAction implements ArrayChangeElementsByConditionInterface {
	
	public void changeAllByConditionWithStream(IntPredicate predicate, IntArray intArray, int changeTo) {
		int[] elements = intArray.getElements();
		elements = IntStream.of(elements)
	 						.map(element -> predicate.test(element) ? changeTo : element)
	 						.toArray();
		intArray.setElements(elements);
	}
	
	public void changeAllByCondition(IntPredicate predicate, IntArray intArray, int changeTo) {
		int[] elements = intArray.getElements();
		for (int i = 0; i < elements.length; i++) {
			if (predicate.test(elements[i])) {
				elements[i] = changeTo;
			}
		}
		intArray.setElements(elements);		
	}
	
}















