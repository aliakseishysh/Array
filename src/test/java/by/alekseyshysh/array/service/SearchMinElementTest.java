package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

public class SearchMinElementTest {

	@Test
	public void searchMinElementPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 1;
		int actual = ArraySearchService.searchMinElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMinElementPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 1;
		int actual = ArraySearchService.searchMinElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMinElementNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void searchMinElementNullWithStreamTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void searchMinElementNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -8;
		int actual = ArraySearchService.searchMinElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMinElementNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -8;
		int actual = ArraySearchService.searchMinElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
