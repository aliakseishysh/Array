package by.alekseyshysh.array.validator;

import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.logging.log4j.Level;

import by.alekseyshysh.array.entity.IntArray;

public class ArrayValidator {

	private ArrayValidator() {
	}

	public static boolean validateIntArray(IntArray intArray) {
		return intArray != null && intArray.getElements() != null;
	}

	public static boolean validateFileExistance(Path path) {
		return !Files.notExists(path);
	}

}
