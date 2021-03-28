package by.alekseyshysh.array.reader.impl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.reader.ArrayReadInterface;
import by.alekseyshysh.array.validator.LineValidatorInterface;
import by.alekseyshysh.array.validator.impl.LineValidator;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class ArrayReadAction implements ArrayReadInterface {
	
	private static Logger logger = LogManager.getLogger(ArrayReadAction.class.getName());
	private static Logger rootLogger = LogManager.getLogger();
	private static final String ARRAYS_DATA_RELATIVE_PATH_STANDARD = "/data/data.txt";

	public void pathCheck(Path path) {
		if (Files.notExists(path)) {
			logger.log(Level.ERROR, "No such file");
		}
	}
	
	public Path createFilePathFromRelative() throws ArrayException {
		URI uri;
		try {
			uri = getClass().getResource(ARRAYS_DATA_RELATIVE_PATH_STANDARD).toURI();
		} catch (URISyntaxException e) {
			throw new ArrayException();
		}
		String absolutePath = new File(uri).getAbsolutePath();
		Path path = Paths.get(absolutePath);
		pathCheck(path);
		return path;
	}
	

	/**
	 * Method to read specific number of correct lines or LESS if end of lines
	 * 
	 * @param numberOfCorrectLines number of correct lines to read from file
	 * @return String[] with correct lines after validation
	 * @throws ArrayNoSuchFileException
	 */
	public String[] readCorrectLines(int numberOfCorrectLines, Path path) {
		int currentNumberOfCorrectLines = 0;
		ArrayList<String> arrayList = new ArrayList<>();
		LineValidatorInterface lineValidator = new LineValidator();
		try (Stream<String> stream = Files.lines(path)) {
			Iterator<String> iterator = stream.iterator();
			while (currentNumberOfCorrectLines < numberOfCorrectLines) {
				if (!iterator.hasNext()) {
					break;
				}
				String nextLine = iterator.next();
				if (lineValidator.validate(nextLine)) {
					arrayList.add(nextLine);
					currentNumberOfCorrectLines++;
				} else {
					logger.log(Level.INFO, "Line: {0} is not correct", nextLine);
				}
			}
		} catch (IOException e) {
			rootLogger.log(Level.ERROR, "Problem with file reading");
		}
		return arrayList.toArray(new String[arrayList.size()]);
	}
	
	/**
	 * Method to read all correct lines in stream
	 * @see #readCorrectLines()
	 * @throws ArrayNoSuchFileException
	 */
	public String[] readAllCorrectLines(Path path) {
		LineValidatorInterface lineValidator = new LineValidator();
		ArrayList<String> arrayList = new ArrayList<>();
		try (Stream<String> stream = Files.lines(path)) {
			Iterator<String> iterator = stream.iterator();
			while (iterator.hasNext()) {
				String nextLine = iterator.next();
				if (lineValidator.validate(nextLine)) {
					arrayList.add(nextLine);
				} else {
					logger.log(Level.INFO, "Line: {0} is not correct", nextLine);
				}
			}
		} catch (IOException e) {
			rootLogger.log(Level.ERROR, "Problem with file reading");
		}
		return arrayList.toArray(new String[arrayList.size()]);
	}
	
	

}
