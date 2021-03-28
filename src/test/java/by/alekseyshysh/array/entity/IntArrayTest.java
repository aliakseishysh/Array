package by.alekseyshysh.array.entity;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class IntArrayTest {
	
	@Test
	public void equalsSymmetryTest() {
		var intArray1 = new IntArray(new int[] {1,2,3,4,5});
		var intArray2 = new IntArray(new int[] {1,2,3,4,5});
		boolean symmetryTest1 = intArray1.equals(intArray2);
		boolean symmetryTest2 = intArray2.equals(intArray1);
		AssertJUnit.assertEquals(symmetryTest1, symmetryTest2);
	}
}
