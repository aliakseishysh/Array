package by.alekseyshysh.array.action;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.impl.ArraySearchAction;
import by.alekseyshysh.array.entity.IntArray;

public class SearchMinElementTest {

	private ArraySearchInterface arraySearch = new ArraySearchAction();
	
	@Test
	public void searchMinElementPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 1;
		int actual = arraySearch.searchMinElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMinElementPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 1;
		int actual = arraySearch.searchMinElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMinElementNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -8;
		int actual = arraySearch.searchMinElement(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void searchMinElementNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -8;
		int actual = arraySearch.searchMinElementWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
