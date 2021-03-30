package by.alekseyshysh.array.action.impl;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.ArraySort;
import by.alekseyshysh.array.action.impl.ArraySortActionImpl;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public class ArraySortActionImplTest {

	private ArraySort arraySort = new ArraySortActionImpl();

	@Test
	public void insertionSortImperativePositiveValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { 8, 6, 5, 7, 1, 4, 2, 3 });
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] actual = arraySort.insertionSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void insertionSortImperativeNegativeValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { -8, -6, -5, -7, -1, -4, -2, -3 });
		int[] expected = new int[] { -8, -7, -6, -5, -4, -3, -2, -1 };
		int[] actual = arraySort.insertionSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void quickSortPositiveValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { 8, 6, 5, 7, 1, 4, 2, 3 });
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] actual = arraySort.quickSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void quickSortNegativeValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { -8, -6, -5, -7, -1, -4, -2, -3 });
		int[] expected = new int[] { -8, -7, -6, -5, -4, -3, -2, -1 };
		int[] actual = arraySort.quickSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void shellSortPositiveValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { 8, 6, 5, 7, 1, 4, 2, 3 });
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] actual = arraySort.shellSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void shellSortNegativeValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { -8, -6, -5, -7, -1, -4, -2, -3 });
		int[] expected = new int[] { -8, -7, -6, -5, -4, -3, -2, -1 };
		int[] actual = arraySort.shellSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void sortWithIntStreamPositiveValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { 8, 6, 5, 7, 1, 4, 2, 3 });
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] actual = arraySort.sortWithIntStream(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}

	@Test
	public void sortWithIntStreamNegativeValuesTest() throws ArrayException {
		var intArray = new IntArray(new int[] { -8, -6, -5, -7, -1, -4, -2, -3 });
		int[] expected = new int[] { -8, -7, -6, -5, -4, -3, -2, -1 };
		int[] actual = arraySort.sortWithIntStream(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}
}
