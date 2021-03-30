package by.alekseyshysh.array.creator.impl;

import java.util.List;

import by.alekseyshysh.array.creator.IntArrayCreator;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public class IntArrayCreatorImpl implements IntArrayCreator {

	public IntArray[] createIntArrayArray(List<int[]> arrayList) throws ArrayException {
		int arrayListLength = arrayList.size();
		IntArray[] intArray = new IntArray[arrayListLength];
		for (int i = 0; i < arrayListLength; i++) {
			int[] arrayToInsert = arrayList.get(i);
			intArray[i] = createIntArray(arrayToInsert);
		}
		return intArray;
	}

	public IntArray createIntArray(int[] array) throws ArrayException {
		if (array == null) {
			throw new ArrayException(IntArrayCreatorImpl.class.getName() 
					+ ": can't create IntArray with null array");
		}
		IntArray intArray = new IntArray(array);
		return intArray;
	}

}
