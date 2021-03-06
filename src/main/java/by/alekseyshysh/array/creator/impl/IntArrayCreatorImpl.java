package by.alekseyshysh.array.creator.impl;

import java.util.List;
import java.util.stream.Collectors;

import by.alekseyshysh.array.creator.IntArrayCreator;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public class IntArrayCreatorImpl implements IntArrayCreator {

	public IntArray[] createIntArrayArray(List<int[]> arrayList) throws ArrayException {
		IntArray[] result = arrayList.stream().map(array -> {
			try {
				return createIntArray(array);
			} catch (ArrayException e) {
				return new int[0];
			}
		}).collect(Collectors.toList()).toArray(new IntArray[0]);
		return result;
	}

	public IntArray createIntArray(int[] array) throws ArrayException {
		if (array == null) {
			throw new ArrayException(IntArrayCreatorImpl.class.getName() + ": can't create IntArray with null array");
		}
		IntArray intArray = new IntArray(array);
		return intArray;
	}
}
