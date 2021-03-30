package by.alekseyshysh.array.action;

import by.alekseyshysh.array.entity.IntArray;

public interface ArrayCalculation {

	public int calculateSumWithStream(IntArray intArray);
	
	public int calculateSum(IntArray intArray);
	
	public double calculateAverageWithStream(IntArray intArray);
	
	public double calculateAverage(IntArray intArray);
	
	public int calculatePositiveElementsCountWithStream(IntArray intArray);
	
	public int calculatePositiveElementsCount(IntArray intArray);
	
	public int calculateNegativeElementsCountWithStream(IntArray intArray);
	
	public int calculateNegativeElementsCount(IntArray intArray);
}
