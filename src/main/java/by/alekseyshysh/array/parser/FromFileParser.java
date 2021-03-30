package by.alekseyshysh.array.parser;

import java.util.List;

import by.alekseyshysh.array.exception.ArrayException;

public interface FromFileParser {

	public List<int[]> parseStringsFromFileWithStream(String[] correctLines);
	
	public List<int[]> parseStringsFromFile(String[] correctLines);
	
	public int[] parseStringFromFileWithStream(String line) throws ArrayException;
}
