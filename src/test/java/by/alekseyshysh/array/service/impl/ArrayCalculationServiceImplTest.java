package by.alekseyshysh.array.service.impl;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.service.ArrayCalculation;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class ArrayCalculationServiceImplTest {

	private ArrayCalculation arrayCalculation = new ArrayCalculationServiceImpl();

	@Test
	public void calculateAveragePositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		double expected = 4.5;
		double actual = arrayCalculation.calculateAverage(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}

	@Test
	public void calculateMaxElementPositiveValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		double expected = 4.5;
		double actual = arrayCalculation.calculateAverageWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}

	@Test
	public void calculateMaxElementNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		double expected = -4.5;
		double actual = arrayCalculation.calculateAverage(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}

	@Test
	public void calculateMaxElementNegativeValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		double expected = -4.5;
		double actual = arrayCalculation.calculateAverageWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual, 0.000001);
	}

	@Test
	public void calculatePositiveElementsCountPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 8;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculatePositiveElementsCountWithStreamPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 8;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculatePositiveElementsCountNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = 0;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculatePositiveElementsCountWithStreamNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = 0;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateSumPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 36;
		int actual = arrayCalculation.calculateSum(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateSumPositiveValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 36;
		int actual = arrayCalculation.calculateSumWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateSumNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = -36;
		int actual = arrayCalculation.calculateSum(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateSumNegativeValuesWithStreamTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = -36;
		int actual = arrayCalculation.calculateSumWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
