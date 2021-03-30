package by.alekseyshysh.array.parser.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.parser.ArrayFileParser;

public class ArrayFileParserImpl implements ArrayFileParser {

	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 * @param correctLines lines received after validation
	 * @return ArrayList<int[]> object
	 */
	public List<int[]> parseStringsFromFileWithStream(String[] correctLines) {
		var resultList = new ArrayList<int[]>();
		for (String correctLine: correctLines) {
			int[] resultArray = Arrays.stream(correctLine.split(","))
									  .mapToInt(Integer::parseInt)
									  .toArray();
			resultList.add(resultArray);
		}
		return resultList;
	}
	
	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 * @param correctLines lines received after validation
	 * @return ArrayList<int[]> object
	 */
	public List<int[]> parseStringsFromFile(String[] correctLines) {
		var resultList = new ArrayList<int[]>();
		for (String correctLine: correctLines) {
			String[] stringParseResult = correctLine.split(",");
			int[] resultArray = new int[stringParseResult.length];
			for (int j = 0; j < stringParseResult.length; j++) {
				Integer parseValue = Integer.parseInt(stringParseResult[j]);
				resultArray[j] = parseValue;
			}
			resultList.add(resultArray);
		}
		return resultList;
	}
	
	public int[] parseStringFromFileWithStream(String line) throws ArrayException {
		int[] resultArray;
		try {
			resultArray = Arrays.stream(line.split(","))
					  		    .mapToInt(Integer::parseInt)
					  		    .toArray();
		} catch (NumberFormatException nfe) {
			throw new ArrayException("Can't parse number to int");
		}
		return resultArray;
	}
}









