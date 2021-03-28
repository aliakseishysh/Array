package by.alekseyshysh.array.action;

import java.util.function.IntPredicate;

import by.alekseyshysh.array.entity.IntArray;

public interface ArrayChangeElementsByConditionInterface {

	public void changeAllByConditionWithStream(IntPredicate predicate, IntArray intArray, int changeTo);
	
	public void changeAllByCondition(IntPredicate predicate, IntArray intArray, int changeTo);
}
