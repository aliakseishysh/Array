package by.alekseyshysh.array.service;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.exception.ExceptionUtils;

import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.NoSuchFileFoundedException;

import by.alekseyshysh.array.validation.LineValidator;

// TODO Rewrite this trash
/**
 * 
 * @author AlekseyShysh
 *
 */
public abstract class ArrayReadService {
	
	private static Logger logger = LogManager.getLogger(ArrayReadService.class.getName());
	private static Logger rootLogger = LogManager.getLogger();

	private static final String ARRAYS_DATA_RELATIVE_PATH = "src/resources/arraysData.txt";
	
	private static Path createFilePath() {
		String absolutePath = new File(ARRAYS_DATA_RELATIVE_PATH).getAbsolutePath();
		Path path = Paths.get(absolutePath);
		return path;
	}
	
	/**
	 * 
	 * @return new open Stream<String> for file reading
	 * @throws NoSuchFileFoundedException
	 */
	private static Stream<String> createFileStream() throws NoSuchFileFoundedException {	   
		Stream<String> linesStream = null;
		if (Files.notExists(createFilePath())) {
			logger.log(Level.FATAL, "NoSuchFileException");
			throw new NoSuchFileFoundedException();
		}
		/* TODO i dont't understand why i should handle this, 
		 * because i checked it few lines before; 
		 * standard NoSuchFileException extends from IOException
		 * maybe because if file system can't open this file?
		 *  */
		try {
			linesStream = Files.lines(createFilePath());
		} catch (IOException e) {
			rootLogger.log(Level.FATAL, e.getClass().getSimpleName());
		}
		return linesStream;
	}
	
	/**
	 * Method to read specific number of correct lines or LESS if end of lines
	 * 
	 * @param numberOfCorrectLines number of correct lines to read from file
	 * @return String[] with correct lines after validation
	 * @throws NoSuchFileFoundedException
	 */
	public static String[] readCorrectLines(int numberOfCorrectLines) throws NoSuchFileFoundedException {
		Stream<String> linesStream = createFileStream();
		ArrayList<String> arrayList = new ArrayList<String>();
		Iterator<String> streamIterator = linesStream.iterator();
		int currentNumberOfCorrectLines = 0;
		/* 
		 * TODO should i wrap it into try-catch? and linesStream.close() in finally?
		 * with very big files it may just crash if file disappear
		 * 
		 */
		while (currentNumberOfCorrectLines < numberOfCorrectLines) {
			if (streamIterator.hasNext()) {
				String nextLine = streamIterator.next();
				if (LineValidator.validate(nextLine)) {
					arrayList.add(nextLine);
				}
			} else {
				break;
			}
		}
		linesStream.close();
		logger.log(Level.DEBUG, Arrays.toString(arrayList.toArray()));
		return arrayList.toArray(new String[arrayList.size()]);
	}
	
	/**
	 * Method to read all correct lines in stream
	 * @see #readCorrectLines()
	 * @throws NoSuchFileFoundedException
	 */
	public static String[] readAllCorrectLines() throws NoSuchFileFoundedException {
		Stream<String> linesStream = createFileStream();
		int numberOfLines = (int) linesStream.count();
		linesStream.close();
		return readCorrectLines(numberOfLines);
	}
	
	// TODO it's ok with method name?
	/**
	 * Converting String[] to IntArray[]
	 * TODO PART 3: REWRITE THIS TRASH, can't even think now
	 * 
	 * @param correctLines lines received after validation
	 *  	  by.alekseyshysh.array.validation.LineValidator.validate
	 * @return IntArray[] object
	 */
	public static IntArray[] stringArrayToIntArrayArrayWithStream(String[] correctLines) {
		IntArray[] intArray = new IntArray[correctLines.length];
		int i = 0;
		for (String correctLine : correctLines) {
			int[] splitResult = Arrays.stream(correctLine.split(","))
					.mapToInt(element -> Integer.parseInt(element))
					.toArray();
			intArray[i] = new IntArray(splitResult);
			i++;
		}
		return intArray;
	}
	
	// TODO it's ok with method name?
	/**
	 * Converting String[] to IntArray[]
	 * 
	 * @param correctLines lines received after validation
	 * @return IntArray[] object
	 */
	public static IntArray[] stringArrayToIntArrayArray(String[] correctLines) {
		IntArray[] intArray = new IntArray[correctLines.length];
		for (int j = 0; j < correctLines.length; j++) {
			String[] splitResult = correctLines[j].split(",");
			int[] result = new int[splitResult.length];
			for (int i = 0; i < splitResult.length; i++) {
				result[i] = Integer.parseInt(splitResult[i]);
			}
			intArray[j] = new IntArray(result);
		}
		return intArray;
	}	
}
