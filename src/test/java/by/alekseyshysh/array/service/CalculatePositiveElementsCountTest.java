package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

public class CalculatePositiveElementsCountTest {
	@Test
	public void calculatePositiveElementsCountPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = ArrayCalculationService.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculatePositiveElementsCountWithStreamPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = ArrayCalculationService.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculatePositiveElementsCountNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculatePositiveElementsCountWithStreamNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculatePositiveElementsCountNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 0;
		int actual = ArrayCalculationService.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculatePositiveElementsCountWithStreamNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 0;
		int actual = ArrayCalculationService.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
