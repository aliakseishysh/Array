package by.alekseyshysh.array.main;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.alekseyshysh.array.creator.IntArrayCreator;
import by.alekseyshysh.array.creator.impl.IntArrayCreatorImpl;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.parser.ArrayFileParser;
import by.alekseyshysh.array.parser.impl.ArrayFileParserImpl;
import by.alekseyshysh.array.reader.ArrayReader;
import by.alekseyshysh.array.reader.impl.ArrayReaderImpl;

public class Main {
	
	private static Logger logger = LogManager.getRootLogger();

	/**
	 * Main positive scenario; without regex validation, but while parsing
	 * You can use another method if you want read with validation: {@link ArrayReader#readAllCorrectLines(Path)}
	 * @param args
	 * @throws ArrayException 
	 */
	public static void main(String[] args) throws ArrayException {
		ArrayReader arrayReader = new ArrayReaderImpl();
		Path path = arrayReader.createPathFromRelative("/data/data.txt");
		List<String> strings = arrayReader.readAllLines(path);
		ArrayFileParser arrayParser = new ArrayFileParserImpl();
		List<int[]> primitiveIntsListArray = arrayParser.parseStringsWithStream(strings);
		IntArrayCreator arrayCreator = new IntArrayCreatorImpl();
		IntArray[] intArrayArray = arrayCreator.createIntArrayArray(primitiveIntsListArray);
		String resultStringForLogger = Arrays.toString(intArrayArray);
		logger.log(Level.INFO, resultStringForLogger);
	}

}
