package by.alekseyshysh.array.validator;

import by.alekseyshysh.array.entity.IntArray;

public class ArrayValidator {
	
	private ArrayValidator() {
	}

	public static boolean validateIntArray(IntArray intArray) {
		return intArray != null && intArray.getElements() != null;
	}
	
}
