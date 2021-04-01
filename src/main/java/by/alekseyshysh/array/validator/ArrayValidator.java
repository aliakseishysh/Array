package by.alekseyshysh.array.validator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

import by.alekseyshysh.array.entity.IntArray;

public class ArrayValidator {
	
	private static final String ALL_INTEGRAL_NUMBERS = "^-?\\d(,-?\\d)*$";
	
	private ArrayValidator() {
	}

	/**
	 * 
	 * @param custom string line
	 * @return boolean value that shows, can we parse line to primary integral types or not
	 */
	public static boolean validateString(String line) {
		boolean result = Pattern.matches(ALL_INTEGRAL_NUMBERS, line);
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
