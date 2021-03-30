package by.alekseyshysh.array.validator;

import java.util.regex.Pattern;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.parser.ArrayFileParser;
import by.alekseyshysh.array.parser.impl.ArrayFileParserImpl;
import by.alekseyshysh.array.validator.StringLineValidator;

public class StringLineValidator {

	private static final String ALL_INTEGER_NUMBERS = "^-?\\d(,-?\\d)*$";

	private ArrayFileParser parser = new ArrayFileParserImpl();

	public boolean validateFromFile(String line) {
		return validateIntValues(line);
	}

	/**
	 * Variant 1 but long will cause error while Integer::parseInt
	 * 
	 * @param line
	 * @return true for line with integer values (byte, short, int, long)
	 */
	private boolean validateIntegerValues(String line) {
		boolean result = Pattern.matches(ALL_INTEGER_NUMBERS, line);
		return result;
	}

	/**
	 * Variant 2 with catching NumberFormatException, but we need to parse 2 times:
	 * on validation and creation in creator
	 * 
	 * @param line
	 * @return true for line with int values
	 * @throws ArrayException
	 */
	private boolean validateIntValues(String line) {
		boolean result = false;
		try {
			parser.parseStringFromFileWithStream(line);
			result = true;
		} catch (ArrayException ae) {
		}
		return result;
	}
}
