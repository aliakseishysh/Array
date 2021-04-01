package by.alekseyshysh.array.action.impl;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.validator.ArrayValidator;

class ArrayCheck {

	ArrayCheck() {
	}
	
	void checkNull(IntArray intArray) throws ArrayException {
		if (ArrayValidator.validateIntArray(intArray)) {
			throw new ArrayException("IntArray object or field elements equals null");
		}
	}
	
	void checkElementsZero(int[] elements) throws ArrayException {
		if (ArrayValidator.validateElementsLenghtNotZero(elements)) {
			throw new ArrayException("length of field elements equals 0");
		}
	}
}
