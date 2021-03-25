package by.alekseyshysh.array.entity;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class IntArrayTest {
	
	@Test
	public void toStringTest() {
		var intArray = new IntArray(new int[] {1,2,3,4,5});
		String expected = "[1, 2, 3, 4, 5]";
		String actual = intArray.toString();
		AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void equalsSymmetryTest() {
		var intArray1 = new IntArray(new int[] {1,2,3,4,5});
		var intArray2 = new IntArray(new int[] {1,2,3,4,5});
		boolean symmetryTest1 = intArray1.equals(intArray2);
		boolean symmetryTest2 = intArray2.equals(intArray1);
		AssertJUnit.assertEquals(symmetryTest1, symmetryTest2);
	}
	@Test
	public void getIdTest() {
		boolean expected = true;
		IntArray intArray = new IntArray(new int[] {1,2,3,4,5});
		// if i have getter getId() here id value equals to null
		boolean actual = intArray.getId() instanceof Long;
		AssertJUnit.assertEquals(expected, actual);
	}
	
}
