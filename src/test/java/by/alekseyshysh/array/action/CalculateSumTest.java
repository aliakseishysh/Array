package by.alekseyshysh.array.action;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.impl.ArrayCalculationAction;
import by.alekseyshysh.array.entity.IntArray;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class CalculateSumTest {

	private ArrayCalculationInterface arrayCalculation = new ArrayCalculationAction();
	
	@Test
	public void calculateSumPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 36;
		int actual = arrayCalculation.calculateSum(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateSumPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 36;
		int actual = arrayCalculation.calculateSumWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateSumNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -36;
		int actual = arrayCalculation.calculateSum(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateSumNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -36;
		int actual = arrayCalculation.calculateSumWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
