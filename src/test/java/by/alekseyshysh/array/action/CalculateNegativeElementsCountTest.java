package by.alekseyshysh.array.action;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.impl.ArrayCalculationActionImpl;
import by.alekseyshysh.array.entity.IntArray;

public class CalculateNegativeElementsCountTest {
	
	private ArrayCalculation arrayCalculation = new ArrayCalculationActionImpl();
	
	@Test
	public void getNegativeElementsCountPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 0;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateNegativeElementsCountWithStreamPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 0;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateNegativeElementsCountNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 8;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateNegativeElementsCountWithStreamNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 8;
		int actual = arrayCalculation.calculateNegativeElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
