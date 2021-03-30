package by.alekseyshysh.array.creator;

import java.util.List;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public interface IntArrayCreator {

	public IntArray[] createIntArrayArray(List<int[]> arrayList) throws ArrayException;

	public IntArray createIntArray(int[] array) throws ArrayException;
}
