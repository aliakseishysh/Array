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
	private static final String SPLITTER = ",";
	
	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 */
	public List<int[]> parseStringsWithStream(List<String> lines) {
		var resultList = new ArrayList<int[]>();
		for (String line : lines) {
			try {
				int[] resultArray = Arrays.stream(line.split(SPLITTER)).mapToInt(Integer::parseInt).toArray();
				resultList.add(resultArray);
			} catch (NumberFormatException  nfe) {
				rootLogger.log(Level.ERROR, "Can not parse string \'{}\' to int", line);
			}
		}
		return resultList;
	}

	/**
	 * Converting String[] to ArrayList<int[]>
	 * 
	 */
	public List<int[]> parseStrings(List<String> lines) {
		var resultList = new ArrayList<int[]>();
		for (String line : lines) {
			String[] stringParseResult = line.split(SPLITTER);
			int[] resultArray = new int[stringParseResult.length];
			try {
				for (int j = 0; j < stringParseResult.length; j++) {
					Integer parseValue = Integer.parseInt(stringParseResult[j]);
					resultArray[j] = parseValue;
				}
				resultList.add(resultArray);
			} catch (NumberFormatException nfe) {
				rootLogger.log(Level.ERROR, "Can not parse string \'{}\' to int", line);
			}
		}
		return resultList;
	}

	public int[] parseStringWithStream(String line) throws ArrayException {
		int[] resultArray;
		try {
			resultArray = Arrays.stream(line.split(SPLITTER)).mapToInt(Integer::parseInt).toArray();
		} catch (NumberFormatException nfe) {
			throw new ArrayException("Can not parse string \'" + line + "\' to int");
		}
		return resultArray;
	}
}
