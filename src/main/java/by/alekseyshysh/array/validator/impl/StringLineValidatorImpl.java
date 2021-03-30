package by.alekseyshysh.array.validator.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.alekseyshysh.array.validator.StringLineValidator;

public class StringLineValidatorImpl implements StringLineValidator {

	private static final String ALL_INT_NUMBERS = "^-?\\d{1,10}(,-?\\d{1,10})*$";
	
	public boolean validate(String line) {
		Pattern pattern = Pattern.compile(ALL_INT_NUMBERS);
	    Matcher matcher = pattern.matcher(line);
	    boolean result = matcher.find();
	    return result;
	}
}
