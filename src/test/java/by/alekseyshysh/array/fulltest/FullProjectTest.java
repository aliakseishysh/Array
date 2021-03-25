package by.alekseyshysh.array.fulltest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.NoSuchFileException;
import by.alekseyshysh.array.service.ArrayCalculationService;
import by.alekseyshysh.array.service.ArrayChangeElementService;
import by.alekseyshysh.array.service.ArrayReadService;
import by.alekseyshysh.array.service.ArraySearchService;
import by.alekseyshysh.array.service.ArraySortService;

public class FullProjectTest {
	@Test
	public void throwOrNoExceptionsFastTest() throws NoSuchFileException {
		String[] correctLinesString = ArrayReadService.readAllCorrectLines();
		IntArray[] intArrayArray = ArrayReadService.stringArrayToIntArrayArrayWithStream(
							  correctLinesString);
		for (IntArray intArray: intArrayArray) {
			ArrayCalculationService.calculateAverageWithStream(intArray);
			ArrayCalculationService.calculateAverage(intArray);
			ArrayCalculationService.calculateNegativeElementsCount(intArray);
			ArrayCalculationService.calculateNegativeElementsCountWithStream(intArray);
			ArrayCalculationService.calculatePositiveElementsCount(intArray);
			ArrayCalculationService.calculatePositiveElementsCountWithStream(intArray);
			ArrayCalculationService.calculateSum(intArray);
			ArrayCalculationService.calculateSumWithStream(intArray);
			ArrayChangeElementService.setElement(intArray, 1, 10);
			// ArrayChangeElementService.setElementWithStream(intArray, 1, 10);
			ArraySearchService.searchMaxElement(intArray);
			ArraySearchService.searchMaxElementWithStream(intArray);
			ArraySearchService.searchMinElement(intArray);
			ArraySearchService.searchMinElementWithStream(intArray);
			ArraySortService.quickSort(intArray);
			ArraySortService.quickSortWithStream(intArray);
			ArraySortService.shellSort(intArray);
			ArraySortService.shellSortWithStream(intArray);
		}
		
		
	}
}
