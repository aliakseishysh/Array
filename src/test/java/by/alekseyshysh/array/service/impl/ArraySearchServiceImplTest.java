package by.alekseyshysh.array.service.impl;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.service.ArraySearch;

public class ArraySearchServiceImplTest {

	private ArraySearch arraySearch = new ArraySearchServiceImpl();

	@Test
	public void searchMaxElementPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 8;
		int actual = arraySearch.searchMaxElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMaxElementPositiveValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 8;
		int actual = arraySearch.searchMaxElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMaxElementNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = -1;
		int actual = arraySearch.searchMaxElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMaxElementNegativeValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = -1;
		int actual = arraySearch.searchMaxElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMinElementPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 1;
		int actual = arraySearch.searchMinElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMinElementPositiveValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 1;
		int actual = arraySearch.searchMinElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMinElementNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = -8;
		int actual = arraySearch.searchMinElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void searchMinElementNegativeValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = -8;
		int actual = arraySearch.searchMinElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

}
