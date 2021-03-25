package by.alekseyshysh.array.service;

import java.io.IOException;
import java.util.Arrays;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.NoSuchFileException;

public class ReadAllStringsTest {

	@Test
	public void readAllStringsTest() throws IOException, NoSuchFileException {
		String[] actual = ArrayReadService.readAllCorrectLines();
		String[] expected = new String[] {"1,2,3,4,5,6,7,8",
										  "-1,-2,-3,-4,-5,-6,-7,-8",
										  "8,7,6,1,0,9,87,63,-12,-26"};
		AssertJUnit.assertArrayEquals(expected, actual);
	}
}
