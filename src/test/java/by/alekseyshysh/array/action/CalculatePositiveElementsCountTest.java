package by.alekseyshysh.array.action;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.impl.ArrayCalculationAction;
import by.alekseyshysh.array.entity.IntArray;

public class CalculatePositiveElementsCountTest {
	
	private ArrayCalculationInterface arrayCalculation = new ArrayCalculationAction();
	
	@Test
	public void calculatePositiveElementsCountPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculatePositiveElementsCountWithStreamPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 8;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculatePositiveElementsCountNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 0;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculatePositiveElementsCountWithStreamNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = 0;
		int actual = arrayCalculation.calculatePositiveElementsCount(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
