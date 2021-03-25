package by.alekseyshysh.array.service;

import java.io.IOException;
import java.util.Arrays;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.NoSuchFileException;

public class StringArrayToIntArrayArrayTest {

	@Test
	public void readAllStringsTest() throws IOException, NoSuchFileException {
		IntArray[] actual = ArrayReadService.stringArrayToIntArrayArray(
				ArrayReadService.readAllCorrectLines());
		IntArray[] expected = new IntArray[3];
		expected[0] = new IntArray();
		expected[0].setElements(new int[] {1,2,3,4,5,6,7,8});
		expected[1] = new IntArray();
		expected[1].setElements(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		expected[2] = new IntArray();
		expected[2].setElements(new int[] {8,7,6,1,0,9,87,63,-12,-26});
		AssertJUnit.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void readAllStringsTestWithStream() throws IOException, NoSuchFileException {
		IntArray[] actual = ArrayReadService.stringArrayToIntArrayArrayWithStream(
				ArrayReadService.readAllCorrectLines());
		IntArray[] expected = new IntArray[3];
		expected[0] = new IntArray();
		expected[0].setElements(new int[] {1,2,3,4,5,6,7,8});
		expected[1] = new IntArray();
		expected[1].setElements(new int[] {-1,-2,-3,-4,-5,-6,-7,-8});
		expected[2] = new IntArray();
		expected[2].setElements(new int[] {8,7,6,1,0,9,87,63,-12,-26});
		AssertJUnit.assertArrayEquals(expected, actual);
	}
}
