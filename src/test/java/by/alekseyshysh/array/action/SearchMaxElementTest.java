package by.alekseyshysh.array.action;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.impl.ArraySearchAction;
import by.alekseyshysh.array.entity.IntArray;

public class SearchMaxElementTest {
	
	private ArraySearchInterface arraySearch = new ArraySearchAction();
	
	@Test
	public void searchMaxElementPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = arraySearch.searchMaxElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMaxElementPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = arraySearch.searchMaxElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMaxElementNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -1;
		int actual = arraySearch.searchMaxElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMaxElementNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -1;
		int actual = arraySearch.searchMaxElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	
}
