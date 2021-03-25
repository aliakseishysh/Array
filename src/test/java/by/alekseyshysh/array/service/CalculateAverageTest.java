package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class CalculateAverageTest {
	@Test
	public void calculateAveragePositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		double expected = 4.5;
		double actual = ArrayCalculationService.calculateAverage(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}
	@Test
	public void calculateMaxElementPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		double expected = 4.5;
		double actual = ArrayCalculationService.calculateAverageWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}
	@Test
	public void calculateMaxElementNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculateMaxElementNullWithStreamTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculateMaxElementNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		double expected = -4.5;
		double actual = ArrayCalculationService.calculateAverage(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}
	@Test
	public void calculateMaxElementNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		double expected = -4.5;
		double actual = ArrayCalculationService.calculateAverageWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}
}
