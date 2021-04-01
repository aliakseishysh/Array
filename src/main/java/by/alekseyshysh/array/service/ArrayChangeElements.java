package by.alekseyshysh.array.service;

import java.util.function.IntPredicate;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public interface ArrayChangeElements {

	public void changeAllByConditionWithStream(IntPredicate predicate, IntArray intArray, int changeTo)
			throws ArrayException;

	public void changeAllByCondition(IntPredicate predicate, IntArray intArray, int changeTo) throws ArrayException;
}
