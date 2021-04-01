package by.alekseyshysh.array.validator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

import org.apache.logging.log4j.Level;

import by.alekseyshysh.array.entity.IntArray;

public class ArrayValidator {
	
	private static final String ALL_INTEGER_NUMBERS = "^-?\\d(,-?\\d)*$";
	
	private ArrayValidator() {
	}

	/**
	 * 
	 * @param custom string line
	 * @return boolean value that shows, can we parse it to primary integral types
	 */
	public static boolean validateString(String line) {
		boolean result = Pattern.matches(ALL_INTEGER_NUMBERS, line);
		return result;
	}
	
	public static boolean validateIntArray(IntArray intArray) {
		return intArray != null && intArray.getElements() != null;
	}
	
	public static boolean validateElementsLenghtNotZero(int[] elements) {
		return elements.length != 0;
	}

	public static boolean validateFileExistence(Path path) {
		return !Files.notExists(path);
	}

}
