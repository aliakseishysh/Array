package by.alekseyshysh.array.parser;

import java.util.List;

public interface StringIntArrayParser {

	public List<int[]> parseWithStream(String[] correctLines);
	
	public List<int[]> parse(String[] correctLines);
}
