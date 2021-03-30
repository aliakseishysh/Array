package by.alekseyshysh.array.creator.impl;

import java.util.List;

import by.alekseyshysh.array.creator.IntArrayCreator;
import by.alekseyshysh.array.entity.IntArray;

public class IntArrayCreatorImpl implements IntArrayCreator {

	public IntArray[] createIntArrayArray(List<int[]> arrayList) {
		int arrayListLength = arrayList.size();
		IntArray[] intArray = new IntArray[arrayListLength];
		for (int i = 0; i < arrayListLength; i++) {
			int[] arrayToInsert = arrayList.get(i);
			intArray[i] = new IntArray(arrayToInsert);
		}
		return intArray;
	}

}
