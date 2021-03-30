package by.alekseyshysh.array.reader;

import java.nio.file.Path;

import by.alekseyshysh.array.exception.ArrayException;

public interface ArrayReader {

	public String[] readCorrectLines(int numberOfCorrectLines, Path path);

	public String[] readAllCorrectLines(Path path);
	
	public Path createFilePathFromRelative(String relativeFilePath) throws ArrayException;
	
}
