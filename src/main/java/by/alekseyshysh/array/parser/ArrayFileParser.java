package by.alekseyshysh.array.parser;

import java.util.List;

import by.alekseyshysh.array.exception.ArrayException;

public interface ArrayFileParser {

	public List<int[]> parseStringsWithStream(List<String> lines);

	public List<int[]> parseStrings(List<String> lines);

	public int[] parseStringWithStream(String line) throws ArrayException;
}
