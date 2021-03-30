package by.alekseyshysh.array.parser;

import java.util.List;

public interface StringIntArrayParser {

	public List<int[]> parseStringsFromFileWithStream(String[] correctLines);
	
	public List<int[]> parseStringsFromFile(String[] correctLines);
}
