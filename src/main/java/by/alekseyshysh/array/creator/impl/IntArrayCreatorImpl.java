package by.alekseyshysh.array.creator.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.alekseyshysh.array.creator.IntArrayCreator;
import by.alekseyshysh.array.entity.IntArray;
import by.alekseyshysh.array.exception.ArrayException;
import by.alekseyshysh.array.parser.FromFileParser;
import by.alekseyshysh.array.parser.impl.FromFileParserImpl;

public class IntArrayCreatorImpl implements IntArrayCreator {
	
	private static final Logger logger = LogManager.getLogger();

	public IntArray[] createIntArrayArray(List<int[]> arrayList) throws ArrayException {
		
		IntArray[] result = arrayList.stream()
					 				 .map(array -> {
										try {
											return createIntArray(array);
										} catch (ArrayException e) {
											return new int[0];
										}
									})
					 				 .collect(Collectors.toList())
					 				 .toArray(new IntArray[0]);

		return result;
	}

	public IntArray createIntArray(int[] array) throws ArrayException {
		if (array == null) {
			throw new ArrayException(IntArrayCreatorImpl.class.getName() 
					+ ": can't create IntArray with null array");
		}
		IntArray intArray = new IntArray(array);
		return intArray;
	}
	
	public IntArray createIntArray(String arrayString) throws ArrayException {
		FromFileParser parser = new FromFileParserImpl();
		if (arrayString == null) {
			throw new ArrayException(IntArrayCreatorImpl.class.getName() 
					+ ": can't create IntArray with null array");
		}
		int [] array = parser.parseStringFromFileWithStream(arrayString);
		IntArray intArray = new IntArray(array);
		return intArray;
	}

}
