package by.alekseyshysh.array.parser.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.parser.ArrayFileParser;

public class ArrayFileParserImpl implements ArrayFileParser {

	private static Logger rootLogger = LogManager.getLogger();
	private static final String INT_PARSE_DESCRIPTION = "Can't parse string to int";
	
	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 * @param correctLines lines received after validation
	 * @return ArrayList<int[]> object
	 */
	public List<int[]> parseStringsFromFileWithStream(String[] correctLines) {
		var resultList = new ArrayList<int[]>();
		for (String correctLine : correctLines) {
			try {
				int[] resultArray = Arrays.stream(correctLine.split(",")).mapToInt(Integer::parseInt).toArray();
				resultList.add(resultArray);
			} catch (NumberFormatException  nfe) {
				rootLogger.log(Level.ERROR, INT_PARSE_DESCRIPTION);
			}
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
		for (String correctLine : correctLines) {
			String[] stringParseResult = correctLine.split(",");
			int[] resultArray = new int[stringParseResult.length];
			try {
				for (int j = 0; j < stringParseResult.length; j++) {
					Integer parseValue = Integer.parseInt(stringParseResult[j]);
					resultArray[j] = parseValue;
				}
				resultList.add(resultArray);
			} catch (NumberFormatException nfe) {
				rootLogger.log(Level.ERROR, INT_PARSE_DESCRIPTION);
			}
		}
		return resultList;
	}

	public int[] parseStringFromFileWithStream(String line) throws ArrayException {
		int[] resultArray;
		try {
			resultArray = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
		} catch (NumberFormatException nfe) {
			throw new ArrayException(INT_PARSE_DESCRIPTION);
		}
		return resultArray;
	}
}
