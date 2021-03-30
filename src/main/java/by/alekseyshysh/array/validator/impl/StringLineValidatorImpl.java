package by.alekseyshysh.array.validator.impl;

	import java.util.regex.Pattern;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.parser.FromFileParser;
import by.alekseyshysh.array.parser.impl.FromFileParserImpl;
import by.alekseyshysh.array.validator.StringLineValidator;

public class StringLineValidatorImpl implements StringLineValidator {

	private static final String ALL_INTEGER_NUMBERS = "^-?\\d(,-?\\d)*$";
	
	private FromFileParser parser = new FromFileParserImpl();
	
	public boolean validateFromFile(String line) {
		return validateIntValues(line);
	}
	
	/**
	 * 
	 * @param line
	 * @return true for line with integer values (byte, short, int, long)
	 */
	private boolean validateIntegerValues(String line) {
	    boolean result = Pattern.matches(ALL_INTEGER_NUMBERS, line);
	    return result;
	}
	
	/**
	 * TODO Need to avoid double parsing in validation and creation
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
