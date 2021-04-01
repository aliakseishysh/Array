package by.alekseyshysh.array.reader.impl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.reader.ArrayReader;
import by.alekseyshysh.array.validator.ArrayValidator;

/**
 * 
 * @author AlekseyShysh
 *
 */
public class ArrayReaderImpl implements ArrayReader {

	private static Logger rootLogger = LogManager.getLogger();
	private static final String FILE_READING_PROBLEM_DESCRIPTION = "Problem with file reading";
	
	private void checkFileExistence(Path path) throws ArrayException {
		if (!ArrayValidator.validateFileExistence(path)) {
			throw new ArrayException("file not exists");
		}
	}

	public Path createFilePathFromRelative(String relativeFilePath) throws ArrayException {
		URI uri;
		try {
			uri = getClass().getResource(relativeFilePath).toURI();
		} catch (NullPointerException e) {
			throw new ArrayException("name of the desired resource is null");
		} catch (URISyntaxException e) {
			throw new ArrayException(
					"URL is not formatted strictly according toRFC2396 and cannot be converted to a URI");
		}
		String absolutePath = new File(uri).getAbsolutePath();
		Path path;
		try {
			path = Paths.get(absolutePath);
		} catch (InvalidPathException ipe) {
			throw new ArrayException("path string cannot be converted to a Path");
		}
		checkFileExistence(path);
		return path;
	}

	public Path createFilePathFromAbsolute(String absoluteFilePath) throws ArrayException {
		Path path = Paths.get(absoluteFilePath);
		checkFileExistence(path);
		return path;
	}

	/**
	 * Method to read all lines in the file without validation
	 * 
	 * @param path to file
	 * @return String[] with all lines in the file
	 */
	public List<String> readAllLines(Path path) {
		var arrayList = new ArrayList<String>();
		try (Stream<String> stream = Files.lines(path)) {
			Iterator<String> iterator = stream.iterator();
			while (iterator.hasNext()) {
				String nextLine = iterator.next();
				arrayList.add(nextLine);
			}
		} catch (IOException e) {
			rootLogger.log(Level.ERROR, FILE_READING_PROBLEM_DESCRIPTION);
		}
		return arrayList;
	}

	/**
	 * Method to read specific number of correct lines or LESS if end of lines
	 * 
	 * @param numberOfCorrectLines number of correct lines to read from file
	 * @param path                 to file
	 * @return String[] with correct lines after validation
	 * @throws ArrayNoSuchFileException
	 */
	public String[] readCorrectLines(int numberOfCorrectLines, Path path) {
		int currentNumberOfCorrectLines = 0;
		List<String> arrayList = new ArrayList<>();
		try (Stream<String> stream = Files.lines(path)) {
			Iterator<String> iterator = stream.iterator();
			while (currentNumberOfCorrectLines < numberOfCorrectLines) {
				if (!iterator.hasNext()) {
					break;
				}
				String nextLine = iterator.next();
				if (ArrayValidator.validateString(nextLine)) {
					arrayList.add(nextLine);
					currentNumberOfCorrectLines++;
				} else {
					rootLogger.log(Level.INFO, "Line: {} is not correct", nextLine);
				}
			}
		} catch (IOException e) {
			rootLogger.log(Level.ERROR, FILE_READING_PROBLEM_DESCRIPTION);
		}
		return arrayList.toArray(new String[arrayList.size()]);
	}

	/**
	 * Method to read all correct lines in stream
	 * 
	 * @see #readCorrectLines()
	 * @throws ArrayNoSuchFileException
	 */
	public String[] readAllCorrectLines(Path path) {
		List<String> arrayList = new ArrayList<>();
		try (Stream<String> stream = Files.lines(path)) {
			Iterator<String> iterator = stream.iterator();
			while (iterator.hasNext()) {
				String nextLine = iterator.next();
				if (ArrayValidator.validateString(nextLine)) {
					arrayList.add(nextLine);
				} else {
					rootLogger.log(Level.INFO, "Line: {} is not correct", nextLine);
				}
			}
		} catch (IOException e) {
			rootLogger.log(Level.ERROR, FILE_READING_PROBLEM_DESCRIPTION);
		}
		return arrayList.toArray(new String[arrayList.size()]);
	}
}
