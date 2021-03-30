package by.alekseyshysh.array.parser.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.parser.StringIntArrayParser;

public class StringIntArrayParserImpl implements StringIntArrayParser {

	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 * @param correctLines lines received after validation
	 * @return ArrayList<int[]> object
	 */
	public List<int[]> parseWithStream(String[] correctLines) {
		int[] resultArray;
		var resultList = new ArrayList<int[]>();
		for (String correctLine: correctLines) {
			resultArray = Arrays.stream(correctLine.split(","))
								.mapToInt(element -> Integer.parseInt(element))
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
	public List<int[]> parse(String[] correctLines) {
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









