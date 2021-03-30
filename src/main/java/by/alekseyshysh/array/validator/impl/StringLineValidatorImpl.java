package by.alekseyshysh.array.validator.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.alekseyshysh.array.validator.StringLineValidator;

public class StringLineValidatorImpl implements StringLineValidator {

	public boolean validate(String line) {
		Pattern pattern = Pattern.compile("^-?\\d{1,10}(,-?\\d{1,10})*$");
	    Matcher matcher = pattern.matcher(line);
	    boolean result = matcher.find();
	    return result;
	}
}
