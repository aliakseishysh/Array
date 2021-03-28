package by.alekseyshysh.array.reader;

import java.nio.file.Path;

import by.alekseyshysh.array.exception.ArrayException;

public interface ArrayReadInterface {

	public void pathCheck(Path path);
	
	public String[] readCorrectLines(int numberOfCorrectLines, Path path);

	public String[] readAllCorrectLines(Path path);
	
	public Path createFilePathFromRelative() throws ArrayException;
	
}
