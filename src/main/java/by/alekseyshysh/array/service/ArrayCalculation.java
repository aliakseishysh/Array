package by.alekseyshysh.array.service;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;

public interface ArrayCalculation {

	public int calculateSumWithStream(IntArray intArray) throws ArrayException;

	public int calculateSum(IntArray intArray) throws ArrayException;

	public double calculateAverageWithStream(IntArray intArray) throws ArrayException;

	public double calculateAverage(IntArray intArray) throws ArrayException;

	public int calculatePositiveElementsCountWithStream(IntArray intArray) throws ArrayException;

	public int calculatePositiveElementsCount(IntArray intArray) throws ArrayException;

	public int calculateNegativeElementsCountWithStream(IntArray intArray) throws ArrayException;

	public int calculateNegativeElementsCount(IntArray intArray) throws ArrayException;
}
