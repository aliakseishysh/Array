package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

public class InsertionSortTest {

	@Test
	public void insertionSortImperativePositiveValuesTest() {
		var intArray = new IntArray(new int[] {8,6,5,7,1,4,2,3});
		int[] expected = new int[] {1,2,3,4,5,6,7,8};
		int[] actual = ArraySortService.insertionSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}
	@Test
	public void insertionSortImperativeNegativeValuesTest() {
		var intArray = new IntArray(new int[] {-8,-6,-5,-7,-1,-4,-2,-3});
		int[] expected = new int[] {-8,-7,-6,-5,-4,-3,-2,-1};
		int[] actual = ArraySortService.insertionSort(intArray).getElements();
		AssertJUnit.assertArrayEquals(expected, actual);
	}
}
