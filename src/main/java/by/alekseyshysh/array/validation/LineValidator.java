package by.alekseyshysh.array.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class LineValidator {

	public static boolean validate(String line) {
		Pattern pattern = Pattern.compile("^-?[0-9]+(,-?[0-9]+)*$");
	    Matcher matcher = pattern.matcher(line);
	    if (matcher.find()) {
	    	return true;
	    }
	    return false;
	}
}
