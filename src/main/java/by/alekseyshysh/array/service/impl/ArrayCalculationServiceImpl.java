package by.alekseyshysh.array.service.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.service.ArrayCalculation;

/**
 * 
 * This class for calculative operations with
 * 
 * @see by.alekseyshysh.array.entity.IntArray
 * @author AlekseyShysh
 *
 */
public class ArrayCalculationServiceImpl implements ArrayCalculation {
	
	private static ArrayCheck arrayCheck = new ArrayCheck();

	public int calculateSumWithStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int sum = IntStream.of(elements).sum();
		return sum;
	}

	public int calculateSum(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int resultSum = 0;
		for (int element : elements) {
			resultSum += element;
		}
		return resultSum;
	}

	/**
	 * 
	 * @param intArray
	 * @return average arithmetic value (double) of intArray
	 * @throws ArrayException
	 */
	public double calculateAverageWithStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		double elementsCount = (double) elements.length;
		double resultSum = (double) calculateSumWithStream(intArray);
		double averageValue = resultSum / elementsCount;
		return averageValue;
	}

	/**
	 * 
	 * @param intArray
	 * @return average arithmetic value of intArray
	 * @throws ArrayException
	 */
	public double calculateAverage(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int elementsLength = elements.length;
		double elementsSum = calculateSum(intArray);
		double resultAverage = elementsSum / elementsLength;
		return resultAverage;
	}

	public int calculatePositiveElementsCountWithStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int positiveElementsCount = (int) IntStream.of(elements).filter(element -> element > 0).count();
		return positiveElementsCount;

	}

	public int calculatePositiveElementsCount(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int positiveElementsCount = 0;
		for (int element : elements) {
			positiveElementsCount += element > 0 ? 1 : 0;
		}
		return positiveElementsCount;
	}

	public int calculateNegativeElementsCountWithStream(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int negativeElementsCount = (int) IntStream.of(elements).filter(e -> e < 0).count();
		return negativeElementsCount;
	}

	public int calculateNegativeElementsCount(IntArray intArray) throws ArrayException {
		arrayCheck.checkNull(intArray);
		int[] elements = intArray.getElements();
		arrayCheck.checkElementsZero(elements);
		int negativeElementsCount = 0;
		for (int element : elements) {
			negativeElementsCount += element > 0 ? 1 : 0;
		}
		return negativeElementsCount;
	}
}
