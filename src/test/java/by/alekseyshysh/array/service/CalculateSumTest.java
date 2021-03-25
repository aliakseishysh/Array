package by.alekseyshysh.array.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class CalculateSumTest {

	@Test
	public void calculateSumPositiveValuesTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 36;
		int actual = ArrayCalculationService.calculateSum(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateSumPositiveValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5,6,7,8});
		int expected = 36;
		int actual = ArrayCalculationService.calculateSumWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateSumNullTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculateSumNullWithStreamTest() {
		// TODO how to expect exception?
		IntArray intArray = new IntArray(new int[] {});
		AssertJUnit.fail();
	}
	@Test
	public void calculateSumNegativeValuesTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -36;
		int actual = ArrayCalculationService.calculateSum(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void calculateSumNegativeValuesWithStreamTest() {
		IntArray intArray = new IntArray(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		int expected = -36;
		int actual = ArrayCalculationService.calculateSumWithStream(intArray);
		AssertJUnit.assertEquals(expected, actual);
	}
}
