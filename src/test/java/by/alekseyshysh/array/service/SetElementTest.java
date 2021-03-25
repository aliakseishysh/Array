package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.IndexOutOfRangeException;

public class SetElementTest {
	@Test
	public void setElementPositiveValueTest() throws IndexOutOfRangeException {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 99;
		ArrayChangeElementService.setElement(intArray, 2, 99);
		int actual = intArray.getElement(2);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void setElementNegativeValueTest() throws IndexOutOfRangeException {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		boolean expected = true;
		boolean actual = ArrayChangeElementService.setElement(intArray, 2, -99);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void setElementOutOfRangeTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		boolean expected = false;
		boolean actual = ArrayChangeElementService.setElement(intArray, -1, 99);
		AssertJUnit.assertEquals(expected, actual);
	}
}
