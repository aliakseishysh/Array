package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

public class SearchMaxElementTest {
	
	@Test
	public void searchMaxElementPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = ArraySearchService.searchMaxElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMaxElementPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = ArraySearchService.searchMaxElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMaxElementNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void searchMaxElementNullWithStreamTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void searchMaxElementNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -1;
		int actual = ArraySearchService.searchMaxElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMaxElementNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -1;
		int actual = ArraySearchService.searchMaxElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	
}
