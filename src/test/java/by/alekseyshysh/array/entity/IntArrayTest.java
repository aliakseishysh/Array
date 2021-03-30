package by.alekseyshysh.array.entity;

import org.testng.annotations.Test;

import by.alekseyshysh.array.exception.ArrayException;

import org.testng.Assert;

public class IntArrayTest {
	
	@Test
	public void equalsSymmetryTest() {
		var intArray1 = new IntArray(new int[] {1,2,3,4,5});
		var intArray2 = new IntArray(new int[] {1,2,3,4,5});
		boolean symmetryTest1 = intArray1.equals(intArray2);
		boolean symmetryTest2 = intArray2.equals(intArray1);
		Assert.assertEquals(symmetryTest1, symmetryTest2);
	}
	
	@Test (expectedExceptions = {ArrayException.class})
	public void getElement() throws ArrayException {
		var intArray = new IntArray(new int[] {1,2,3,4,5});
		intArray.getElement(-1);
	}
}
