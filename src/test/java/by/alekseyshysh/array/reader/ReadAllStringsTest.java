package by.alekseyshysh.array.reader;

import java.nio.file.Path;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.reader.impl.ArrayReadAction;

public class ReadAllStringsTest {

	private ArrayReadInterface arrayRead = new ArrayReadAction();
	
	@Test
	public void readAllStringsTest() throws ArrayException {
		Path path = arrayRead.createFilePathFromRelative();
		String[] actual = arrayRead.readAllCorrectLines(path);
		String[] expected = new String[] {"1,2,3,4,5,6,7,8",
										  "-1,-2,-3,-4,-5,-6,-7,-8",
										  "8,7,6,1,0,9,87,63,-12,-26"};
		AssertJUnit.assertArrayEquals(expected, actual);
	}
}
