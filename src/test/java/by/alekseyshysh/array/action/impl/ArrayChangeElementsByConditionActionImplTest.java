package by.alekseyshysh.array.action.impl;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.ArrayCalculation;
import by.alekseyshysh.array.action.ArrayChangeElements;
import by.alekseyshysh.array.action.impl.ArrayCalculationActionImpl;
import by.alekseyshysh.array.action.impl.ArrayChangeElementsByConditionActionImpl;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public class ArrayChangeElementsByConditionActionImplTest {

	private ArrayChangeElements changeElements = new ArrayChangeElementsByConditionActionImpl();
	private ArrayCalculation arrayCalculation = new ArrayCalculationActionImpl();

	@Test
	public void changeAllGreaterThenZeroTest() throws ArrayException {
		IntArray actual = new IntArray(new int[] { -3, -2, -1, 0, 1, 2, 3 });
		IntArray expected = new IntArray(new int[] { -3, -2, -1, 0, -42, -42, -42 });
		changeElements.changeAllByCondition(e -> e > 0, actual, -42);
		Assert.assertEquals(expected.equals(actual), true);
	}

	@Test
	public void changeAllLessThenZeroTest() throws ArrayException {
		IntArray actual = new IntArray(new int[] { -3, -2, -1, 0, 1, 2, 3 });
		IntArray expected = new IntArray(new int[] { 42, 42, 42, 0, 1, 2, 3 });
		changeElements.changeAllByCondition(e -> e < 0, actual, 42);
		Assert.assertEquals(expected.equals(actual), true);
	}

	@Test
	public void changeAllGreaterThenZeroWithStreamTest() throws ArrayException {
		IntArray actual = new IntArray(new int[] { -3, -2, -1, 0, 1, 2, 3 });
		IntArray expected = new IntArray(new int[] { -3, -2, -1, 0, -42, -42, -42 });
		changeElements.changeAllByConditionWithStream(e -> e > 0, actual, -42);
		System.out.println(actual.toString() + " : " + expected.toString());
		Assert.assertEquals(expected.equals(actual), true);
	}

	@Test
	public void changeAllLessThenZeroWithStreamTest() throws ArrayException {
		IntArray actual = new IntArray(new int[] { -3, -2, -1, 0, 1, 2, 3 });
		IntArray expected = new IntArray(new int[] { 42, 42, 42, 0, 1, 2, 3 });
		changeElements.changeAllByConditionWithStream(e -> e < 0, actual, 42);
		Assert.assertEquals(expected.equals(actual), true);
	}

	@Test
	public void getNegativeElementsCountPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 0;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateNegativeElementsCountWithStreamPositiveValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		int expected = 0;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateNegativeElementsCountNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = 8;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test
	public void calculateNegativeElementsCountWithStreamNegativeValuesTest() throws ArrayException {
		IntArray intArray = new IntArray(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 });
		int expected = 8;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
