package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

public class CalculateNegativeElementsCountTest {
	@Test
	public void getNegativeElementsCountPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 0;
		int actual = ArrayCalculationService.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateNegativeElementsCountWithStreamPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 0;
		int actual = ArrayCalculationService.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateNegativeElementsCountNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculateNegativeElementsCountWithStreamNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculateNegativeElementsCountNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 8;
		int actual = ArrayCalculationService.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateNegativeElementsCountWithStreamNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 8;
		int actual = ArrayCalculationService.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
