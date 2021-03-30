package by.alekseyshysh.array.parser.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.alekseyshysh.array.parser.StringIntArrayParser;

public class StringIntArrayParserImpl implements StringIntArrayParser {

	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 * @param correctLines lines received after validation
	 * @return ArrayList<int[]> object
	 */
	public List<int[]> parseStringsFromFileWithStream(String[] correctLines) {
		int[] resultArray;
		var resultList = new ArrayList<int[]>();
		for (String correctLine: correctLines) {
			resultArray = Arrays.stream(correctLine.split(","))
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
		int[] resultArray;
		var resultList = new ArrayList<int[]>();
		for (String correctLine: correctLines) {
			String[] stringParseResult = correctLine.split(",");
			resultArray = new int[stringParseResult.length];
			for (int j = 0; j < stringParseResult.length; j++) {
				Integer parseValue = Integer.parseInt(stringParseResult[j]);
				resultArray[j] = parseValue;
			}
			resultList.add(resultArray);
		}
		return resultList;
	}
}









