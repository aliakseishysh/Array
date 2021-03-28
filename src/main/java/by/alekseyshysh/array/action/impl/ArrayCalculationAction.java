package by.alekseyshysh.array.action.impl;

import java.util.stream.IntStream;

import by.alekseyshysh.array.action.ArrayCalculationInterface;
import by.alekseyshysh.array.entity.IntArray;

/**
 * 
 * This class for calculative operations with 
 * @see by.alekseyshysh.array.entity.IntArray
 * @author AlekseyShysh
 *
 */
public class ArrayCalculationAction implements ArrayCalculationInterface {
	
	public int calculateSumWithStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		int sum = IntStream.of(elements)
						   .sum();
		return sum;
	}
	
	public int calculateSum(IntArray intArray) {
		int[] elements = intArray.getElements();
		int resultSum = 0;
		for (int element: elements) {
			resultSum += element;
		}
		return resultSum;
	}
	
	/**
	 * elementsCount > 1, because of validation in LineValidator
	 * 
	 * @param intArray
	 * @return average arithmetic value (double) of intArray
	 */
	public double calculateAverageWithStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		double elementsCount = (double) elements.length;
		double resultSum = (double) calculateSumWithStream(intArray);
		double averageValue = resultSum / elementsCount;
		return averageValue;
	}
	
	/**
	 * elementsCount > 1, because of validation in LineValidator
	 * 
	 * @param intArray
	 * @return average arithmetic value of intArray
	 */
	public double calculateAverage(IntArray intArray) {
		int[] elements = intArray.getElements();
		int elementsLength = elements.length;
		double elementsSum = calculateSum(intArray);
		double resultAverage = elementsSum / elementsLength;
		return resultAverage;
	}
	
	public int calculatePositiveElementsCountWithStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		int positiveElementsCount = (int) IntStream.of(elements)
												   .filter(element -> element > 0)
												   .count();
		return positiveElementsCount;
		
	}
	
	public int calculatePositiveElementsCount(IntArray intArray) {
		int[] elements = intArray.getElements();
		int positiveElementsCount = 0;
		for (int element: elements) {
			positiveElementsCount += element > 0 ? 1 : 0;
		}
		return positiveElementsCount;
	}
	
	public int calculateNegativeElementsCountWithStream(IntArray intArray) {
		int[] elements = intArray.getElements();
		int negativeElementsCount = (int) IntStream.of(elements)
												   .filter(e -> e < 0)
												   .count();
		return negativeElementsCount;
	}
	
	public int calculateNegativeElementsCount(IntArray intArray) {
		int[] elements = intArray.getElements();
		int negativeElementsCount = 0;
		for (int element: elements) {
			negativeElementsCount += element > 0 ? 1 : 0;
		}
		return negativeElementsCount;
	}
}
