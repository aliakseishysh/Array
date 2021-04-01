package by.alekseyshysh.array.reader;

import java.nio.file.Path;
import java.util.List;

import by.alekseyshysh.array.exception.ArrayException;

public interface ArrayReader {

	public Path createPathFromRelative(String relativeFilePath) throws ArrayException;

	public Path createPathFromAbsolute(String absoluteFilePath) throws ArrayException;

	public List<String> readAllLines(Path path);

	public String[] readCorrectLines(int numberOfCorrectLines, Path path);

	public String[] readAllCorrectLines(Path path);

}
