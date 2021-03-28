package by.alekseyshysh.array.creator.impl;

import java.util.ArrayList;

import by.alekseyshysh.array.creator.CreatorInterface;
import by.alekseyshysh.array.entity.IntArray;

public class Creator implements CreatorInterface {

	public IntArray[] create(ArrayList<int[]> arrayList) {
		int arrayListLength = arrayList.size();
		IntArray[] intArray = new IntArray[arrayListLength];
		for (int i = 0; i < arrayListLength; i++) {
			int[] arrayToInsert = arrayList.get(i);
			intArray[i] = new IntArray(arrayToInsert);
		}
		return intArray;
	}

}
